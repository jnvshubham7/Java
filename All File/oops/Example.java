public class Example {

   @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Using a deprecated method
        DeprecatedClass deprecatedObj = new DeprecatedClass();
        deprecatedObj.deprecatedMethod();
    }
}

class DeprecatedClass {
    
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }
}
