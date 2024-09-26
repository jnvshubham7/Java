Create class Medicine with below attributes: 

MedicineName - String 
batch - String 
disease - String 
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
This method will take array of Medicine objects and a disease String as parameters. 
And will return another sorted array of Integer objects where the disease String matches with the 
original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
method and print the result.

Input
-------------

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

Output
---------
100
200

Here's the Java code and explanation:

**Create Class Medicine and Solution**

---

### Question 1
Create class Medicine with below attributes: 
MedicineName - String 
batch - String 
disease - String 
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
This method will take array of Medicine objects and a disease String as parameters. 
And will return another sorted array of Integer objects where the disease String matches with the 
original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
method and print the result.

Input
-------------

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

Output
---------
100
200

### Java Code:

```java
public class Medicine {
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

public class Solution {
    public static int[] getPriceByDisease(Medicine[] medicines, String disease) {
        List<Integer> prices = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease)) {
                prices.add(medicine.getPrice());
            }
        }
        Integer[] result = prices.toArray(new Integer[0]);
        Arrays.sort(result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Medicine medicine1 = new Medicine("dolo650", "FAC124W", "fever", 100);
        Medicine medicine2 = new Medicine("paracetamol", "PAC545B", "bodypain", 150);
        Medicine medicine3 = new Medicine("almox", "ALM747S", "fever", 200);
        Medicine medicine4 = new Medicine("aspirin", "ASP849Q", "flu", 250);

        Medicine[] medicines = new Medicine[4];
        medicines[0] = medicine1;
        medicines[1] = medicine2;
        medicines[2] = medicine3;
        medicines[3] = medicine4;

        String disease = "fever";

        int[] result = Solution.getPriceByDisease(medicines, disease);
        for (int price : result) {
            System.out.println(price);
        }
    }
}
```

### Explanation:

*   We create a `Medicine` class with attributes `medicineName`, `batch`, `disease`, and `price`. We implement getters and setters for these attributes.
*   We create a `Solution` class and implement a static method `getPriceByDisease`. This method takes an array of `Medicine` objects and a `disease` string as parameters. It returns a sorted array of `Integer` objects where the `disease` string matches with the original array of `Medicine` object's `disease` attribute (case insensitive search).
*   In the `Main` class, we create four `Medicine` objects and store them in an array. We then call the `getPriceByDisease` method and pass the array and the `disease` string as parameters. The method returns a sorted array of prices for the `fever` disease, which are 100 and 200. We print the result.

### Input:

dolo650 FAC124W fever 100
paracetamol PAC545B bodypain 150
almox ALM747S fever 200
aspirin ASP849Q flu 250
fever