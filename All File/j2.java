
public class j2 {




class Parent {
    // this is method not a constructor
   public void Parent() {
    System.out.println("inside parent without arguments");
    }
    // this is default constructor.
   public Parent() {
    super(); // hidden call to Object's default constructor
    System.out.println("inside parent's default constructor");
    }
    public Parent(int a) {
    super(); // hidden call to Object's default constructor
    System.out.println("inside parent's argument constructor");
    }
   }
   class Child extends Parent {
    // this is a method
   public void Child() {
    System.out.println("inside child without arguments");
    }
    // this is a default constructor
    public Child() {
    super(); // hidden call to Parent's default constructor
    System.out.println("inside child's default constructor");
    }
    public Child(int b) {
    super(b); // Case - 1 : call to Parent's argument constructor
    System.out.println("inside child's argument constructor");
    }
    public static void main(String[] args) {
    Child child = new Child();
    Child child1 = new Child(15);
    }
   }
}