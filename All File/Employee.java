import java.util.*;

// Employee.java
public class Employee implements Comparable<Employee> {
  String firstName;
  String lastName;

  // Constructor sets firstName and lastName
  public Employee(String first, String last)
  {
    this.firstName = first;
    this.lastName = last;
  }

  // User-friendly output when printed.
  public String toString()
  {
    return "( " + lastName + ", " + firstName + " )";
  }

  // Implement the Comparable interface
  @Override public int compareTo(Employee value)
  {
    if (this.lastName.compareTo(value.lastName) != 0) {
      // If lastNames are different, compare lastName
      return this.lastName.compareTo(value.lastName);
    } else {
      // If lastNames are the same, compare firstName
      return this.firstName.compareTo(value.firstName);
    }
  }
}