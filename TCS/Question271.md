## Problem Statement

Create class Sim with below attributes:
simId - int
customerName - String
balance - double
ratePerSecond - double
circle - String

Create class Solution and implement static method "transferCircle" in the Solution class.
This method will take array of Sim objects, circle1 String and circle2 string as parameters.
And will return another Sim array where the circle1 matches with the circle parameter of the original Sim array and the circle parameter of the new array is set to circle2 and is also sorted by means of ratePerSecond attribute in desending order.

Write necessary getters and setters.

Before calling "transferCircle" method in the main method, read values for five Sim objects referring the attributes in above sequence along with a String circlee1 and circle2.
Then call the "transferCircle" method and write logic in main method to print all the attributes of the result obtained.

## Input

    1
    raju
    130
    1.32
    mum
    2
    sachin
    120
    2.26
    ahd
    3
    ram
    200
    2.54
    kol
    4
    shubham
    640
    3.21
    ahd
    5
    kalpesh
    150
    1.8
    ahd
    ahd
    kol

## Output

    4 shubham kol 3.21
    2 sachin kol 2.26
    5 kalpesh kol 1.8


## Problem Statement

Create a class `Sim` with the following attributes:
* `simId`: `int`
* `customerName`: `String`
* `balance`: `double`
* `ratePerSecond`: `double`
* `circle`: `String`

Create a class `Solution` and implement a static method `transferCircle` in the `Solution` class.
This method will take an array of `Sim` objects, `circle1` `String`, and `circle2` `String` as parameters.
The method will return another `Sim` array where the `circle1` matches with the `circle` parameter of the original `Sim` array and the `circle` parameter of the new array is set to `circle2` and is also sorted by means of `ratePerSecond` attribute in descending order.

Write necessary getters and setters.

In the `main` method:
* Read values for five `Sim` objects referring to the attributes in the above sequence along with a `String` `circlee1` and `circle2`.
* Call the `transferCircle` method and write logic to print all the attributes of the result obtained.

## Input

```
1
raju
130
1.32
mum
2
sachin
120
2.26
ahd
3
ram
200
2.54
kol
4
shubham
640
3.21
ahd
5
kalpesh
150
1.8
ahd
ahd
kol
```

## Output

```
4 shubham kol 3.21
2 sachin kol 2.26
5 kalpesh kol 1.8
```

## Java Code

```java
import java.util.ArrayList;
import java.util.List;

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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
    public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
        List<Sim> result = new ArrayList<>();
        for (Sim sim : sims) {
            if (sim.getCircle().equals(circle1)) {
                sim.setCircle(circle2);
                result.add(sim);
            }
        }
        result.sort((a, b) -> Double.compare(b.getRatePerSecond(), a.getRatePerSecond()));
        return result.toArray(new Sim[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Sim[] sims = new Sim[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            sims[i] = new Sim(scanner.nextInt(), scanner.next(), scanner.nextDouble(), scanner.nextDouble(), scanner.next());
        }
        String circle1 = scanner.next();
        String circle2 = scanner.next();

        Sim[] result = Solution.transferCircle(sims, circle1, circle2);

        for (Sim sim : result) {
            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
        }
    }
}
```

## Explanation

The `Sim` class has five attributes: `simId`, `customerName`, `balance`, `ratePerSecond`, and `circle`. The `Solution` class has a static method `transferCircle` that takes an array of `Sim` objects, `circle1`, and `circle2` as parameters.

In the `main` method, we read values for five `Sim` objects and two strings, `circle1` and `circle2`, using a `Scanner`. We then call the `transferCircle` method and store the result in the `result` array.

Finally, we print all the attributes of the result obtained using a loop.

The `transferCircle` method iterates through the input array, checks if the `circle` attribute of each `Sim` object matches `circle1`, and if so, sets the `circle` attribute to `circle2`. It then sorts the resulting array of `Sim` objects in descending order based on the `ratePerSecond` attribute and returns the sorted array.

The output is printed in the desired format: `simId` `customerName` `circle` `ratePerSecond`.