import java.util.ResourceBundle;
import java.util.Locale;


public class ResourceBundleExample {
    public static void main(String[] args) {
        // Load the bundle for the English language
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en"));

        // Accessing resources from the bundle
        String greeting = bundle.getString("greeting");
        String question = bundle.getString("question");

        // Print the localized messages
        System.out.println(greeting);   // Output: Hello!
        System.out.println(question);   // Output: How are you?

        // Load the bundle for the French language
        bundle = ResourceBundle.getBundle("messages", new Locale("fr"));

        // Accessing resources from the French bundle
        greeting = bundle.getString("greeting");
        question = bundle.getString("question");

        // Print the localized messages
        System.out.println(greeting);   // Output: Bonjour!
        System.out.println(question);   // Output: Comment ça va?
    }
}
