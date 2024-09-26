Create a Class Course with below attributes:

CourseName - String
CourseNumber - int
Mode - String
Sharedata - boolean

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - findCourseStatus in Solution class.

This method will take a String parameter along with the other parameter as array of Course objects. 
The method will return status where the String parameter appears in the side attribute (with case insensitive search).

If the number of the course greater than equal to 1000, print "High", if greater or equal to 500 but less than 1000 then print
"Medium" and if less than 500 then print "Low".

If the taken string not match with the Course name then print "No course found".


Consider below sample input and output:

Input 1:
------------
Java
1200
Online
False
Python
600
Offline
False
HTML
800
Offline
False
JavaScript
300
Online
True
Python

Output 1:
------------
Medium
=========================================
Input 2:
------------
Java
1200
Online
False
Python
600
Offline
False
HTML
800
Offline
False
JavaScript
300
Online
True
PHP

Output 2:
-------------
No course found

Here is the solution in Java format:

```markdown
# Problem Statement
Create a Class Course with below attributes: CourseName - String, CourseNumber - int, Mode - String, Sharedata - boolean. Write getters, setters and parameterized constructor as required. Create class Solution with main method. Implement static method - findCourseStatus in Solution class. This method will take a String parameter along with the other parameter as array of Course objects. The method will return status where the String parameter appears in the side attribute (with case insensitive search). If the number of the course greater than or equal to 1000, print "High", if greater or equal to 500 but less than 1000 then print "Medium" and if less than 500 then print "Low". If the taken string not match with the Course name then print "No course found".

# Code
```java
// Course class
class Course {
    private String CourseName;
    private int CourseNumber;
    private String Mode;
    private boolean Sharedata;

    // parameterized constructor
    public Course(String courseName, int courseNumber, String mode, boolean sharedata) {
        CourseName = courseName;
        CourseNumber = courseNumber;
        Mode = mode;
        Sharedata = sharedata;
    }

    // getters
    public String getCourseName() {
        return CourseName;
    }

    public int getCourseNumber() {
        return CourseNumber;
    }

    public String getMode() {
        return Mode;
    }

    public boolean isSharedata() {
        return Sharedata;
    }

    // setters
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setCourseNumber(int courseNumber) {
        CourseNumber = courseNumber;
    }

    public void setMode(String mode) {
        Mode = mode;
    }

    public void setSharedata(boolean sharedata) {
        Sharedata = sharedata;
    }
}

// Solution class
public class Solution {
    public static void main(String[] args) {
        Course[] courses = new Course[] {
            new Course("Java", 1200, "Online", false),
            new Course("Python", 600, "Offline", false),
            new Course("HTML", 800, "Offline", false),
            new Course("JavaScript", 300, "Online", true),
            new Course("Python", 600, "Offline", false) // duplicate course
        };
        System.out.println(findCourseStatus("Python", courses));
        System.out.println(findCourseStatus("PHP", courses));
    }

    // findCourseStatus method
    public static String findCourseStatus(String courseName, Course[] courses) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                if (course.getCourseNumber() >= 1000) {
                    return "High";
                } else if (course.getCourseNumber() >= 500) {
                    return "Medium";
                } else {
                    return "Low";
                }
            }
        }
        return "No course found";
    }
}
```

# Explanation:
This problem can be solved by using a class called Course to represent a course with attributes like name, number, mode, and share data.  The findCourseStatus method will take a String parameter as the course name to search in the given array of Course objects.  If it finds the course, it will check the course number and return "High", "Medium", or "Low" based on the number.  If it does not find the course, it will return "No course found".