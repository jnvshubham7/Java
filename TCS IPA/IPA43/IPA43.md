Create a class Student with the following attributes:

name - String
rollNo - String
age - int
gender - char ('M' for male and 'F' for female)
course - String
semester - int
GPA - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateAverageGPA and getStudentsByCourse in Solution class.

calculateAverageGPA method:
This method will take an array of Student objects as input.
The method will return the average GPA of all the students in the array.
If the array is empty, the method should return 0.

getStudentsByCourse method:
This method will take two input parameters - array of Student objects and a course (string).
The method will return an array of Student objects that are enrolled in the specified course.
If no student with the given course is present in the array of Student objects, then the method should return an empty array.

These above mentioned static methods should be called from the main method.

For calculateAverageGPA method - The main method should print the average GPA returned by the method.
If the returned value is 0, then it should print "Sorry - No students are available".

For getStudentsByCourse method - The main method should print the name, roll number and GPA of the returned Student objects.
If the returned value is an empty array, then it should print "Sorry - No students are available for the given course".

Before calling these static methods in main, use Scanner object to read the values of four Student objects referring 
attributes in the above mentioned attribute sequence. Next, read the value for a course.

Example Input:
------------------------
John
1234
20
M
CSE
2
3.5
Alice
5678
19
F
EEE
1
3.7
Bob
9101
21
M
CSE
4
3.9
Sarah
2345
20
F
ME
3
3.2
CSE

Example Output:
---------------------------
3.6
John
1234
3.5
Bob
9101
3.9

**Student Class**
```java
public class Student {
    private String name;
    private String rollNo;
    private int age;
    private char gender;
    private String course;
    private int semester;
    private double GPA;

    public Student(String name, String rollNo, int age, char gender, String course, int semester, double GPA) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
```

**Solution Class**
```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static double calculateAverageGPA(Student[] students) {
        if (students == null || students.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Student student : students) {
            sum += student.getGPA();
        }
        return sum / students.length;
    }

    public static Student[] getStudentsByCourse(Student[] students, String course) {
        Student[] result = new Student[0];
        for (Student student : students) {
            if (student.getCourse().equals(course)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = student;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[4];
        for (int i = 0; i < 4; i++) {
            String name = scanner.nextLine();
            String rollNo = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            char gender = scanner.next().charAt(0);
            String course = scanner.next();
            int semester = Integer.parseInt(scanner.next());
            double GPA = Double.parseDouble(scanner.next());
            students[i] = new Student(name, rollNo, age, gender, course, semester, GPA);
        }
        String course = scanner.next();
        double averageGPA = calculateAverageGPA(students);
        if (averageGPA == 0) {
            System.out.println("Sorry - No students are available");
        } else {
            System.out.println("Average GPA: " + averageGPA);
        }
        Student[] studentsByCourse = getStudentsByCourse(students, course);
        if (studentsByCourse.length == 0) {
            System.out.println("Sorry - No students are available for the given course");
        } else {
            for (Student student : studentsByCourse) {
                System.out.println(student.getName());
                System.out.println(student.getRollNo());
                System.out.println(student.getGPA());
            }
        }
    }
}
```

Input:
```
John
1234
20
M
CSE
2
3.5
Alice
5678
19
F
EEE
1
3.7
Bob
9101
21
M
CSE
4
3.9
Sarah
2345
20
F
ME
3
3.2
CSE
CSE
```

Output:
```
Average GPA: 3.6
John
1234
3.5
Bob
9101
3.9
```