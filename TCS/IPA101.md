Create a class called Employee with the below attributes:

employeeld - int
name - String
branch - String
rating - double
company Transport - boolean
The above attributes should be private. write getters, setters and parameterized constructor as required.

Create class MyClass with main method.
Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
in MyClass class.

findCountOfEmployeesUsingCompTransport method: 
----------------------------------------------
This method will take an array of Employee object and a String parameter as input parameters. 
This method will calculate and return the count of Employees who are all using company transport 
in the given branch (String parameter passed).
If no Employee in the given branch using company transport in the array of Employee objects, then 
the method should return 0.

findEmployeeWithSecondHighestRating method: 
--------------------------------------------
This method will take an array of Employee objects as an input parameter. This method will return 
the object of the second highest rating employee from the array of Employee objects who are not using 
company transport.
If all Employees using company transport in the array of Employee objects, then the method should return null.

Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee 
is unique.
For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it 
is if the returned value is greater than 0, else it should print "No such Employees".
Ex: 2 , where 2 is the count
For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from 
the returned object if the returned value is not null. If the returned value is null, then it should 
print "All Employees using company transport".
Ex: 1003
    Uma
where 1003 is the employeeld and Uma is the name.
Before calling these static methods in main, use Scanner object to read the values of four Employee 
objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
parameter for capturing branch.

Input : 

1001
Ashwa
IT
5
true
1002
Preeti
IT
4
true
1003
Uma
Admin
3
false
1004
Akash
Hardware
4.5
false
IT



Output : 

2
1003
Uma

Here is the solution in Java:
```markdown
# Employee Class

```java
class Employee {
    private int employeeld;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    // Parameterized constructor
    public Employee(int employeeld, String name, String branch, double rating, boolean companyTransport) {
        this.employeeld = employeeld;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    // Getters
    public int getEmployeeld() {
        return employeeld;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getRating() {
        return rating;
    }

    public boolean isCompanyTransport() {
        return companyTransport;
    }

    // Setters
    public void setEmployeeld(int employeeld) {
        this.employeeld = employeeld;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCompanyTransport(boolean companyTransport) {
        this.companyTransport = companyTransport;
    }
}
```

# MyClass

```java
class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Employee objects
        Employee employee1 = new Employee(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Boolean.parseBoolean(scanner.nextLine()));
        Employee employee2 = new Employee(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Boolean.parseBoolean(scanner.nextLine()));
        Employee employee3 = new Employee(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Boolean.parseBoolean(scanner.nextLine()));
        Employee employee4 = new Employee(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Boolean.parseBoolean(scanner.nextLine()));

        // Read branch
        String branch = scanner.nextLine();

        // Call static methods
        int count = findCountOfEmployeesUsingCompTransport(new Employee[]{employee1, employee2, employee3, employee4}, branch);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No such Employees");
        }

        Employee secondHighestRatingEmployee = findEmployeeWithSecondHighestRating(new Employee[]{employee1, employee2, employee3, employee4});
        if (secondHighestRatingEmployee != null) {
            System.out.println(secondHighestRatingEmployee.getEmployeeld());
            System.out.println(secondHighestRatingEmployee.getName());
        } else {
            System.out.println("All Employees using company transport");
        }
    }

    // findCountOfEmployeesUsingCompTransport method
    public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.isCompanyTransport() && employee.getBranch().equals(branch)) {
                count++;
            }
        }
        return count;
    }

    // findEmployeeWithSecondHighestRating method
    public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
        List<Employee> employeesList = new ArrayList<>();
        for (Employee employee : employees) {
            if (!employee.isCompanyTransport()) {
                employeesList.add(employee);
            }
        }
        if (employeesList.isEmpty()) {
            return null;
        }
        employeesList.sort((e1, e2) -> -Double.compare(e1.getRating(), e2.getRating()));
        return employeesList.get(1);
    }
}
```

# Explanation

* The `Employee` class has private attributes with getters and setters.
* The `MyClass` class has a `main` method that reads Employee objects and branch from the input, and then calls the static methods `findCountOfEmployeesUsingCompTransport` and `findEmployeeWithSecondHighestRating`.
* The `findCountOfEmployeesUsingCompTransport` method iterates through the Employee array and counts the number of employees who are using company transport in the given branch.
* The `findEmployeeWithSecondHighestRating` method iterates through the Employee array, filters out employees who are using company transport, and then sorts the remaining employees by their rating in descending order. It returns the second highest rated employee, or null if all employees are using company transport.