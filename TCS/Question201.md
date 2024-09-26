## Problem Statement

Create a class NavalVessel with the below attributes:\
vesselld – int\
vesselName – String\
noOfVoyagesPlanned – int\
noOfVoyagesCompleted – int\
purpose – String\
classification – String

Write getters, setters for the above attributes. Create constructor which takes parameter in the above sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade in Solution class.

**findAvgVoyagesByPct method:**

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement as mentioned below.The percentage for each navalVessel is calculated as percentage .(noOfVoyagesCompleted \* 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are no objects with the mentioned criteria, then the method should return 0.

**findVesselByGrade method:**

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object.
Before returning the object, the classification should be derived as mentioned below. This classification value should be assigned to the object before returning. If any of the above conditions are not met, then the method should return null.
The classification attribute should be calculated based on the percentage calculation mentioned above. If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer otherwise the classification should be ‘Striver’
If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for percentage and purpose.

## Input

    111
    Rojer
    100
    100
    Passenger
    222
    Kalam
    200
    100
    Goods
    333
    Yashwin
    400
    300
    Army
    444
    Thanishwini
    500
    500
    Welfare
    75
    Army

## Output

    300
    Yashwin%Inspirer


## Problem Statement

Create a class NavalVessel with the below attributes:\
vesselld – int\
vesselName – String\
noOfVoyagesPlanned – int\
noOfVoyagesCompleted – int\
purpose – String\
classification – String

Write getters, setters for the above attributes. Create constructor which takes parameter in the above sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade in Solution class.

### Java Code

```java
import java.util.Scanner;

class NavalVessel {
    private int vesselld;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    public NavalVessel(int vesselld, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselld = vesselld;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    public int getVesselld() {
        return vesselld;
    }

    public void setVesselld(int vesselld) {
        this.vesselld = vesselld;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}

class Solution {
    public static double findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        double sum = 0;
        int count = 0;
        for (NavalVessel vessel : vessels) {
            double calcPercentage = (double) vessel.getNoOfVoyagesCompleted() * 100 / vessel.getNoOfVoyagesPlanned();
            if (calcPercentage >= percentage) {
                sum += vessel.getNoOfVoyagesCompleted();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public static NavalVessel findVesselByGrade(String purpose, NavalVessel[] vessels) {
        for (NavalVessel vessel : vessels) {
            if (vessel.getPurpose().equals(purpose)) {
                double calcPercentage = (double) vessel.getNoOfVoyagesCompleted() * 100 / vessel.getNoOfVoyagesPlanned();
                if (calcPercentage == 100) {
                    vessel.setClassification("Star");
                } else if (calcPercentage >= 80) {
                    vessel.setClassification("Leader");
                } else if (calcPercentage >= 55) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        System.out.println("No Naval Vessel is available with the specified purpose");
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NavalVessel[] vessels = new NavalVessel[4];
        for (int i = 0; i < 4; i++) {
            int vesselld = scanner.nextInt();
            String vesselName = scanner.next();
            int noOfVoyagesPlanned = scanner.nextInt();
            int noOfVoyagesCompleted = scanner.nextInt();
            String purpose = scanner.next();
            vessels[i] = new NavalVessel(vesselld, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        int percentage = scanner.nextInt();
        String purpose = scanner.next();

        double average = Solution.findAvgVoyagesByPct(vessels, percentage);
        System.out.println(average);

        NavalVessel vessel = Solution.findVesselByGrade(purpose, vessels);
        if (vessel != null) {
            System.out.println(vessel.getVesselName() + "%" + vessel.getClassification());
        }
    }
}

```

### Input

```
111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army
```

### Output

```
300
Yashwin%Inspirer
```

### Solution Explanation:

*   The given code is written in Java.
*   It creates a class called NavalVessel with the specified attributes.
*   The NavalVessel objects are created in the main method from the input provided.
*   The `findAvgVoyagesByPct` method calculates the average number of voyages completed for all NavalVessel objects that meet the given percentage requirement.
*   The `findVesselByGrade` method finds the NavalVessel that matches the given purpose and calculates the classification based on the percentage of voyages completed.
*   The main method uses the `findAvgVoyagesByPct` and `findVesselByGrade` methods to calculate the average and find the specified NavalVessel, respectively.
*   The output includes the calculated average and the found NavalVessel with its classification.