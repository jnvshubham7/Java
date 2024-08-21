// import org.jetbrains.annotations.NonNull;



// Class and Object

// Person.java
// public class Person {
//     // Fields
//     private String name;
//     private int age;

//     // Constructor
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // Methods
//     public void introduce() {
//         System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
//     }

//     // Getters and setters
//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }
// }







//encapsulation

// public class Person {
//     // Private fields
//     private String name;
//     private int age;

//     // Public getter for name
//     public String getName() {
//         return name;
//     }

//     // Public setter for name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // Public getter for age
//     public int getAge() {
//         return age;
//     }

//     // Public setter for age
//     public void setAge(int age) {
//         if (age < 0) {
//             System.out.println("Invalid age. Age cannot be negative.");
//         } else {
//             this.age = age;
//         }
//     }
// }






//encapsulation and access modifiers

// public class Person {
//     private String name; // private access modifier
//     private int age; // private access modifier
    
//     // Getter method for name
//     public String getName() {
//         return name;
//     }
    
//     // Setter method for name
//     public void setName(String name) {
//         this.name = name;
//     }
    
//     // Getter method for age
//     public int getAge() {
//         return age;
//     }
    
//     // Setter method for age
//     public void setAge(int age) {
//         if (age > 0) {
//             this.age = age;
//         } else {
//             System.out.println("Invalid age");
//         }
//     }
// }





//@NotNull

public class Person {
    private String name;

    public Person(@NonNull String name) {
        this.name = name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public @NonNull String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person(null); // Compiler or tool will warn about passing null
        System.out.println(person.getName()); // Compiler or tool will warn about potential null pointer
    }
}

