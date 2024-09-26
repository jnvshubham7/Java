## Problem Statement

Create class Medicine with below attributes:
MedicineName - String
batch - String
disease - String
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class.
This method will take array of Medicine objects and a disease String as parameters.
And will return another sorted array of Integer objects where the disease String matches with the original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects referring the attributes in above sequence along with a String disease.
Then call the "getPriceByDisease" method and print the result.

## Input

    dolo650
    FAC124W
    fever
    100
    paracetamol
    PAC545B
    bodypain
    150
    almox
    ALM747S
    fever
    200
    aspirin
    ASP849Q
    flu
    250
    fever

## Output

    100
    200


## Problem Statement
Create class Medicine with below attributes:
MedicineName - String
batch - String
disease - String
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class.
This method will take array of Medicine objects and a disease String as parameters.
And will return another sorted array of Integer objects where the disease String matches with the original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects referring the attributes in above sequence along with a String disease.
Then call the "getPriceByDisease" method and print the result.

## Input

    dolo650
    FAC124W
    fever
    100
    paracetamol
    PAC545B
    bodypain
    150
    almox
    ALM747S
    fever
    200
    aspirin
    ASP849Q
    flu
    250
    fever

## Output

    100
    200

### Java Code
```java
import java.util.*;

class Medicine {
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Solution {
    public static Integer[] getPriceByDisease(Medicine[] medicines, String disease) {
        List<Integer> prices = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease)) {
                prices.add(medicine.getPrice());
            }
        }
        Collections.sort(prices);
        return prices.toArray(new Integer[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];
        for (int i = 0; i < 4; i++) {
            medicines[i] = new Medicine(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());
        }
        String disease = scanner.next();
        Integer[] prices = Solution.getPriceByDisease(medicines, disease);
        for (Integer price : prices) {
            System.out.println(price);
        }
    }
}
```

### Explanation
The provided problem statement is to create a class "Medicine" with attributes medicineName, batch, disease, and price. Create a class "Solution" with a static method "getPriceByDisease" that takes an array of "Medicine" objects and a disease string as parameters and returns a sorted array of integer objects where the disease string matches with the original array of Medicine object's disease attribute (case insensitive search).

The method "getPriceByDisease" iterates over each Medicine object in the array. If the disease of a medicine matches the given disease (case insensitive), it adds the price of that medicine to a list. After iterating over all medicine objects, it sorts the list of prices and returns it as an array of Integer objects.

In the main method, we create an array of Medicine objects by reading values from the user input and create an instance of the class "Solution" to call the "getPriceByDisease" method.

### Input
The input given is:

    dolo650
    FAC124W
    fever
    100
    paracetamol
    PAC545B
    bodypain
    150
    almox
    ALM747S
    fever
    200
    aspirin
    ASP849Q
    flu
    250
    fever

### Output
The output given is:

    100
    200