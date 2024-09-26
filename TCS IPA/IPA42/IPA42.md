Create a class Person with the following attributes:

firstName - String
lastName - String
age - int
gender - char ('M' for male and 'F' for female)

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Student that extends the Person class and adds the following attributes:

rollNo - String
course - String
semester - int
GPA - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Faculty that extends the Person class and adds the following attributes:

employeeId - String
department - String
designation - String
salary - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - findHighestGPAStudent and findHighestPaidFaculty in Solution class.

findHighestGPAStudent method:
This method will take an array of Student objects as input.
The method will return the Student object with the highest GPA.
If the array is empty, the method should return null.

findHighestPaidFaculty method:
This method will take an array of Faculty objects as input.
The method will return the Faculty object with the highest salary.
If the array is empty, the method should return null.

These above mentioned static methods should be called from the main method.

For findHighestGPAStudent method - The main method should print the roll number, course and GPA of the returned Student object.
If the returned value is null then it should print "Sorry - No student is available".

For findHighestPaidFaculty method - The main method should print the employee ID, department and salary of the returned 
Faculty object.
If the returned value is null then it should print "Sorry - No faculty is available".

Before calling these static methods in main, use Scanner object to read the values of two Student objects and two Faculty 
objects referring attributes in the above mentioned attribute sequence.

Example Input:

First1
Last1
20
M
Roll1
Course1
2
3.8
First2
Last2
21
F
Roll2
Course2
3
3.9
Faculty1
Last3
35
M
ID1
Department1
Associate Professor
90000.0
Faculty2
Last4
40
F
ID2
Department2
Professor
100000.0

Output:

Roll2
Course2
3.9
ID2
Department2
100000.0

**Question**

Create a class Person with the following attributes:

* `firstName` - String
* `lastName` - String
* `age` - int
* `gender` - char ('M' for male and 'F' for female)

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

**Java Code**
```java
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}
```
**Explanation**

The `Person` class has four attributes: `firstName`, `lastName`, `age`, and `gender`. We create a parameterized constructor to initialize these attributes, and provide getter and setter methods for each attribute.

**New Question**

Create a class Student that extends the Person class and adds the following attributes:

* `rollNo` - String
* `course` - String
* `semester` - int
* `GPA` - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

**Java Code**
```java
public class Student extends Person {
    private String rollNo;
    private String course;
    private int semester;
    private double GPA;

    public Student(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double GPA) {
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
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
**Explanation**

The `Student` class extends the `Person` class and adds four new attributes: `rollNo`, `course`, `semester`, and `GPA`. We create a parameterized constructor to initialize these attributes, and provide getter and setter methods for each attribute.

**New Question**

Create a class Faculty that extends the Person class and adds the following attributes:

* `employeeId` - String
* `department` - String
* `designation` - String
* `salary` - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

**Java Code**
```java
public class Faculty extends Person {
    private String employeeId;
    private String department;
    private String designation;
    private double salary;

    public Faculty(String firstName, String lastName, int age, char gender, String employeeId, String department, String designation, double salary) {
        super(firstName, lastName, age, gender);
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
```
**Explanation**

The `Faculty` class extends the `Person` class and adds four new attributes: `employeeId`, `department`, `designation`, and `salary`. We create a parameterized constructor to initialize these attributes, and provide getter and setter methods for each attribute.

**New Question**

Create a class Solution with the main method.

Implement two static methods - `findHighestGPAStudent` and `findHighestPaidFaculty` in `Solution` class.

`findHighestGPAStudent` method:

* This method will take an array of `Student` objects as input.
* The method will return the `Student` object with the highest GPA.
* If the array is empty, the method should return null.

`findHighestPaidFaculty` method:

* This method will take an array of `Faculty` objects as input.
* The method will return the `Faculty` object with the highest salary.
* If the array is empty, the method should return null.

**Java Code**
```java
public class Solution {
    public static Student findHighestGPAStudent(Student[] students) {
        if (students == null || students.length == 0) {
            return null;
        }
        Student highestGPAStudent = students[0];
        for (Student student : students) {
            if (student.getGPA() > highestGPAStudent.getGPA()) {
                highestGPAStudent = student;
            }
        }
        return highestGPAStudent;
    }

    public static Faculty findHighestPaidFaculty(Faculty[] faculties) {
        if (faculties == null || faculties.length == 0) {
            return null;
        }
        Faculty highestPaidFaculty = faculties[0];
        for (Faculty faculty : faculties) {
            if (faculty.getSalary() > highestPaidFaculty.getSalary()) {
                highestPaidFaculty = faculty;
            }
        }
        return highestPaidFaculty;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for two Student objects
        String firstName1 = scanner.nextLine();
        String lastName1 = scanner.nextLine();
        int age1 = scanner.nextInt();
        char gender1 = scanner.next().charAt(0);
        String rollNo1 = scanner.next();
        String course1 = scanner.next();
        int semester1 = scanner.nextInt();
        double GPA1 = scanner.nextDouble();

        // Read input for second Student object
        String firstName2 = scanner.nextLine();
        String lastName2 = scanner.nextLine();
        int age2 = scanner.nextInt();
        char gender2 = scanner.next().charAt(0);
        String rollNo2 = scanner.next();
        String course2 = scanner.next();
        int semester2 = scanner.nextInt();
        double GPA2 = scanner.nextDouble();

        // Read input for two Faculty objects
        String firstName3 = scanner.nextLine();
        String lastName3 = scanner.nextLine();
        int age3 = scanner.nextInt();
        char gender3 = scanner.next().charAt(0);
        String employeeId1 = scanner.next();
        String department1 = scanner.next();
        String designation1 = scanner.next();
        double salary1 = scanner.nextDouble();

        // Read input for second Faculty object
        String firstName4 = scanner.nextLine();
        String lastName4 = scanner.nextLine();
        int age4 = scanner.nextInt();
        char gender4 = scanner.next().charAt(0);
        String employeeId2 = scanner.next();
        String department2 = scanner.next();
        String designation2 = scanner.next();
        double salary2 = scanner.nextDouble();

        // Create Student objects
        Student student1 = new Student(firstName1, lastName1, age1, gender1, rollNo1, course1, semester1, GPA1);
        Student student2 = new Student(firstName2, lastName2, age2, gender2, rollNo2, course2, semester2, GPA2);

        // Create Faculty objects
        Faculty faculty1 = new Faculty(firstName3, lastName3, age3, gender3, employeeId1, department1, designation1, salary1);
        Faculty faculty2 = new Faculty(firstName4, lastName4, age4, gender4, employeeId2, department2, designation2, salary2);

        // Find highest GPA student
        Student highestGPAStudent = findHighestGPAStudent(new Student[] {student1, student2});
        if (highestGPAStudent != null) {
            System.out.println(highestGPAStudent.getRollNo() + " " + highestGPAStudent.getCourse() + " " + highestGPAStudent.getGPA());
        } else {
            System.out.println("Sorry - No student is available");
        }

        // Find highest paid faculty
        Faculty highestPaidFaculty = findHighestPaidFaculty(new Faculty[] {faculty1, faculty2});
        if (highestPaidFaculty != null) {
            System.out.println(highestPaidFaculty.getEmployeeId() + " " + highestPaidFaculty.getDepartment() + " " + highestPaidFaculty.getSalary());
        } else {
            System.out.println("Sorry - No faculty is available");
        }
    }
}
```
**Explanation**

The `Solution` class contains two static methods: `findHighestGPAStudent` and `findHighestPaidFaculty`. These methods take arrays of `Student` and `Faculty` objects as input, respectively, and return the object with the highest GPA or salary.

In the `main` method, we read input for two `Student` and two `Faculty` objects, create `Student` and `Faculty` objects, and call the static methods to find the highest GPA student and highest paid faculty. We then print the results or a message indicating that no students or faculties are available.