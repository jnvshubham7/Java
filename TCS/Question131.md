Create a class Employee with the below attributes: 
EmpId - int 
EmpName - String 
Dept - String
Rating - int
Salary - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findDept and findSecondHighestSalary in Solution class.

findDept method: 
-----------------------------------
This method will take two input parameters - array of Employee objects and int parameter. The method 
will return the dept array attribute from employee objects whose salary is matched with int parameter and rating greater than
equal to 3. If no data found of beach objects, then the method should return null.

findSecondHighestSalary method: 
-----------------------------------
This method will take two input parameters - array of Employee objects and string parameter. The method
will return the second highest salary from employee objects whose dept is matched with string parameter. 
If no data found of beach objects, then the method should return 0.

Note: No two employees have same rating. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.
For findDept method - The main method should print the dept from the Employee array. If return null, then you should print 
"No Department found".
For findSecondHighestSalary method - The main method should print the 2nd highest salary from the Employee array with 
the following condition. If return 0, then you should print "No data found".


Input ->
101
Arijit
Computer
4
35000
102
Rakesh
Electronics
2
18000
103
Mahima
Mechanical
3
35000
104
Saniya
Mechanical
5
68000
105
Rajesh 
Computer
1
30000
35000
Mechanical

Output ->
Computer, Mechanical
35000

Here is the solution in Java:
```java
## Employee Class

```java
public class Employee {
    private int empId;
    private String empName;
    private String dept;
    private int rating;
    private int salary;

    public Employee(int empId, String empName, String dept, int rating, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.rating = rating;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
```

## Solution Class

```java
public class Solution {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee(101, "Arijit", "Computer", 4, 35000);
        Employee emp2 = new Employee(102, "Rakesh", "Electronics", 2, 18000);
        Employee emp3 = new Employee(103, "Mahima", "Mechanical", 3, 35000);
        Employee emp4 = new Employee(104, "Saniya", "Mechanical", 5, 68000);
        Employee emp5 = new Employee(105, "Rajesh", "Computer", 1, 30000);
        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};

        // Find Dept
        String[] result = findDept(employees, 35000);
        if (result != null) {
            System.out.println(String.join(", ", result));
        } else {
            System.out.println("No Department found");
        }

        // Find Second Highest Salary
        int resultSalary = findSecondHighestSalary(employees, "Mechanical");
        if (resultSalary != 0) {
            System.out.println(resultSalary);
        } else {
            System.out.println("No data found");
        }
    }

    public static String[] findDept(Employee[] employees, int salary) {
        List<String> depts = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getSalary() == salary && emp.getRating() >= 3) {
                depts.add(emp.getDept());
            }
        }
        return depts.toArray(new String[0]);
    }

    public static int findSecondHighestSalary(Employee[] employees, String dept) {
        List<Integer> salaries = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getDept().equals(dept)) {
                salaries.add(emp.getSalary());
            }
        }
        salaries.remove((int) Collections.max(salaries)); // Remove highest salary
        return salaries.size() > 0 ? Collections.max(salaries) : 0;
    }
}
```

### Input

```
101
Arijit
Computer
4
35000
102
Rakesh
Electronics
2
18000
103
Mahima
Mechanical
3
35000
104
Saniya
Mechanical
5
68000
105
Rajesh 
Computer
1
30000
35000
Mechanical
```

### Output

```
Computer, Mechanical
35000
```

Note: The `findDept` method returns a list of departments where the salary matches the given salary and the rating is greater than or equal to 3. If no data is found, it returns null. The `findSecondHighestSalary` method returns the second highest salary for the given department. If no data is found, it returns 0.