Create a class called Student with the below attributes:

rollNo - int
name - String
branch - String
score - double
dayScholar - boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods -findCountOfDayscholarStudents  and findStudentwithSecondHighestScore in Solution 
class.

findCountOfDayscholarStudents:

This method will take an array of Student objects as an input parameter . This method will calculate and return 
the count of Students whose score is greater than 80 and who are all from dayScholar.

If no Student scored greater than 80 and from dayScholar are present in the array of Student objects, then the
method should return 0.

findStudentwithSecondHighestScore:

This method will take an array of Student objects as an input parameter. This method will return the object 
of the second highest score student from the array of Student objects who are not from the dayScholar.

If no Student is a dayScholar  in the array of Student objects, then the method should return null.

Note : All the searches should be case insensitive.

The combination of dayScholar and score for each student is always unique.

The above mentioned static methods should be called from the main method.

For findCountOfDayscholarStudents method - The main method should print the returned count as it is 
if the returned value is greater than 0, else it should print "There are no such dayscholar students".

For findStudentwithSecondHighestScore method - The main method should print the rollNo, name and score 
in the below format from the returned object if the retuned value is not null.

rollNo#name#score

If the returned value is null, then it should print ”There are no student from non day scholar”

Before calling these static methods in main, use Scanner object to read the values of four Student 
objects referring attributes in the above mentioned attribute sequence. 
Consider below sample input and output:

Input:

1001
Ashwa
IT
85
true
1002
Preeti
IT
70
false
1003
Uma
ECE
85
false
1004
Akash
EEE
90
true


Output:
2
1002#Preeti#70.0


Here is the solution in Java:
```
**Student Class**
```java
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

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getScore() {
        return score;
    }

    public boolean isDayScholar() {
        return dayScholar;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }
}
```
**Solution Class**
```java
import java.util.Scanner;

class Solution {
    static int findCountOfDayscholarStudents(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.isDayScholar() && student.getScore() > 80) {
                count++;
            }
        }
        return count;
    }

    static Student findStudentwithSecondHighestScore(Student[] students) {
        Student highestScoreStudent = null;
        Student secondHighestScoreStudent = null;
        for (Student student : students) {
            if (!student.isDayScholar()) {
                if (highestScoreStudent == null || student.getScore() > highestScoreStudent.getScore()) {
                    secondHighestScoreStudent = highestScoreStudent;
                    highestScoreStudent = student;
                } else if (secondHighestScoreStudent == null || student.getScore() > secondHighestScoreStudent.getScore()) {
                    secondHighestScoreStudent = student;
                }
            }
        }
        return secondHighestScoreStudent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter rollNo:");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            System.out.println("Enter name:");
            String name = scanner.nextLine();

            System.out.println("Enter branch:");
            String branch = scanner.nextLine();

            System.out.println("Enter score:");
            double score = scanner.nextDouble();
            scanner.nextLine(); // consume newline left-over

            System.out.println("Is day Scholar?");
            boolean dayScholar = scanner.nextBoolean();
            scanner.nextLine(); // consume newline left-over

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
}
```
**Explanation**

The `Student` class has private attributes with getters and setters, as well as a parameterized constructor.

The `Solution` class has two static methods: `findCountOfDayscholarStudents` and `findStudentwithSecondHighestScore`. The `findCountOfDayscholarStudents` method iterates through the array of `Student` objects and counts the number of students who are day scholars and have a score greater than 80. The `findStudentwithSecondHighestScore` method iterates through the array of `Student` objects and finds the student with the second highest score who is not a day scholar.

In the `main` method, we use a `Scanner` object to read the values of four `Student` objects and store them in an array. We then call the two static methods and print the results.

**Input**

The input is the same as mentioned in the problem statement:

```
1001
Ashwa
IT
85
true
1002
Preeti
IT
70
false
1003
Uma
ECE
85
false
1004
Akash
EEE
90
true
```

**Output**

The output is:

```
2
1002#Preeti#70.0
```

This output indicates that there are two students who are day scholars and have a score greater than 80, and that the student with the second highest score who is not a day scholar is student 1002 with a score of 70.0.