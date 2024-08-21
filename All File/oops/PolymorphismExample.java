// polymorphism with method overriding


// Parent class
class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Drawing a " + name);
    }
}

// Child class
class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Child class
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle("Circle", 5.0);
        Shape shape2 = new Rectangle("Rectangle", 3.0, 4.0);

        shape1.draw(); // Calls the draw() method of Circle
        shape2.draw(); // Calls the draw() method of Rectangle
    }
}
