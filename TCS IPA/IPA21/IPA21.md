Create a class Fruits with below attributes as private
● int fruitId
● String fruitName
● int price
● int rating

Write getters, setters and parameterized constructor in the abovementioned attribute 
sequence as required.

Create class Solution with main method

Implement One static method-

● findMaximumPriceByRating

findMaximumPriceByRating in the solution class. 
This method will take array of Fruit objects, int paramater and returns the maximum priced fruit 
object from array of Fruit objects whichever has rating greater than the rating 
(rating parameter passed). This method should be called from main method.

Write code to perform following tasks:

1. Take necessary input variable and call findMaximumPriceByRating.

For this method- The main method should print the fruitId from returnedobject. As if the 
returned value is not null, or it should print "No such Fruit".

Note:- Before calling this static method, use Scanner object to read thevalues of four Fruits 
objects. No two Fruits will have same price. All thesearches should be case insensitive.
Consider below sample input and output to test your code.


Input
-------------------
555
Apple
200
5
777
Orange
150
4
333
Banana
100
4
888
Avocado
250
4
3

Output
-----------------
888

**Fruit Class**
================

```java
public class Fruits {
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    // Parameterized constructor
    public Fruits(int fruitId, String fruitName, int price, int rating) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    // Getters
    public int getFruitId() {
        return fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    // Setters
    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
```

**Solution Class**
================

```java
import java.util.Scanner;

public class Solution {
    public static Fruits findMaximumPriceByRating(Fruits[] fruits, int rate) {
        Fruits maxPricedFruit = null;
        for (Fruits fruit : fruits) {
            if (fruit.getRating() > rate && (maxPricedFruit == null || fruit.getPrice() > maxPricedFruit.getPrice())) {
                maxPricedFruit = fruit;
            }
        }
        return maxPricedFruit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fruits[] fruits = new Fruits[4];
        for (int i = 0; i < 4; i++) {
            fruits[i] = new Fruits(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt());
        }
        int rate = scanner.nextInt();
        Fruits maxPricedFruit = findMaximumPriceByRating(fruits, rate);
        if (maxPricedFruit != null) {
            System.out.println(maxPricedFruit.getFruitId());
        } else {
            System.out.println("No such Fruit");
        }
    }
}
```

**Explanation**
---------------

In the `Fruits` class, we have a private constructor with four parameters: `fruitId`, `fruitName`, `price`, and `rating`. We also have getters and setters for these attributes.

In the `Solution` class, we have a static method `findMaximumPriceByRating` that takes an array of `Fruits` objects and an integer `rate` as parameters. This method iterates through the array of `Fruits` objects and finds the maximum priced fruit that has a rating greater than the given `rate`. If no such fruit is found, it returns `null`.

In the `main` method, we create a `Scanner` object to read input from the user. We then read four `Fruits` objects from the user and store them in an array. We also read an integer `rate` from the user. We call the `findMaximumPriceByRating` method with the array of `Fruits` objects and the `rate` as parameters. If the method returns a non-null value, we print the `fruitId` of the returned `Fruits` object. Otherwise, we print "No such Fruit".

**Sample Input and Output**
-------------------------

Input:
```
555
Apple
200
5
777
Orange
150
4
333
Banana
100
4
888
Avocado
250
4
3
```
Output:
```
888
```

Note that the above input and output are just samples and may vary based on the actual input provided by the user.