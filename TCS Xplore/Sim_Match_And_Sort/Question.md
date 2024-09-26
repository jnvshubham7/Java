## Problem Statement

Create class Sim with below attributes:
id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.
This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above sequence along with a String search_circle and a double search_rate.
Then call the "matchAndSort" method and write logic in main method to print the id's of the result obtained.

## Input

    1
    jio
    430
    1.32
    mumbai
    2
    idea
    320
    2.26
    mumbai
    3
    airtel
    500
    2.54
    mumbai
    4
    vodafone
    640
    3.21
    mumbai
    mumbai
    3.4

## Output

    4
    3
    1
    2


## Problem Statement

Create class Sim with attributes:
id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.
This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above sequence along with a String search_circle and a double search_rate.
Then call the "matchAndSort" method and write logic in main method to print the id's of the result obtained.

## Java Code
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sim {
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

class Solution {
    public static Sim[] matchAndSort(Sim[] sims, String search_circle, double search_rate) {
        List<Sim> results = new ArrayList<>();
        for (Sim sim : sims) {
            if (sim.getCircle().equals(search_circle) && sim.getRatePerSecond() < search_rate) {
                results.add(sim);
            }
        }
        results.sort((a, b) -> Integer.compare(b.getBalance(), a.getBalance()));
        return results.toArray(new Sim[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        Sim[] sims = new Sim[4];
        sims[0] = new Sim(1, "jio", 430, 1.32, "mumbai");
        sims[1] = new Sim(2, "idea", 320, 2.26, "mumbai");
        sims[2] = new Sim(3, "airtel", 500, 2.54, "mumbai");
        sims[3] = new Sim(4, "vodafone", 640, 3.21, "mumbai");

        String search_circle = "mumbai";
        double search_rate = 3.4;

        Sim[] result = Solution.matchAndSort(sims, search_circle, search_rate);

        for (Sim sim : result) {
            System.out.println(sim.getId());
        }
    }
}
```

## Explanation

*   The code defines two classes, `Sim` and `Solution`. The `Sim` class represents a Sim object with attributes `id`, `company`, `balance`, `ratePerSecond`, and `circle`. The `Solution` class contains the `matchAndSort` method.
*   In the `matchAndSort` method, a list of `Sim` objects is created to store the results. The method iterates through the input array of `Sim` objects, filtering those that match the search circle and have a rate per second less than the search rate. The filtered list is then sorted by balance in descending order.
*   In the `Main` class, an array of `Sim` objects is created and populated with data. The `matchAndSort` method is called with the input data and the desired search circle and rate. The resulting array of `Sim` objects is then printed, displaying the IDs of the matching objects.
*   The output should be the IDs of the matching `Sim` objects, in the order of highest balance to lowest.

## Input

    1
    jio
    430
    1.32
    mumbai
    2
    idea
    320
    2.26
    mumbai
    3
    airtel
    500
    2.54
    mumbai
    4
    vodafone
    640
    3.21
    mumbai
    mumbai
    3.4

## Output

    4
    3
    1
    2