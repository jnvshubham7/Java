
import java.io.*;
import java.util.concurrent.*;

class CSRMatrix {
    double[] data;
    int[] columnIndices;
    int[] rowPointers;
    int rows;
    int cols;
    
    int nnz;
}

class DenseVector {
    double[] data;
    int size;
}

class ThreadArgs {
    CSRMatrix matrix;
    DenseVector vector;
    DenseVector result;
    int start;
    int end;
}

public class Main {
    public static void main(String[] args) {
        String sparseMatrixFile = "input1.mtx";
        String denseVectorFile = "vector1.txt";
        int numThreads;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of threads: ");
        try {
            numThreads = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        CSRMatrix matrix = readSparseMatrix(sparseMatrixFile);
        DenseVector vector = readDenseVector(denseVectorFile);

        // Sequential SpMM
        DenseVector seqResult = sequentialMatrixVectorMultiply(matrix, vector);
        System.out.println("Sequential Result:");
        printVector(seqResult);

        // Parallel SpMM
        DenseVector parallelResult = new DenseVector();
        parallelResult.size = matrix.rows;
        parallelResult.data = new double[matrix.rows];

        Thread[] threads = new Thread[numThreads];
        ThreadArgs[] threadArgs = new ThreadArgs[numThreads];

        int chunkSize = matrix.rows / numThreads;
        for (int i = 0; i < numThreads; ++i) {
            threadArgs[i] = new ThreadArgs();
            threadArgs[i].matrix = matrix;
            threadArgs[i].vector = vector;
            threadArgs[i].result = parallelResult;
            threadArgs[i].start = i * chunkSize;
            threadArgs[i].end = (i == numThreads - 1) ? matrix.rows : (i + 1) * chunkSize;
            threads[i] = new Thread(() -> parallelMatrixVectorMultiply(threadArgs[i]));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Parallel Result:");
        printVector(parallelResult);
    }

    static CSRMatrix readSparseMatrix(String filename) {
        CSRMatrix matrix = new CSRMatrix();
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            // Read metadata
            String[] metadata = file.readLine().split(" ");
            int numRows = Integer.parseInt(metadata[0]);
            int numCols = Integer.parseInt(metadata[1]);
            int nnz = Integer.parseInt(metadata[2]);

            matrix.rows = numRows;
            matrix.cols = numCols;
            matrix.nnz = nnz;
            matrix.rowPointers = new int[numRows + 1];
            matrix.data = new double[nnz];
            matrix.columnIndices = new int[nnz];

            matrix.rowPointers[0] = 0;
            int currentIndex = 0;
            for (int i = 0; i < nnz; ++i) {
                String[] values = file.readLine().split(" ");
                int row = Integer.parseInt(values[0]);
                int col = Integer.parseInt(values[1]);
                double value = Double.parseDouble(values[2]);
                matrix.data[currentIndex] = value;
                matrix.columnIndices[currentIndex] = col;
                if (row != matrix.rowPointers[currentIndex / numCols]) {
                    matrix.rowPointers[row] = currentIndex;
                }
                currentIndex++;
            }

            return matrix;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
            return null;
        }
    }

    static DenseVector readDenseVector(String filename) {
        DenseVector vector = new DenseVector();
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            int size = Integer.parseInt(file.readLine());
            vector.size = size;
            vector.data = new double[size];

            for (int i = 0; i < size; ++i) {
                vector.data[i] = Double.parseDouble(file.readLine());
            }

            return vector;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
            return null;
        }
    }

    static DenseVector sequentialMatrixVectorMultiply(CSRMatrix matrix, DenseVector vector) {
        DenseVector result = new DenseVector();
        result.size = matrix.rows;
        result.data = new double[matrix.rows];

        for (int i = 0; i < matrix.rows; ++i) {
            int start = matrix.rowPointers[i];
            int end = matrix.rowPointers[i + 1];
            for (int j = start; j < end; ++j) {
                int col = matrix.columnIndices[j];
                double value = matrix.data[j];
                result.data[i] += value * vector.data[col];
            }
        }

        return result;
    }

    static void parallelMatrixVectorMultiply(ThreadArgs threadArgs) {
        CSRMatrix matrix = threadArgs.matrix;
        DenseVector vector = threadArgs.vector;
        DenseVector result = threadArgs.result;

        for (int i = threadArgs.start; i < threadArgs.end; ++i) {
            int start = matrix.rowPointers[i];
            int end = matrix.rowPointers[i + 1];
            for (int j = start; j < end; ++j) {
                int col = matrix.columnIndices[j];
                double value = matrix.data[j];
                result.data[i] += value * vector.data[col];
            }
        }
    }

    static void printVector(DenseVector vector) {
        for (int i = 0; i < vector.size; ++i) {
            System.out.print(vector.data[i] + " ");
        }
        System.out.println();
    }
}
