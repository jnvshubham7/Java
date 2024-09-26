create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.

create class courseProgram with main method.

implement two static methods-
   findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."

input1:
111
kubernetes
Nisha
40
10
321
cassandra
Roshin`i
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17

output1:
35
kubernetes
Apache Spark
cassandra

input2:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5

output 2:
No Course found
No Course found with mentioned attributes.

## Course Class
### Attributes
* `courseId` - `int`
* `courseName` - `String`
* `courseAdmin` - `String`
* `quiz` - `int`
* `handson` - `int`

### Methods
* Private methods:
	+ Setter and getter for each attribute
* Parametrized constructor:
```java
public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseAdmin = courseAdmin;
    this.quiz = quiz;
    this.handson = handson;
}
```
Getter and setter methods:
```java
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

public String getCourseAdmin() {
    return courseAdmin;
}

public void setCourseAdmin(String courseAdmin) {
    this.courseAdmin = courseAdmin;
}

public int getQuiz() {
    return quiz;
}

public void setQuiz(int quiz) {
    this.quiz = quiz;
}

public int getHandson() {
    return handson;
}

public void setHandson(int handson) {
    this.handson = handson;
}
```

## CourseProgram Class
### Static Methods
* `findAvgOfQuizByAdmin`:
```java
public static int findAvgOfQuizByAdmin(Course[] courses, String admin) {
    int totalQuiz = 0;
    int count = 0;
    for (Course course : courses) {
        if (course.getCourseAdmin().equals(admin)) {
            totalQuiz += course.getQuiz();
            count++;
        }
    }
    return count > 0 ? totalQuiz / count : 0;
}
```
* `sortCourseByHandsOn`:
```java
public static Course[] sortCourseByHandsOn(Course[] courses, int maxHandson) {
    Course[] filteredCourses = new Course[0];
    for (Course course : courses) {
        if (course.getHandson() < maxHandson) {
            filteredCourses = Arrays.copyOf(filteredCourses, filteredCourses.length + 1);
            filteredCourses[filteredCourses.length - 1] = course;
        }
    }
    return Arrays.stream(filteredCourses).sorted((c1, c2) -> Integer.compare(c1.getHandson(), c2.getHandson())).toArray<Course[]>(Course[]::new);
}
```
### Main Method
```java
public static void main(String[] args) {
    Course[] courses = {
        new Course(111, "kubernetes", "Nisha", 40, 10),
        new Course(321, "cassandra", "Roshini", 30, 15),
        new Course(457, "Apache Spark", "Nisha", 30, 12),
        new Course(987, "site core", "Tirth", 50, 20),
        new Course(123, "Nisha", 17)
    };

    int avgQuiz = findAvgOfQuizByAdmin(courses, "Nisha");
    if (avgQuiz != 0) {
        System.out.println(avgQuiz);
    } else {
        System.out.println("No Course found");
    }

    Course[] filteredCourses = sortCourseByHandsOn(courses, 30);
    if (filteredCourses != null) {
        for (Course course : filteredCourses) {
            System.out.println(course.getCourseName());
        }
    } else {
        System.out.println("No Course found with mentioned attributes");
    }
}
```
### Input and Output
* Input 1:
	+ `findAvgOfQuizByAdmin` input: `["Nisha"]`
	+ Output: `35`
	+ `sortCourseByHandsOn` input: `30`
	+ Output: `"kubernetes"`, `"Apache Spark"`, `"cassandra"`
* Input 2:
	+ `findAvgOfQuizByAdmin` input: `["Shubhamk"]`
	+ Output: `0`
	+ `sortCourseByHandsOn` input: `30`
	+ Output: `null` (no courses found with mentioned attributes)