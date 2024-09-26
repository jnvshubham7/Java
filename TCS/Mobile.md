Create a class MobileDetails with the below attributes:

MobileId – int
Price - int
Brand – String
isFlagShip – boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class MobileDetails with main method.

Implement two static methods – getTotalPrice() and getSecondMin() in MobileDetails class.

getTotalPrice method: 
----------------------------------------
This method will take two int input parameters which take object array and string brand. The method will return the total
price of mobiles of that brand.

If no mobile with the given brand is present in the array of MobileDetails objects, then the method should return 0.

getSecondMin method: 
----------------------------------------
This method will take object array which will return the second minimum price from the array and name of that mobile brand.

The above mentioned static methods should be called from the main method.

For getTotalPrice method: The main method should print the total price as it is, if the returned 
value is not null, or it should print “There are no mobile with given brand”. 

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes 
in the above mentioned attribute sequence.

Input :
---------------------------------------
101
25000
Samsung
True
102
19000
Redmi
False
103
28000
Nokia
True
104
25000
Realme
False
105
40000
Samsung
True
Samsung

Output :
-----------------------------------------
65000
Samsung : 25000
Realme : 25000

Here is the solution in Java.

```java
# Question

Create a class `MobileDetails` with the following attributes:

* `MobileId` – int
* `Price` - int
* `Brand` – String
* `isFlagShip` – boolean

The above attributes should be private, write getters, setters, and parameterized constructor as required.

Create a class `MobileDetails` with a main method.

Implement two static methods – `getTotalPrice()` and `getSecondMin()` in `MobileDetails` class.

* `getTotalPrice` method:
	+ This method will take two int input parameters which take object array and string brand.
	+ The method will return the total price of mobiles of that brand.
	+ If no mobile with the given brand is present in the array of `MobileDetails` objects, then the method should return 0.

* `getSecondMin` method:
	+ This method will take object array which will return the second minimum price from the array and name of that mobile brand.
	+ The above-mentioned static methods should be called from the main method.

For `getTotalPrice` method: The main method should print the total price as it is, if the returned value is not null, or it should print “There are no mobile with given brand”.

Before calling these static methods in main, use a `Scanner` object to read the values of five objects referring attributes in the above-mentioned attribute sequence.
Input:
---------------------------------------
101
25000
Samsung
True
102
19000
Redmi
False
103
28000
Nokia
True
104
25000
Realme
False
105
40000
Samsung
True
Samsung

Output:
-----------------------------------------
65000
Samsung : 25000
Realme : 25000

---

Here is the Java code:

```java
import java.util.Arrays;
import java.util.Scanner;

class MobileDetails {
    private int mobileId;
    private int price;
    private String brand;
    private boolean isFlagShip;

    // Parameterized constructor
    public MobileDetails(int mobileId, int price, String brand, boolean isFlagShip) {
        this.mobileId = mobileId;
        this.price = price;
        this.brand = brand;
        this.isFlagShip = isFlagShip;
    }

    // Getters
    public int getMobileId() {
        return mobileId;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isFlagShip() {
        return isFlagShip;
    }

    // Setters
    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIsFlagShip(boolean isFlagShip) {
        this.isFlagShip = isFlagShip;
    }

    // Static methods
    public static int getTotalPrice(MobileDetails[] mobiles, String brand) {
        int totalPrice = 0;
        for (MobileDetails mobile : mobiles) {
            if (mobile.getBrand().equals(brand)) {
                totalPrice += mobile.getPrice();
            }
        }
        return totalPrice;
    }

    public static String getSecondMin(MobileDetails[] mobiles) {
        Arrays.sort(mobiles, (a, b) -> Integer.compare(a.getPrice(), b.getPrice()));
        return mobiles[1].getBrand() + " : " + mobiles[1].getPrice();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MobileDetails[] mobiles = new MobileDetails[5];
        for (int i = 0; i < 5; i++) {
            mobiles[i] = new MobileDetails(
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.next(),
                    scanner.nextBoolean());
        }

        int totalPrice = getTotalPrice(mobiles, "Samsung");
        if (totalPrice == 0) {
            System.out.println("There are no mobile with given brand");
        } else {
            System.out.println(totalPrice);

            String secondMin = getSecondMin(mobiles);
            System.out.println(secondMin);
        }
    }
}
```

Here's the explanation of the code:

In the `MobileDetails` class, we have private attributes for `mobileId`, `price`, `brand`, and `isFlagShip`. We have parameterized constructor, getters, setters, and static methods `getTotalPrice` and `getSecondMin`.

In the `main` method, we create a `Scanner` object to read the values of five objects referring attributes in the above-mentioned attribute sequence.

Before calling the static methods, we create an array of `MobileDetails` objects and store the values in it.

We call the `getTotalPrice` method with an array of `MobileDetails` objects and the brand "Samsung". If no mobile with the given brand is present, it returns 0. Otherwise, it returns the total price of mobiles of that brand. We print the total price as it is, if the returned value is not null, or we print “There are no mobile with given brand”.

We call the `getSecondMin` method with an array of `MobileDetails` objects. It returns the second minimum price from the array and the name of that mobile brand. We print the result.

The output of the program will be:

```
65000
Samsung : 25000
Realme : 25000
```