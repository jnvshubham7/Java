Create a class named "Employee" with the following attributes:

id (int)
name (String)
designation (String)
salary (double)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Employee class:

getSalary(): This method should return the salary of the employee.
getDesignation(): This method should return the designation of the employee.

Create a class named "Company" with the following attributes:

companyName (String)
employees (Employee array)
numEmployees (int)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Company class:

getAverageSalary(): This method should return the average salary of all the employees in the company.
getMaxSalary(): This method should return the highest salary of all the employees in the company.
getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.

In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details 
(id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the 
appropriate parameters. Finally, call the three methods mentioned above and print the output.

Note:

All searches should be case-insensitive.
You may assume that the input is valid and in the correct format.

Sample input:
---------------------
Enter company name: ABC Company
Enter number of employees: 3
Enter employee details:
Employee 1:
Enter id: 101
Enter name: John Smith
Enter designation: Manager
Enter salary: 5000
Employee 2:
Enter id: 102
Enter name: Jane Doe
Enter designation: Engineer
Enter salary: 4000
Employee 3:
Enter id: 103
Enter name: Bob Johnson
Enter designation: Engineer
Enter salary: 4500

Sample Output:
--------------------
Average salary: 4500.0
Max salary: 5000.0
Employees with designation: Engineer
ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0

**Creating the Employee and Company Classes**

### Employee.java

```java
public class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }
}
```

### Company.java

```java
public class Company {
    private String companyName;
    private Employee[] employees;
    private int numEmployees;

    public Company(String companyName, Employee[] employees, int numEmployees) {
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees;
    }

    public double getAverageSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / numEmployees;
    }

    public double getMaxSalary() {
        double max = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public Employee[] getEmployeesByDesignation(String designation) {
        Employee[] employeesByDesignation = new Employee[0];
        for (Employee employee : employees) {
            if (employee.getDesignation().equalsIgnoreCase(designation)) {
                Employee[] temp = new Employee[employeesByDesignation.length + 1];
                System.arraycopy(employeesByDesignation, 0, temp, 0, employeesByDesignation.length);
                temp[employeesByDesignation.length] = employee;
                employeesByDesignation = temp;
            }
        }
        return employeesByDesignation;
    }
}
```

### Main Method

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter company name:");
        String companyName = scanner.nextLine();

        System.out.println("Enter number of employees:");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        Employee[] employees = new Employee[numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter employee details:");
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Enter id:");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter designation:");
            String designation = scanner.nextLine();
            System.out.println("Enter salary:");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume newline left-over
            employees[i] = new Employee(id, name, designation, salary);
        }

        Company company = new Company(companyName, employees, numEmployees);

        System.out.println("Average salary: " + company.getAverageSalary());
        System.out.println("Max salary: " + company.getMaxSalary());
        System.out.println("Employees with designation: " + company.getEmployeesByDesignation("Engineer"));
    }
}
```

**Input and Output**

Input:

```
Enter company name: ABC Company
Enter number of employees: 3
Enter employee details:
Employee 1:
Enter id: 101
Enter name: John Smith
Enter designation: Manager
Enter salary: 5000
Employee 2:
Enter id: 102
Enter name: Jane Doe
Enter designation: Engineer
Enter salary: 4000
Employee 3:
Enter id: 103
Enter name: Bob Johnson
Enter designation: Engineer
Enter salary: 4500
```

Output:

```
Average salary: 4500.0
Max salary: 5000.0
Employees with designation: Engineer
ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0
```

**Solution**

The solution involves creating two classes, `Employee` and `Company`. The `Employee` class has attributes `id`, `name`, `designation`, and `salary`, and methods `getSalary()` and `getDesignation()`. The `Company` class has attributes `companyName`, `employees`, and `numEmployees`, and methods `getAverageSalary()`, `getMaxSalary()`, and `getEmployeesByDesignation(String designation)`.

In the `main` method, we use a `Scanner` object to read the values of the company name, number of employees, and employee details in a loop. We create a `Company` object and pass the appropriate parameters. Finally, we call the three methods mentioned above and print the output.