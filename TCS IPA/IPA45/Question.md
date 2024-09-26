Create a class Employee with the following attributes:

name (string)
age (int)
salary (double)
Write getters, setters, and a parameterized constructor in the above-mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateYearlySalary and calculateTax in the Solution class.

calculateYearlySalary method:
-----------------------------------------
This method will take an Employee object as input.
The method will calculate the yearly salary of the employee (assuming that the employee works for 12 months in a year) and 
return it as a double.

calculateTax method:
-----------------------------------------
This method will take an Employee object as input.
The method will calculate the tax to be paid by the employee based on the following rules:

If the yearly salary is less than or equal to 50000, the tax is 10% of the yearly salary.
If the yearly salary is greater than 50000 but less than or equal to 100000, the tax is 20% of the amount over 50000 plus 10% 
of the first 50000.
If the yearly salary is greater than 100000, the tax is 30% of the amount over 100000 plus 20% of the amount between 50000 and 
100000 plus 10% of the first 50000.
The method will return the tax amount as a double.
These above-mentioned static methods should be called from the main method.

For calculateYearlySalary method - The main method should print the yearly salary returned by the method.

For calculateTax method - The main method should print the tax amount returned by the method.

Before calling these static methods in main, use a Scanner object to read the values of an Employee object's attributes.

Example Input:
----------------
John
30
55000.0

Example Output:
----------------
Yearly salary of John: 660000.0
Tax to be paid by John: 183000.0

Here is the code:

```markdown
# Question: Calculate Yearly Salary and Tax
## Explanation:
We are asked to create a class Employee with attributes name (string), age (int), and salary (double), and write getters, setters, and a parameterized constructor.

## Java Code:
```java
class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Solution {
    public static double calculateYearlySalary(Employee employee) {
        return employee.getSalary() * 12;
    }

    public static double calculateTax(Employee employee) {
        double yearlySalary = employee.getSalary() * 12;
        if (yearlySalary <= 50000) {
            return yearlySalary * 0.10;
        } else if (yearlySalary <= 100000) {
            return (yearlySalary - 50000) * 0.20 + 50000 * 0.10;
        } else {
            return (yearlySalary - 100000) * 0.30 + (100000 - 50000) * 0.20 + 50000 * 0.10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, age, salary);
        System.out.println("Yearly salary of " + name + ": " + calculateYearlySalary(employee));
        System.out.println("Tax to be paid by " + name + ": " + calculateTax(employee));
    }
}
```

## Input:
```
Enter name: John
Enter age: 30
Enter salary: 55000.0
```

## Output:
```
Yearly salary of John: 660000.0
Tax to be paid by John: 183000.0
```

## Explanation:
The `Employee` class has three attributes: `name`, `age`, and `salary`. It has getters and setters for each attribute.

The `Solution` class has two static methods: `calculateYearlySalary` and `calculateTax`. The `calculateYearlySalary` method calculates the yearly salary by multiplying the employee's monthly salary by 12. The `calculateTax` method calculates the tax based on the employee's yearly salary, following the rules mentioned in the question.

In the `main` method, we create a new `Scanner` object to read the values of the `Employee` object's attributes. We then call the `calculateYearlySalary` and `calculateTax` methods and print the results.