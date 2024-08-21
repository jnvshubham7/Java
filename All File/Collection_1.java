import java.util.ArrayList;
import java.util.Collection;

public class Collection_1 {

    public static void main(String[] args) {

        Collection<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("burger");
        food.add("sandwich");

        System.out.println(food.contains("pizza"));
        food.remove("pizza");
        System.out.println(food.contains("pizza"));

        System.out.println(food.size());

        // Print food
        System.out.println(food);
    }
}
