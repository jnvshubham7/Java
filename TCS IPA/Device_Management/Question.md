## Problem Statement

Create a class Phone with below attributes:
phoneId - int
os - String
brand - String
price - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with main method.

Implement two static methods - findPriceForGivenBrand and getPhoneIdBasedOnOs in Solution class.

findPriceForGivenBrand method:
This method will take two input parameters - array of Phone objects and string parameter brand.
The method will return the sum of the price attribute from phone objects for the brand passed as parameter.
If no phones with the given brand is present in the array of phone objects, then the method should return 0.

getPhoneIdBasedOnOs method:
This method will take a String parameter os, along with the array of Phone objects.
The method will return the phone object, if the input String parameter matches with the os attribute of the phone object and its price attribute is greater than or equal to 50000. If any of the conditions are not met, then the method should return null.

Note : No phone object would have the same value for os attribute.
All phone object would have the price greater than 0.
All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPriceForGivenBrand method - The main method should print the price as it is if the returned price is greater than 0, or it
should print "The given Brand is not available".

For getPhoneIdBasedOnOs method - The main method should print the phoneId of the returned phone object. If the returned value is null
then it should print "No phones are available with specified os and price range".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes in the above mentioned attribute sequence.
Next, read the value for brand and os.

## Input

    111
    iOS
    Apple
    30000
    222
    android
    Samsung
    50000
    333
    Symbian
    HTC
    12000
    444
    Paranoid
    HTC
    89000
    Blackberry
    aNdRoid

## Output

    The given Brand is not available
    222

## Starter Code

    public class Solution
    {

    public static void main(String[] args)
    {
    //code to read values
    //code to call required method
    //code to display the result
    }

    public static int findPriceForGivenBrand(Phone[] phone, String brand)
    {
    //method logic
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phone, String os)
    {
    //method logic
    }
    }

    class Phone
    {
    //code to build Phone class
    }


## Problem Statement

Create a class `Phone` with the following attributes:
* `phoneId` - `int`
* `os` - `String`
* `brand` - `String`
* `price` - `int`

Write getters, setters, and a parameterized constructor in the above-mentioned attribute sequence as required.

Create a class `Solution` with a `main` method.

Implement two static methods - `findPriceForGivenBrand` and `getPhoneIdBasedOnOs` in the `Solution` class.

## Code

```java
public class Solution {
    public static void main(String[] args) {
        // Read values using Scanner object
        Scanner scanner = new Scanner(System.in);
        Phone[] phones = new Phone[4];
        for (int i = 0; i < 4; i++) {
            phones[i] = new Phone(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
        }
        String brand = scanner.next();
        String os = scanner.next();

        // Call required methods
        int totalPrice = Solution.findPriceForGivenBrand(phones, brand);
        Phone phone = Solution.getPhoneIdBasedOnOs(phones, os);

        // Display results
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("The given Brand is not available");
        }
        if (phone != null) {
            System.out.println(phone.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int totalPrice = 0;
        for (Phone phone : phones) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                totalPrice += phone.getPrice();
            }
        }
        return totalPrice;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone : phones) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }
        return null;
    }
}

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
```

## Test Input

```
111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid
Apple
android
```

## Test Output

```
The given Brand is not available
222
```