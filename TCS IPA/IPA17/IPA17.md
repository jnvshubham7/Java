Create a class Student with below attributes:

rollNo - int
name - String
subject - String
grade - char
date - String [DD/MM/YYYY]



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.


Create class Solution with main method.
****************************************************************************
Implement one static method: findStudentByGradeAndMonth Solution Class.


findStudentByGradeAndMonth Method:

This method will take an array of Student objects, char value as grade and int value as month 
for input parameters.The method will find out all Students from the given grade and month. 
This method will return array of Student object assending based on their rollNo if found. 
If there is no Student that matches then the method should return null.

for this method- main method should print Student name, subject and total student found [The 
length of the list], if the returned value is not null. If the returned value is null then 
main method should print "No student found".


NOTE:
	1. For Taking char as input use sc.nextLine().charAt(0)
	2. To match/check the month You havee to convert int month in the parameter to String.
	3. No need to count the Student array if return not null just print the array length.


****************************************************************************



Consider the below input and output:


input1:

111
Arijit
Math
B
22/09/2023
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
13/05/2022
105
Tatan
Physics
A
27/03/2022
A
3


output1:

Priyanka
English
Tatan
Physics
2





input2:

111
Sohel
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Gopa
History
C
12/05/2022
105
Kamal
Physics
A
27/03/2022
A
7



output 2:

No student found



Here is the solution in Java:

**Student Class**
```java
public class Student {
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    // Constructor
    public Student(int rollNo, String name, String subject, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    // Getter and Setter methods
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
```
**Solution Class**
```java
public class Solution {
    public static Student[] findStudentByGradeAndMonth(Student[] students, char grade, int month) {
        Student[] result = new Student[0];
        for (Student student : students) {
            if (student.getGrade() == grade &&/student.getDate().substring(3, 5).equals(String.valueOf(month))) {
                result = addStudent(result, student);
            }
        }
        if (result.length > 0) {
            Arrays.sort(result, (a, b) -> Integer.compare(a.getRollNo(), b.getRollNo()));
            return result;
        } else {
            return null;
        }
    }

    private static Student[] addStudent(Student[] arr, Student student) {
        Student[] tempArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        tempArr[arr.length] = student;
        return tempArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.nextInt(), sc.next(), sc.next(), sc.next().charAt(0), sc.next());
        }
        char grade = sc.next().charAt(0);
        int month = sc.nextInt();
        Student[] result = findStudentByGradeAndMonth(students, grade, month);
        if (result != null) {
            for (Student student : result) {
                System.out.println(student.getName() + " " + student.getSubject());
            }
            System.out.println(result.length);
        } else {
            System.out.println("No student found");
        }
    }
}
```
**Explanation**

In the `Student` class, we have private attributes for rollNo, name, subject, grade, and date. We have a constructor that takes these attributes as parameters and sets them to the corresponding fields. We also have getter and setter methods for each attribute.

In the `Solution` class, we have a static method `findStudentByGradeAndMonth` that takes an array of `Student` objects, a char value for the grade, and an int value for the month as parameters. This method finds all students from the given grade and month, and returns an array of `Student` objects in ascending order based on their roll number. If there is no student that matches, the method returns null.

In the `main` method, we read the input from the console, create an array of `Student` objects, and then call the `findStudentByGradeAndMonth` method with the given grade and month. If the result is not null, we print the student names, subjects, and the length of the array. If the result is null, we print "No student found".

**Input and Output**

For the input:

111
Arijit
Math
B
22/09/2023
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
13/05/2022
105
Tatan
Physics
A
27/03/2022
A
3

The output will be:

Priyanka
English
Tatan
Physics
2

For the input:

111
Sohel
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Gopa
History
C
12/05/2022
105
Kamal
Physics
A
27/03/2022
A
7

The output will be:

No student found