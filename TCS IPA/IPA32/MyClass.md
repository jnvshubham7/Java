Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000

**TravelAgencies Class**
======================

The `TravelAgencies` class is defined with the following attributes:

* `regNo` - `int`
* `agencyName` - `String`
* `packageType` - `String`
* `price` - `int`
* `flightFacility` - `boolean`

The class has the following methods:

### Getters

* `getRegNo()`: Returns the `regNo` attribute.
* `getAgencyName()`: Returns the `agencyName` attribute.
* `getPackageType()`: Returns the `packageType` attribute.
* `getPrice()`: Returns the `price` attribute.
* `getFlightFacility()`: Returns the `flightFacility` attribute.

### Setters

* `setRegNo(int regNo)`: Sets the `regNo` attribute.
* `setAgencyName(String agencyName)`: Sets the `agencyName` attribute.
* `setPackageType(String packageType)`: Sets the `packageType` attribute.
* `setPrice(int price)`: Sets the `price` attribute.
* `setFlightFacility(boolean flightFacility)`: Sets the `flightFacility` attribute.

### Constructor

* `TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility)`: Creates a new `TravelAgencies` object with the given parameters.

**Solution Class**
================!=

The `Solution` class has the following methods:

### Static Methods

* `findAgencyWithHighestPackagePrice(TravelAgencies[] agencies)`: Returns the highest package price from the given array of `TravelAgencies` objects.
* `agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType)`: Returns the `TravelAgencies` object that matches the given `regNo` and `packageType` and has the `flightFacility` attribute set to `true`.

### Main Method

The `main` method is used to test the `findAgencyWithHighestPackagePrice` and `agencyDetailsForGivenIdAndType` methods.

**Input**
-------

The input is provided as follows:
```
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
```
**Output**
-------

The output is expected to be:
```
50000
Cox and Kings:40000
```
**Solution Code**
```
public class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

public class Solution {
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int highestPrice = 0;
        for (TravelAgencies agency : agencies) {
            if (agency.getPrice() > highestPrice) {
                highestPrice = agency.getPrice();
            }
        }
        return highestPrice;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
        for (TravelAgencies agency : agencies) {
            if (agency.getRegNo() == regNo && agency.getPackageType().equalsIgnoreCase(packageType) && agency.getFlightFacility()) {
                return agency;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TravelAgencies[] agencies = {
            new TravelAgencies(123, "A2Z Agency", "Platinum", 50000, true),
            new TravelAgencies(345, "SSS Agency", "Gold", 30000, false),
            new TravelAgencies(987, "Cox and Kings", "Diamond", 40000, true),
            new TravelAgencies(888, "Global Tours", "Silver", 20000, false),
            new TravelAgencies(987, "Diamond", "Diamond", 40000, true)
        };

        int highestPrice = findAgencyWithHighestPackagePrice(agencies);
        System.out.println(highestPrice);

        TravelAgencies agency = agencyDetailsForGivenIdAndType(agencies, 987, "Diamond");
        if (agency != null) {
            System.out.println(agency.getAgencyName() + ":" + agency.getPrice());
        }
    }
}
```
**Explanation**
--------------

The `TravelAgencies` class has been defined with the required attributes and methods.

The `findAgencyWithHighestPackagePrice` method iterates through the array of `TravelAgencies` objects and finds the highest package price.

The `agencyDetailsForGivenIdAndType` method iterates through the array of `TravelAgencies` objects and finds the object that matches the given `regNo` and `packageType` and has the `flightFacility` attribute set to `true`.

In the `main` method, the `findAgencyWithHighestPackagePrice` method is called to get the highest package price, which is printed to the console. Then, the `agencyDetailsForGivenIdAndType` method is called to get the `TravelAgencies` object that matches the given `regNo` and `packageType`, and the object's `agencyName` and `price` are printed to the console, concatenated with a colon.