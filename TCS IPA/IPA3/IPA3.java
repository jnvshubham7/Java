import java.util.*;

public class IPA3 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            int rollNo = sc.nextInt();
            sc.nextLine();  // Consume newline
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double score = sc.nextDouble();
            boolean dayScholar = sc.nextBoolean();
            students[i] = new Student(rollNo, name, branch, score, dayScholar);
        }

        int count = findCountOfDayscholarStudents(students);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("There are no such dayscholar students");
        }

        Student secondHighestScoreStudent = findStudentwithSecondHighestScore(students);
        if (secondHighestScoreStudent != null) {
            System.out.println(secondHighestScoreStudent.getRollNo() + "#" + secondHighestScoreStudent.getName() + "#" + secondHighestScoreStudent.getScore());
        } else {
            System.out.println("There are no student from non day scholar");
        }
    }

    public static int findCountOfDayscholarStudents(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s.getDayScholar() && s.getScore() > 80) {
                count++;
            }
        }
        return count;
    }

    public static Student findStudentwithSecondHighestScore(Student[] students) {
        List<Student> nonDayScholars = new ArrayList<>();
        for (Student s : students) {
            if (!s.getDayScholar()) {
                nonDayScholars.add(s);
            }
        }

        if (nonDayScholars.size() < 2) {
            return null;
        }

        nonDayScholars.sort((s1, s2) -> Double.compare(s2.getScore(), s1.getScore()));
        return nonDayScholars.get(1);
    }
}

class Student {
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean getDayScholar() {
        return dayScholar;
    }

    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }
}
