public class StaticMembersExample {
    private static int counter = 0; // static variable

    public StaticMembersExample() {
        counter++; // increment counter each time a new instance is created
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        StaticMembersExample obj1 = new StaticMembersExample();
        StaticMembersExample obj2 = new StaticMembersExample();
        StaticMembersExample obj3 = new StaticMembersExample();

        System.out.println("Counter: " + StaticMembersExample.getCounter()); // accessing static member using class name

        StaticMembersExample.staticMethod(); // calling static method using class name
    }
}
