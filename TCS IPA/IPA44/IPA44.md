Create a class Rectangle with the following attributes:

length - double
breadth - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateArea and calculatePerimeter in Solution class.

calculateArea method:
This method will take a Rectangle object as input.
The method will calculate the area of the rectangle and return it as a double.

calculatePerimeter method:
This method will take a Rectangle object as input.
The method will calculate the perimeter of the rectangle and return it as a double.

These above mentioned static methods should be called from the main method.

For calculateArea method - The main method should print the area returned by the method.

For calculatePerimeter method - The main method should print the perimeter returned by the method.

Before calling these static methods in main, use Scanner object to read the values of two Rectangle objects referring 
attributes in the above mentioned attribute sequence.

Example Input:
5.5
3.2
7.0
4.5

Example Output:
17.6
17.4
31.5
23.0

# Question: Rectangle Class with Getters, Setters, and Parameterized Constructor

### Java Code

```java
public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
```

### Explanation:

*   The `Rectangle` class has two private attributes `length` and `breadth` of type `double`.
*   The class contains a parameterized constructor that takes `length` and `breadth` as parameters and sets them to the class's own attributes.
*   It also contains getter and setter methods for the `length` and `breadth` attributes.

# Question: Solution Class with Static Methods and Main Method

### Java Code

```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rect1 = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        Rectangle rect2 = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Area of Rectangle 1: " + calculateArea(rect1));
        System.out.println("Perimeter of Rectangle 1: " + calculatePerimeter(rect1));
        System.out.println("Area of Rectangle 2: " + calculateArea(rect2));
        System.out.println("Perimeter of Rectangle 2: " + calculatePerimeter(rect2));
    }

    public static double calculateArea(Rectangle rect) {
        return rect.getLength() * rect.getBreadth();
    }

    public static double calculatePerimeter(Rectangle rect) {
        return 2 * (rect.getLength() + rect.getBreadth());
    }
}
```

### Explanation:

*   The `Solution` class contains a main method that reads the values for `length` and `breadth` of two `Rectangle` objects using a `Scanner` object.
*   The main method then calls the `calculateArea` and `calculatePerimeter` static methods with the two `Rectangle` objects as arguments.
*   The `calculateArea` method calculates the area of the rectangle using the formula `length * breadth`.
*   The `calculatePerimeter` method calculates the perimeter of the rectangle using the formula `2 * (length + breadth)`.
*   Finally, the main method prints the areas and perimeters of the two rectangles.

# Input and Output

Example Input:

5.5
3.2
7.0
4.5

Example Output:

17.6
17.4
31.5
23.0