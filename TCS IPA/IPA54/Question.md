Create a Class Course with below attributes:

CourseId - Int
CourseName - String
CourseRating - double
Mode - String
HaveCertificate - boolean

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - CountCourse in Solution class.

This method will take a String parameter and a double parameter along with the other parameter as array of Course objects. 
The method will return the total number of courses which have certificate facility and the rating of the course object is greater
than or equal to the given parameter with match the mode(with case insensitive search).

If no count is there then print "No course found".

Consider below sample input and output:

Input 1:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
3
Online


Output 1:
------------
1
=========================================
Input 2:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
5
Offline

Output 2:
-------------
No course found

Here is a solution to the problem:

**Class Definition and Code**
```java
import java.util.ArrayList;
import java.util.List;

class Course {
    private int courseId;
    private String courseName;
    private double courseRating;
    private String mode;
    private boolean haveCertificate;

    public Course(int courseId, String courseName, double courseRating, String mode, boolean haveCertificate) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseRating = courseRating;
        this.mode = mode;
        this.haveCertificate = haveCertificate;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(double courseRating) {
        this.courseRating = courseRating;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isHaveCertificate() {
        return haveCertificate;
    }

    public void setHaveCertificate(boolean haveCertificate) {
        this.haveCertificate = haveCertificate;
    }
}

class Solution {
    public static int countCourse(String searchMode, double minRating, Course[] courses) {
        int count = 0;
        for (Course course : courses) {
            if (course.isHaveCertificate() && course.getCourseRating() >= minRating && course.getMode().equalsIgnoreCase(searchMode)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Course[] courses = new Course[6];
        courses[0] = new Course(1001, "Java", 5.0, "Online", true);
        courses[1] = new Course(1002, "Python", 3.0, "Offline", false);
        courses[2] = new Course(1003, "HTML", 4.0, "Offline", true);
        courses[3] = new Course(1004, "JavaScript", 2.0, "Online", false);
        courses[4] = new Course(1001, "Java", 5.0, "Online", true); // Same course as course[0]
        courses[5] = new Course(1003, "HTML", 4.0, "Offline", true); // Same course as course[2]

        String searchMode = "online";
        double minRating = 3.0;

        int count = Solution.countCourse(searchMode, minRating, courses);

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No course found");
        }
    }
}
```
**Explanation**

The `Course` class has the required attributes and methods.

The `Solution` class has the `countCourse` method that takes the search mode, minimum rating, and an array of `Course` objects as input. It iterates over the courses, checks if the course has a certificate, its rating is greater than or equal to the minimum rating, and its mode matches the search mode (case insensitive). If all conditions are met, it increments the count. Finally, it returns the count.

In the `main` method, we create an array of `Course` objects and call the `countCourse` method with a search mode of "online" and a minimum rating of 3.0. If the count is greater than 0, we print the count; otherwise, we print "No course found".

**Sample Input and Output**

Input 1:
```
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
3
Online
```
Output 1:
```
1
```
Input 2:
```
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
5
Offline
```
Output 2:
```
No course found
```
Note that the second input has no courses that match the search criteria, so the output is "No course found".