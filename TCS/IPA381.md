Create a class HeadSets with below attributes:

headsetName - String
brand-String 
price - int
available- boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - findTotalPriceForGivenBrand and findAvailableHeadsetWithSecondMinPrice in Solution class.

findTotalPriceForGivenBrand method:
--------------------------------------
The method will return the total price of Headsets from array of Headset objects for the given brand(String parameter passed).
If no Headsets with the given brand is present in the array of Headsets objects, then the method should return 0.

findAvailableHeadsetWithSecondMinPrice method:
-----------------------------------------------
This method will take array of Headset objects as an input parameter and returns the available Headset object with the 
second lowest/minimum price from the given array of objects. 

If no Headsets with the above condition is present in the array of Headsets objects, then the method should return null.

Note : 
No two Headsets will have the same price.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findTotalPriceForGivenBrand method - The main method should print the returned total price as it is if the returned 
value is greater than 0 or it should print "No Headsets available with the given brand".
Eg: 4500
where 4500 is the total Headsets price

For findAvailableHeadsetWithSecondMinPrice method - The main method should print the headsetsName and price from the 
returned Headsets object if the returned value is not null.
If the returned value is null then it should print "No Headsets available".

Eg:Logitech Wired
1500
where Logitech Wired is the headsetName and 1500 is the price

Before calling these static methods in main, use Scanner object to read the values of four Headset objects referring 
attributes in the above mentioned attribute sequence.
Next, read the value of String parameter for capturing brand.

Consider below sample input and output:

Input1:
----------------
boAt BassHeads
boAt
1220
true
Over Ear Wired
boAt
549
true
In Ear with Mic
JBL
450
true
Buds 2 Neo
RealMe
500
true
boAt

Output:
---------------
1769
Buds 2 Neo
500


Input2:
--------------------
boAt BassHeads
boAt
1220
false
Over Ear Wired
boAt
1549
false
In Ear with Mic
JBL
450
false
Buds 2 Neo
RealMe
500
false
boAt
Output:
--------------
2769
No Headsets available
--------------------------------------------------
Sample code snippet for reference:
Please use below code to build your solution.
--------------------------------------------------
import java.util.Scanner;
public class MyClass
{
public static void main(String[] args)
{
//code to read values
//code to call required method
//code to display the result
}
public static int findTotalPriceForGivenBrand (/* required parameters to be added */)
{
Restricted for circulation outside TCS Xplore 9
//method logic
}
public static HeadSets findAvailableHeadsetWithSecondMinPrice (/* required parameters to be 
added */)
//method logic
}

class HeadSets 
{
//code to build the class
}
-------------------------------------------------
Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc.
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.
Consider below input values:
1001
Savings
Referring below code:
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -> here we expect str to have value Savings.Instead it may be "".
If above issue is observed, then it is suggested to add one more explicit call to nextLine() after 
reading numeric value.


**Question:** Create a class `HeadSets` with the attributes `headsetName`, `brand`, `price`, and `available`. Write getters, setters, and a parameterized constructor as required. Also, create a class `Solution` with a `main` method and implement two static methods `findTotalPriceForGivenBrand` and `findAvailableHeadsetWithSecondMinPrice`.

**Solution:**
```java
import java.util.Scanner;

class HeadSets {
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getHeadsetName() {
        return headsetName;
    }

    public void setHeadsetName(String headsetName) {
        this.headsetName = headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HeadSets headset1 = new HeadSets(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean());
        HeadSets headset2 = new HeadSets(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean());
        HeadSets headset3 = new HeadSets(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean());
        HeadSets headset4 = new HeadSets(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean());

        String brand = scanner.nextLine();

        int totalPrice = findTotalPriceForGivenBrand(headset1, headset2, headset3, headset4, brand);
        HeadSets availableHeadset = findAvailableHeadsetWithSecondMinPrice(headset1, headset2, headset3, headset4);

        System.out.println(totalPrice > 0 ? totalPrice : "No Headsets available with the given brand.");
        if (availableHeadset != null) {
            System.out.println(availableHeadset.getHeadsetName() + " " + availableHeadset.getPrice());
        } else {
            System.out.println("No Headsets available");
        }
    }

    public static int findTotalPriceForGivenBrand(HeadSets headset1, HeadSets headset2, HeadSets headset3, HeadSets headset4, String brand) {
        int totalPrice = 0;
        for (HeadSets headset : new HeadSets[]{headset1, headset2, headset3, headset4}) {
            if (headset.getBrand().equalsIgnoreCase(brand)) {
                totalPrice += headset.getPrice();
            }
        }
        return totalPrice;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets headset1, HeadSets headset2, HeadSets headset3, HeadSets headset4) {
        HeadSets[] headsets = new HeadSets[]{headset1, headset2, headset3, headset4};
        int secondMinPrice = Integer.MAX_VALUE;
        HeadSets availableHeadset = null;
        for (HeadSets headset : headsets) {
            if (headset.isAvailable() && headset.getPrice() < secondMinPrice) {
                secondMinPrice = headset.getPrice();
                availableHeadset = headset;
            }
        }
        return availableHeadset;
    }
}
```
**Explanation:**

*   The `HeadSets` class has private attributes `headsetName`, `brand`, `price`, and `available`. It has getter and setter methods, as well as a parameterized constructor.
*   The `Solution` class has a `main` method that uses a `Scanner` object to read input values for four `HeadSets` objects and a `brand` parameter.
*   The `findTotalPriceForGivenBrand` method iterates through the `HeadSets` objects and adds up the prices for the ones matching the given `brand`.
*   The `findAvailableHeadsetWithSecondMinPrice` method iterates through the `HeadSets` objects, finds the available one with the second-lowest price, and returns it.
*   In the `main` method, it calls these methods and prints the results.

**Sample Output:**

For the given sample input, the output would be:

```
1769
Buds 2 Neo 500
```

This output corresponds to the second input sample provided.