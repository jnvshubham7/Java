import java.util.*;

class Person {
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

class Student extends Person {
    private String rollNo;
    private String course;
    private int semester;
    private double gpa;

    public Student(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double gpa) {
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.gpa = gpa;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

class Faculty extends Person {
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

class Solution {
    public static Student findHighestGPAStudent(Student[] students) {
        if (students.length == 0) {
            return null;
        }

        Student highestGPAStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGpa() > highestGPAStudent.getGpa()) {
                highestGPAStudent = students[i];
            }
        }

        return highestGPAStudent;
    }

    public static Faculty findHighestPaidFaculty(Faculty[] faculties) {
        if (faculties.length == 0) {
            return null;
        }

        Faculty highestPaidFaculty = faculties[0];
        for (int i = 1; i < faculties.length; i++) {
            if (faculties[i].getSalary() > highestPaidFaculty.getSalary()) {
                highestPaidFaculty = faculties[i];
            }
        }

        return highestPaidFaculty;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            char gender = sc.nextLine().charAt(0);
            String rollNo = sc.nextLine();
            String course = sc.nextLine();
            int semester = Integer.parseInt(sc.nextLine());
            double gpa = Double.parseDouble(sc.nextLine());

            students[i] = new Student(firstName, lastName, age, gender, rollNo, course, semester, gpa);
        }

        Faculty[] faculties = new Faculty[2];
        for (int i = 0; i < faculties.length; i++) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            char gender = sc.nextLine().charAt(0);
            String employeeId = sc.nextLine();
            String department = sc.nextLine();
            String designation = sc.nextLine();
            double salary = Double.parseDouble(sc.nextLine());

            faculties[i] = new Faculty(firstName, lastName, age, gender, employeeId, department, designation, salary);
        }

        Student highestGPAStudent = findHighestGPAStudent(students);
        if (highestGPAStudent != null) {
            System.out.println(highestGPAStudent.getRollNo());
            System.out.println(highestGPAStudent.getCourse());
            System.out.println(highestGPAStudent.getGpa());
        } else {
            System.out.println("Sorry - No student is available");
        }

        Faculty highestPaidFaculty = findHighestPaidFaculty(faculties);
        if (highestPaidFaculty != null) {
            System.out.println(highestPaidFaculty.getEmployeeId());
            System.out.println(highestPaidFaculty.getDepartment());
            System.out.println(highestPaidFaculty.getSalary());
        } else {
            System.out.println("Sorry - No faculty is available");
        }
    }
}
