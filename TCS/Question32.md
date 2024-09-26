## Problem Statement

Create a class TravelAgencies with below attributes:\
regNo – int\
agencyName – String\
pakageType – String\
price – int\
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and agencyDetailsforGivenIdAndType in Solution class.

**findAgencyWithHighestPackagePrice method:**

This method will take array of TravelAgencies objects as an input parameter and return the highest package price from the given array of objects.

**agencyDetailsForGivenldAndType method:**

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String parameter packageType. The method will return the TravelAgencies object based on below conditions.

1. FlightFacility should be available.
2. The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.

If any of the above conditions are not met, then the method should return null.
Note : Same Travel agency can have more than one package type. Travel agency and package type combination is unique. All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is.
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned object.The AgencyName and price should be concatinated with : while printing.

## Input

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

## Output

    50000
    Cox and Kings:40000


Here is the solution to the problem:

```markdown
## Problem Statement

Create a class `TravelAgencies` with below attributes:
regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class `Solution` with main method. Implement two static methods – `findAgencyWithHighestPackagePrice` and `agencyDetailsforGivenIdAndType` in `Solution` class.

**findAgencyWithHighestPackagePrice method:**

This method will take array of `TravelAgencies` objects as an input parameter and return the highest package price from the given array of objects.

**agencyDetailsForGivenldAndType method:**

This method will take three input parameters -array of `TravelAgencies` objects, int parameter `regNo` and String parameter `packageType`. The method will return the `TravelAgencies` object based on below conditions.

1. FlightFacility should be available.
2. The input parameters(`regNo` and `packageType`) should matched with the `regNo` and `packageType` of `TravelAgencies` object.

If any of the above conditions are not met, then the method should return null.
Note : Same Travel agency can have more than one package type. Travel agency and package type combination is unique. All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For `findAgencyWithHighestPackagePrice` method – The main method should print the `highestPackagePrice` as it is.
For `agencyDetailsForGivenldAndType` method -The main method should print the `AgencyName` and `price` of the returned object.The `AgencyName` and `price` should be concatinated with : while printing.

## Input

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

## Output

    50000
    Cox and Kings:40000
```

```java
##
// TravelAgencies class

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

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

##
// Solution class

public class Solution {
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travelAgencies) {
        int highestPackagePrice = 0;
        for (TravelAgencies agency : travelAgencies) {
            if (agency.getPrice() > highestPackagePrice) {
                highestPackagePrice = agency.getPrice();
            }
        }
        return highestPackagePrice;
    }

    public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] travelAgencies, int regNo, String packageType) {
        for (TravelAgencies agency : travelAgencies) {
            if (agency.getRegNo() == regNo && agency.getPackageType().equalsIgnoreCase(packageType) && agency.isFlightFacility()) {
                return agency;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TravelAgencies[] travelAgencies = new TravelAgencies[] {
            new TravelAgencies(123, "A2Z Agency", "Platinum", 50000, true),
            new TravelAgencies(345, "SSS Agency", "Gold", 30000, false),
            new TravelAgencies(987, "Cox and Kings", "Diamond", 40000, true),
            new TravelAgencies(888, "Global Tours", "Silver", 20000, false),
            new TravelAgencies(987, "Diamond", "Diamond", 50000, true)
        };

        int highestPackagePrice = findAgencyWithHighestPackagePrice(travelAgencies);
        System.out.println(highestPackagePrice);

        TravelAgencies agency = agencyDetailsforGivenIdAndType(travelAgencies, 987, "Diamond");
        if (agency != null) {
            System.out.println(agency.getAgencyName() + ":" + agency.getPrice());
        }
    }
}
```

In the above code, we first define the `TravelAgencies` class with its attributes and getters and setters. Then we define the `Solution` class with two static methods `findAgencyWithHighestPackagePrice` and `agencyDetailsforGivenIdAndType`. In the `main` method, we create an array of `TravelAgencies` objects and call the static methods to find the highest package price and the agency details for the given ID and type. If the agency details are found, we print the agency name and price concatenated with a colon.

Note that in the `agencyDetailsforGivenIdAndType` method, we check if the flight facility is available and the input parameters match with the regNo and packageType of the TravelAgencies object. If any of the conditions are not met, we return null.

The output of the program will be:

```
50000
Cox and Kings:40000
```

The `findAgencyWithHighestPackagePrice` method correctly returns the highest package price, and the `agencyDetailsforGivenIdAndType` method correctly returns the agency details for the given ID and type.