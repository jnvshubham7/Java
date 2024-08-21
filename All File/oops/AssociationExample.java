

// implement association

// Let's consider two classes: Student and Course

// Student class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Course class
class Course {
    private String title;
    private Student[] students;

    public Course(String title) {
        this.title = title;
        this.students = new Student[10]; // Assuming a maximum of 10 students per course
    }

    public String getTitle() {
        return title;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void displayStudents() {
        System.out.println("Students enrolled in " + getTitle() + ":");
        for (Student student : students) {
            if (student != null) {
                System.out.println("- " + student.getName());
            }
        }
    }
}

// Main class
public class AssociationExample {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("John");
        Student student2 = new Student("Emily");

        // Create course objects
        Course course1 = new Course("Java Programming");
        Course course2 = new Course("Data Structures");

        // Add students to courses
        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student1);

        // Display enrolled students for each course
        course1.displayStudents();
        course2.displayStudents();
    }
}

