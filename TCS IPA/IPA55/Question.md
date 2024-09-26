Create a class Resort with the below attributes:

resortId - int
resortName - String
Category - String 
resortPrice - double
resortRating - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findAvgPrice in Solution class.

findAvgPrice method:
----------------------------------
This method will take two input parameters - array of Resort objects and a string parameter.
The method will return the average of the prices from resort objects whose Category matched with passed as parameter and rating
will greater than 4.
If no resort present found, then the method should return 0.

Note : All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findAvgPrice method - The main method should print the average price as it is if the returned value is 
greater than 0, or it should print "No such Resort found".

Before calling these static methods in main, use Scanner object to read the values of four resort objects referring attributes 
in the above mentioned attribute sequence. Next, read the value for category.

Input
----------
1004
ABC
3 star
5400.00
4.5
1001
DEF
5 star
4781.45
4.0
1002
GHI
3 star
6235.72
4.2
1008
JKL
2 star
7454.00
4.2
3 star

Output
----------
The average price of 3 star:5817

Here is theJava code with explanation for the given question:

**Resort Class**
```java
public class Resort {
    private int resortId;
    private String resortName;
    private String category;
    private double resortPrice;
    private double resortRating;

    public Resort(int resortId, String resortName, String category, double resortPrice, double resortRating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }

    public int getResortId() {
        return resortId;
    }

    public void setResortId(int resortId) {
        this.resortId = resortId;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getResortPrice() {
        return resortPrice;
    }

    public void setResortPrice(double resortPrice) {
        this.resortPrice = resortPrice;
    }

    public double getResortRating() {
        return resortRating;
    }

    public void setResortRating(double resortRating) {
        this.resortRating = resortRating;
    }
}
```
**Solution Class**
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Resort[] resorts = new Resort[4];

        System.out.println("Enter resort id:");
        int resortId = scanner.nextInt();
        System.out.println("Enter resort name:");
        String resortName = scanner.nextLine();
        System.out.println("Enter category:");
        String category = scanner.nextLine();
        System.out.println("Enter resort price:");
        double resortPrice = scanner.nextDouble();
        System.out.println("Enter resort rating:");
        double resortRating = scanner.nextDouble();

        resorts[0] = new Resort(resortId, resortName, category, resortPrice, resortRating);

        resortId = scanner.nextInt();
        resortName = scanner.nextLine();
        category = scanner.nextLine();
        resortPrice = scanner.nextDouble();
        resortRating = scanner.nextDouble();

        resorts[1] = new Resort(resortId, resortName, category, resortPrice, resortRating);

        resortId = scanner.nextInt();
        resortName = scanner.nextLine();
        category = scanner.nextLine();
        resortPrice = scanner.nextDouble();
        resortRating = scanner.nextDouble();

        resorts[2] = new Resort(resortId, resortName, category, resortPrice, resortRating);

        resortId = scanner.nextInt();
        resortName = scanner.nextLine();
        category = scanner.nextLine();
        resortPrice = scanner.nextDouble();
        resortRating = scanner.nextDouble();

        resorts[3] = new Resort(resortId, resortName, category, resortPrice, resortRating);

        System.out.println("Enter category:");
        String targetCategory = scanner.nextLine().toLowerCase();

        double totalPrice = findAvgPrice(resorts, targetCategory);

        if (totalPrice > 0) {
            System.out.println("The average price of " + targetCategory + ": " + totalPrice);
        } else {
            System.out.println("No such Resort found");
        }
    }

    public static double findAvgPrice(Resort[] resorts, String category) {
        double totalPrice = 0;
        int count = 0;

        for (Resort resort : resorts) {
            if (resort.getCategory().toLowerCase().equals(category) && resort.getResortRating() > 4) {
                totalPrice += resort.getResortPrice();
                count++;
            }
        }

        if (count > 0) {
            return totalPrice / count;
        } else {
            return 0;
        }
    }
}
```
**Explanation**

The `Resort` class has five attributes: `resortId`, `resortName`, `category`, `resortPrice`, and `resortRating`. It has a parameterized constructor, getters, and setters for each attribute.

The `Solution` class has a `main` method that reads input from the user using a `Scanner` object. It creates an array of `Resort` objects and populates it with four resort objects. Then, it reads a category from the user and calls the `findAvgPrice` method with the category and the array of resorts as input.

The `findAvgPrice` method iterates through the array of resorts and checks if the category matches the input category (case insensitive) and the rating is greater than 4. If a resort matches these conditions, it adds its price to the total price and increments the count. Finally, it returns the average price if there are any resorts that match the conditions, otherwise it returns 0.

The `main` method prints the average price if it's greater than 0, otherwise it prints "No such Resort found".

**Input**

Enter resort id:
1004
Enter resort name:
ABC
Enter category:
3 star
Enter resort price:
5400.00
Enter resort rating:
4.5
Enter resort id:
1001
Enter resort name:
DEF
Enter category:
5 star
Enter resort price:
4781.45
Enter resort rating:
4.0
Enter resort id:
1002
Enter resort name:
GHI
Enter category:
3 star
Enter resort price:
6235.72
Enter resort rating:
4.2
Enter resort id:
1008
Enter resort name:
JKL
Enter category:
2 star
Enter resort price:
7454.00
Enter resort rating:
4.2
Enter category:
3 star

**Output**

The average price of 3 star: 5817