import java.util.Arrays;
import java.util.Arrays;

public class arrays {

    // dataType[] varName = {elemOne, elemTwo, elemThree, elemN};

    // dataType[] varName = new dataType[arrayLength];

    // varName[0] = valueOne;
    // varName[1] = valueTwo;
    // varName[n] = valueN;

public static void main(String[] args) {

     // Initialization of arrays
    int[] sem_1_marks = {90, 80, 70, 60, 50};
    String[] sem_1_sub = {"Maths", "Physics", "Chemistry", "English", "Hindi"};

    Arrays.sort(sem_1_marks);
    // Arrays.sort(sem_1_marks);

    // Print the entire arrays
    System.out.println("Semester 1 Marks: " + Arrays.toString(sem_1_marks));
    System.out.println("Semester 1 Subjects: " + Arrays.toString(sem_1_sub));

    // Print individual array elements
    System.out.println("1. " + sem_1_sub[0] + ": " + sem_1_marks[0]);
    System.out.println("2. " + sem_1_sub[1] + ": " + sem_1_marks[1]);
    System.out.println("3. " + sem_1_sub[2] + ": " + sem_1_marks[2]);
    System.out.println("4. " + sem_1_sub[3] + ": " + sem_1_marks[3]);
     System.out.println("5. " + sem_1_sub[4] + ": " + sem_1_marks[4]);


}

    
    
    
}
