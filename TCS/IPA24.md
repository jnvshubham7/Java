Create class Inventory with below attributes:

inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "Replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is greater than or equal to the original array of 
Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above 
sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling",
if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print 
"Moderate Filling". Else print "Non-Critical Filling"

Input
---------------------------
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling

Here is the response to the new question in a structured markdown format with headers for questions and methods.

### Problem Statement
Create a class `Inventory` with the following attributes:

* `inventoryId`: String
* `maximumQuantity`: int
* `currentQuantity`: int
* `threshold`: int

Create a class `Solution` and implement a static method `Replenish` in the `Solution` class. This method takes an array of `Inventory` objects and an `int` parameter `limit`. It returns another array of `Inventory` objects where the `limit` is greater than or equal to the original array of `Inventory` object's `threshold` attribute.

Write necessary getters and setters.

### Solution
Here is the Java code for the solution:
```java
public class Inventory {
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    // Getters and setters
    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}

public class Solution {
    public static Inventory[] Replenish(Inventory[] inventory, int limit) {
        List<Inventory> result = new ArrayList<>();
        for (Inventory item : inventory) {
            if (item.getThreshold() <= limit) {
                result.add(item);
            }
        }
        return result.toArray(new Inventory[0]);
    }
}
```
### Main Method
Here is the Java code for the main method:
```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Inventory[] inventory = new Inventory[4];
    for (int i = 0; i < 4; i++) {
        String inventoryId = scanner.next();
        int maximumQuantity = scanner.nextInt();
        int currentQuantity = scanner.nextInt();
        int threshold = scanner.nextInt();
        inventory[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
    }

    int limit = scanner.nextInt();
    Inventory[] replenishedInventory = Solution.Replenish(inventory, limit);

    for (Inventory item : replenishedInventory) {
        if (item.getThreshold() > 75) {
            System.out.println("Critical Filling");
        } else if (item.getThreshold() >= 50 && item.getThreshold() <= 75) {
            System.out.println("Moderate Filling");
        } else {
            System.out.println("Non-Critical Filling");
        }
    }
}
```
### Input and Output
Input:
```
1 100 50 50
2 200 60 40
3 150 35 45
4 80 45 40
45
```
Output:
```
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
```
Note that the actual output may vary based on the input values.