Create a class Employee with below attributes:

employeeId - int
employeeName - String
age - int
gender - char
salary - double

where employeeId is the unique identifier of the employee, employeeName is the name of the employee, age is the age of 
the employee, gender is the gender of the employee and salary is the salary of the employee.

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - getEmployeeWithSecondLowestSalary and countEmployeesBasedOnAge in Solution class.

getEmployeeWithSecondLowestSalary method:
This method will take an array of Employee objects as a parameter.
The method will return the Employee object with the second lowest salary in the array of Employee objects.
If there are less than two employees in the array, then the method should return null.

countEmployeesBasedOnAge method:
This method will take two input parameters - array of Employee objects and an integer parameter (for age).
The method will return the count of employees from the array of Employee objects whose age matches with the input 
parameter.
If no employee with the given age is present in the array of Employee objects, then the method should return 0.

Note :

Two employee objects can have the same salary.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For getEmployeeWithSecondLowestSalary method - The main method should print the employeeId followed by # and employeeName
from the returned Employee object, if the returned value is not null.

If the returned value is null then it should print "Null".

For countEmployeesBasedOnAge method - The main method should print the count of employees as it is, if the returned value
is greater than 0, otherwise it should print "No employee found for the given age".

Before calling these static methods in main, use Scanner to read the number of objects and objects to read the values of 
Employee objects referring attributes in the above mentioned attribute sequence.

Consider below sample input and output:

Input:
-------------
4
101
John
30
M
10000.00
102
Samantha
25
F
15000.00
103
Alex
28
M
12000.00
104
Lisa
30
F
15000.00
30

Output:
----------------
103#Alex
2

**Question:**
Create a class Employee with below attributes:
employeeId - int
employeeName - String
age - int
gender - char
salary - double

Implement two static methods - getEmployeeWithSecondLowestSalary and countEmployeesBasedOnAge in Solution class.

**Getters, Setters and Parameterized Constructor for Employee Class:**
```java
public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private char gender;
    private double salary;

    public Employee(int employeeId, String employeeName, int age, char gender, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
```
**Solution Class:**
```java
import java.util.*;

public class Solution {
    public static class Employee {
        // ... same getters, setters, and constructor as above ...
    }

    public static Employee getEmployeeWithSecondLowestSalary(Employee[] employees) {
        // Sort employees by salary
        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        // Find the second lowest salary
        double secondLowestSalary = employees[1].getSalary();
        for (int i = 2; i < employees.length; i++) {
            if (employees[i].getSalary() < secondLowestSalary) {
                secondLowestSalary = employees[i].getSalary();
            }
        }

        // Find the employee with the second lowest salary
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getSalary() == secondLowestSalary) {
                result = employee;
                break;
            }
        }

        return result;
    }

    public static int countEmployeesBasedOnAge(Employee[] employees, int age) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getAge() == age) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            Employee employee = new Employee(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next().charAt(0), scanner.nextDouble());
            employees[i] = employee;
        }

        Employee employeeWithSecondLowestSalary = getEmployeeWithSecondLowestSalary(employees);
        if (employeeWithSecondLowestSalary != null) {
            System.out.println(employeeWithSecondLowestSalary.getEmployeeId() + "#" + employeeWithSecondLowestSalary.getEmployeeName());
        } else {
            System.out.println("Null");
        }

        int count = countEmployeesBasedOnAge(employees, scanner.nextInt());
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No employee found for the given age");
        }
    }
}
```
**Input:**
```
4
101
John
30
M
10000.00
102
Samantha
25
F
15000.00
103
Alex
28
M
12000.00
104
Lisa
30
F
15000.00
30
```
**Output:**
```
103#Alex
2
```
**Explanation:**

1. The `getEmployeeWithSecondLowestSalary` method takes an array of `Employee` objects as a parameter and returns the `Employee` object with the second lowest salary.
2. The method first sorts the array of employees by salary in ascending order.
3. Then, it finds the second lowest salary by iterating through the sorted array starting from the second element (index 1).
4. Finally, it finds the `Employee` object with the second lowest salary by iterating through the sorted array again and returning the first `Employee` object with the found salary.
5. The `countEmployeesBasedOnAge` method takes an array of `Employee` objects and an integer age as parameters and returns the count of employees with the given age.
6. The method iterates through the array of employees and checks if each employee's age matches the given age. If it does, it increments the count.
7. The `main` method reads the number of employees and employee data from the input, creates an array of employees, and then calls the two static methods to print the results.