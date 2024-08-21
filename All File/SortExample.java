package java;
import java.util.Arrays;

// Employee.java
class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;

    // Constructor initializes firstName and lastName
    public Employee(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    // User-friendly output when printed.
    public String toString() {
        return "( " + lastName + ", " + firstName + " )";
    }

    // Implement the Comparable interface
    @Override
    public int compareTo(Employee other) {
        // Compare last names first
        int lastNameComparison = this.lastName.compareTo(other.lastName);

        // If last names are the same, compare first names
        return (lastNameComparison != 0) ? lastNameComparison : this.firstName.compareTo(other.firstName);
    }
}

// SortExample.java
public class SortExample {
    public static void main(String[] args) {
        // Set up an array with a few Employee instances
        Employee[] employees = {
                new Employee("Kirk", "Douglas"),
                new Employee("Mel", "Brooks"),
                new Employee("Jane", "Fonda"),
                new Employee("Henry", "Fonda"),
                new Employee("Michael", "Douglas")
        };

        // Use Arrays.sort() to sort the array based on the Comparable interface
        Arrays.sort(employees);

        // Print out the sorted Employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
