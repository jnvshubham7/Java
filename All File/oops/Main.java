// Class and Object

// // Main.java
// public class Main {
//     public static void main(String[] args) {
//         // Create objects of the Person class
//         Person person1 = new Person("John", 25);
//         Person person2 = new Person("Jane", 30);

//         // Access fields and call methods on the objects
//         System.out.println(person1.getName()); // Output: John
//         System.out.println(person2.getAge()); // Output: 30
//         person1.introduce(); // Output: Hello, my name is John and I am 25 years old.
//         person2.introduce(); // Output: Hello, my name is Jane and I am 30 years old.

//         // Modify object fields
//         person1.setAge(26);
//         person2.setName("Janet");

//         // Call the introduce() method again to see the updated information
//         person1.introduce(); // Output: Hello, my name is John and I am 26 years old.
//         person2.introduce(); // Output: Hello, my name is Janet and I am 30 years old.
//     }
// }



//use super 

// class ParentClass {
//     protected int value;

//     public ParentClass(int value) {
//         this.value = value;
//     }

//     public void display() {
//         System.out.println("Parent Class - Value: " + value);
//     }
// }

// class ChildClass extends ParentClass {
//     private int childValue;

//     public ChildClass(int value, int childValue) {
//         super(value); // Calling the parent class constructor
//         this.childValue = childValue;
//     }

//     public void display() {
//         super.display(); // Invoking the parent class method
//         System.out.println("Child Class - Child Value: " + childValue);
//     }

//     public void accessParentField() {
//         System.out.println("Parent Class Field - Value: " + super.value); // Accessing parent class field
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         ChildClass child = new ChildClass(10, 20);
//         child.display();

//         System.out.println();

//         child.accessParentField();
//     }
// }








// Inheritance

// Parent class
// class Vehicle {
//     protected String brand;
    
//     public Vehicle(String brand) {
//         this.brand = brand;
//     }
    
//     public void displayInfo() {
//         System.out.println("Brand: " + brand);
//     }
// }

// // Child class inheriting from Vehicle
// class Car extends Vehicle {
//     private int numOfDoors;
    
//     public Car(String brand, int numOfDoors) {
//         super(brand);
//         this.numOfDoors = numOfDoors;
//     }
    
//     public void displayInfo() {
//         super.displayInfo();
//         System.out.println("Number of doors: " + numOfDoors);
//     }
// }

// // Child class inheriting from Vehicle
// class Motorcycle extends Vehicle {
//     private boolean hasSidecar;
    
//     public Motorcycle(String brand, boolean hasSidecar) {
//         super(brand);
//         this.hasSidecar = hasSidecar;
//     }
    
//     public void displayInfo() {
//         super.displayInfo();
//         System.out.println("Has sidecar: " + hasSidecar);
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {
//         Car car = new Car("Toyota", 4);
//         car.displayInfo();
        
//         System.out.println();
        
//         Motorcycle motorcycle = new Motorcycle("Honda", false);
//         motorcycle.displayInfo();
//     }
// }










//polymorphism


// Main.java
// public class Main {
//     public static void main(String[] args) {
//         Animal animal1 = new Cat();
//         Animal animal2 = new Dog();

//         animal1.makeSound(); // Output: Meow!
//         animal2.makeSound(); // Output: Woof!
//     }
// }






//encapsulation


// public class Main {
//     public static void main(String[] args) {
//         // Create an object of the Person class
//         Person person = new Person();

//         // Set the name and age using the public setter methods
//         person.setName("John");
//         person.setAge(25);

//         // Access the name and age using the public getter methods
//         System.out.println("Name: " + person.getName()); // Output: Name: John
//         System.out.println("Age: " + person.getAge()); // Output: Age: 25

//         // Try setting an invalid age
//         person.setAge(-5); // Output: Invalid age. Age cannot be negative.
//     }
// }







//Abstraction

// abstract class Animal {
//     // Abstract method
//     public abstract void makeSound();

//     // Non-abstract method
//     public void sleep() {
//         System.out.println("Zzz");
//     }
// }

// class Dog extends Animal {
//     // Implementing the abstract method
//     public void makeSound() {
//         System.out.println("Woof!");
//     }
// }

// class Cat extends Animal {
//     // Implementing the abstract method
//     public void makeSound() {
//         System.out.println("Meow!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.makeSound(); // Output: Woof!
//         dog.sleep(); // Output: Zzz

//         Cat cat = new Cat();
//         cat.makeSound(); // Output: Meow!
//         cat.sleep(); // Output: Zzz
//     }
// }







//abstraction using interfaces:

// interface Animal {
//     void makeSound();
// }

// class Dog implements Animal {
//     public void makeSound() {
//         System.out.println("Woof!");
//     }
// }

// class Cat implements Animal {
//     public void makeSound() {
//         System.out.println("Meow!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.makeSound(); // Output: Woof!

//         Cat cat = new Cat();
//         cat.makeSound(); // Output: Meow!
//     }
// }



//encapsulation and access modifiers

// public class Main {
//     public static void main(String[] args) {
//         Person person = new Person();
        
//         // Accessing and setting the name using public setter
//         person.setName("John Doe");
        
//         // Accessing and setting the age using public setter
//         person.setAge(25);
        
//         // Accessing and getting the name using public getter
//         System.out.println("Name: " + person.getName());
        
//         // Accessing and getting the age using public getter
//         System.out.println("Age: " + person.getAge());
//     }
// }






//polymorphism with method overloading

// class Shape {
//     void draw() {
//         System.out.println("Drawing a shape");
//     }
// }

// class Circle extends Shape {
//     void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// class Square extends Shape {
//     void draw() {
//         System.out.println("Drawing a square");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Shape shape = new Shape();
//         Circle circle = new Circle();
//         Square square = new Square();
        
//         shape.draw();   // Calls the draw() method in Shape class
//         circle.draw();  // Calls the draw() method in Circle class
//         square.draw();  // Calls the draw() method in Square class
        
//         // Polymorphism with method overloading
//         drawShape(shape);   // Calls the draw() method in Shape class
//         drawShape(circle);  // Calls the draw() method in Circle class
//         drawShape(square);  // Calls the draw() method in Square class
//     }
    
//     static void drawShape(Shape shape) {
//         shape.draw();
//     }
// }



// @Override

// class Animal {
//     public void makeSound() {
//         System.out.println("The animal makes a sound");
//     }
// }

// class Dog extends Animal {
//    @Override
//     public void makeSound() {
//         System.out.println("The dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal animal = new Animal();
//         animal.makeSound(); // Output: The animal makes a sound
        
//         Dog dog = new Dog();
//         dog.makeSound();    // Output: The dog barks

//         Animal animal2 = new Dog();
//         animal2.makeSound();    // Output: The dog barks

        
//     }
// }




// Import the required Realm classes
import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

// Define a model class representing a Person
public class Person extends RealmObject {
    @PrimaryKey
    private int id;
    private String name;
    private int age;
    
    // Getters and setters for the fields
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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
}

// Main class to demonstrate Realm usage
public class Main {
    public static void main(String[] args) {
        // Initialize Realm
        Realm.init(getApplicationContext());
        
        // Obtain a Realm instance
        Realm realm = Realm.getDefaultInstance();
        
        // Create a new Person object
        Person person = new Person();
        person.setId(1);
        person.setName("John Doe");
        person.setAge(25);
        
        // Persist the person object to the database
        realm.beginTransaction();
        realm.copyToRealm(person);
        realm.commitTransaction();
        
        // Query the database for all Person objects
        RealmResults<Person> results = realm.where(Person.class).findAll();
        
        // Print the results
        for (Person p : results) {
            System.out.println("ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());
        }
        
        // Close the Realm instance when done
        realm.close();
    }
}

