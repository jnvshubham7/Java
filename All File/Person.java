abstract class AbstractPerson {
    int age;
    String name;

    public AbstractPerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    abstract void display();
}

public class Person extends AbstractPerson {

    public Person(int age, String name) {
        super(age, name);
    }

    @Override
    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person(23, "shubham");
        p.display();
    }
}











// public class Person {

//     int age;
//     String name;

//     // constructur
//     public Person(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public static void main(String[] args) {
//         Person shubham = new Person(23, "shubham");
//         Person rahul = new Person(22, "rahul");

//         System.out.println(shubham.age + " "+ shubham.name);
//         System.out.println(rahul.age +" " + rahul.name);

//     }

// }