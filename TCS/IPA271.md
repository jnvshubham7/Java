Create class Sim2 with below attributes:

id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.

This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and 
the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by 
means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above 
sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in 
main method to print the id's of the result obtained.

Input
--------------------------
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

Output
--------------------------
4
3
1
2

## Problem Statement

Create a `Sim2` class with attributes `id`, `company`, `balance`, `ratePerSecond`, and `circle`. Implement a `matchAndSort` method in the `Solution` class to filter and sort `Sim2` objects based on certain conditions.

## Code

[Sim2.java]
```java
public class Sim2 {
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim2(int id, String company, int balance, double ratePerSecond, String circle) {
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
```

[Solution.java]
```java
public class Solution {
    public static Sim2[] matchAndSort(Sim2[] sims, String search_circle, double search_rate) {
        Sim2[] result = new Sim2[0];
        for (Sim2 sim : sims) {
            if (sim.getCircle().equals(search_circle) && sim.getRatePerSecond() < search_rate) {
                result = add(result, sim);
            }
        }
        Arrays.sort(result, (a, b) -> Integer.compare(b.getBalance(), a.getBalance()));
        return result;
    }

    private static Sim2[] add(Sim2[] array, Sim2 obj) {
        Sim2[] newArray = new Sim2[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = obj;
        return newArray;
    }
}
```

[Main.java]
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id1 = scanner.nextInt();
        String company1 = scanner.next();
        int balance1 = scanner.nextInt();
        double rate1 = scanner.nextDouble();
        String circle1 = scanner.next();
        Sim2 sim1 = new Sim2(id1, company1, balance1, rate1, circle1);

        int id2 = scanner.nextInt();
        String company2 = scanner.next();
        int balance2 = scanner.nextInt();
        double rate2 = scanner.nextDouble();
        String circle2 = scanner.next();
        Sim2 sim2 = new Sim2(id2, company2, balance2, rate2, circle2);

        int id3 = scanner.nextInt();
        String company3 = scanner.next();
        int balance3 = scanner.nextInt();
        double rate3 = scanner.nextDouble();
        String circle3 = scanner.next();
        Sim2 sim3 = new Sim2(id3, company3, balance3, rate3, circle3);

        int id4 = scanner.nextInt();
        String company4 = scanner.next();
        int balance4 = scanner.nextInt();
        double rate4 = scanner.nextDouble();
        String circle4 = scanner.next();
        Sim2 sim4 = new Sim2(id4, company4, balance4, rate4, circle4);

        Sim2[] sims = new Sim2[] {sim1, sim2, sim3, sim4};

        String search_circle = scanner.next();
        double search_rate = scanner.nextDouble();

        Sim2[] result = Solution.matchAndSort(sims, search_circle, search_rate);

        for (Sim2 sim : result) {
            System.out.println(sim.getId());
        }
    }
}
```

## Explanation

The `Sim2` class has getter and setter methods for its attributes.

The `matchAndSort` method in the `Solution` class takes an array of `Sim2` objects, a search circle, and a search rate as parameters. It iterates over the array and filters out `Sim2` objects whose circle matches the search circle and rate per second is less than the search rate. The filtered array is then sorted in descending order based on the balance attribute.

In the `Main` method, values are read from the input and used to create `Sim2` objects. The `matchAndSort` method is called with the array of `Sim2` objects, the search circle, and the search rate. The result is then printed to the console.

## Input

```
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
```

## Output

```
4
3
1
2
```