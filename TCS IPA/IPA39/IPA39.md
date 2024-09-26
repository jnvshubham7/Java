Create a class Vegetable with below attributes:

VegetableId - int
VegetableName - String
Price - int
Rating - int

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - findMinimumPriceByRating in Solution class.

findMinimumPriceByRating method:
-----------------------------------------------
The method will return minimum price object from array of vegetable objects, whichever by rating greater than given rating.
If no vegetable with the above condition is present in the array of vegetable object, then the mothod return null.

Note : 
No vegetable has the same price.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findMinimumPriceByRating method - The main method should print the id of vegetable object or it should print 
"No such Vegetables".

Eg: 1002
where 1002 is the id whose price is lowest

Before calling these static methods in main, use Scanner object to read the values of four Vegetable objects referring 
attributes in the above mentioned attribute sequence.
Next, read the value of int parameter for rating.

Consider below sample input and output:

Input1
---------------------------
1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
2

Output1
-------------------------------
1002
=====================================================================================
Input2
---------------------------
1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
7

Output2
----------------------------
No such Vegetables

Here is the solution to the new question:

**Vegetable Class**
```java
public class Vegetable {
    private int vegetableId;
    private String vegetableName;
    private int price;
    private int rating;

    public Vegetable(int vegetableId, String vegetableName, int price, int rating) {
        this.vegetableId = vegetableId;
        this.vegetableName = vegetableName;
        this.price = price;
        this.rating = rating;
    }

    public int getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(int vegetableId) {
        this.vegetableId = vegetableId;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
```
**Solution Class**
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vegetable[] vegetables = new Vegetable[4];
        for (int i = 0; i < 4; i++) {
            vegetables[i] = new Vegetable(
                    Integer.parseInt(scanner.nextLine()),
                    scanner.nextLine(),
                    Integer.parseInt(scanner.nextLine()),
                    Integer.parseInt(scanner.nextLine())
            );
        }

        int rating = Integer.parseInt(scanner.nextLine());

        int minimumPriceId = findMinimumPriceByRating(vegetables, rating);

        if (minimumPriceId != -1) {
            System.out.println(minimumPriceId);
        } else {
            System.out.println("No such Vegetables");
        }
    }

    public static int findMinimumPriceByRating(Vegetable[] vegetables, int rating) {
        int minimumPriceId = -1;
        int minimumPrice = Integer.MAX_VALUE;

        for (Vegetable vegetable : vegetables) {
            if (vegetable.getRating() > rating && vegetable.getPrice() < minimumPrice) {
                minimumPrice = vegetable.getPrice();
                minimumPriceId = vegetable.getVegetableId();
            }
        }

        return minimumPriceId;
    }
}
```
**Input and Output**

Input 1:
```
1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
2
2
```
Output 1:
```
1002
```
Input 2:
```
1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
7
```
Output 2:
```
No such Vegetables
```
The `findMinimumPriceByRating` method iterates through the array of `Vegetable` objects and finds the object with the lowest price that has a rating greater than the given rating. If no such object is found, the method returns `-1`, which is handled in the `main` method to print "No such Vegetables".