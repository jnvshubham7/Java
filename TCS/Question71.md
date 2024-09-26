## Problem Statement

Create class Inventory with below attributes:
inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is lesser than or equal to the original array of Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "replenish" method in the main method, read values for four Inventory objects referring the attributes in above sequence along with a int limit.
Then call the "replenish" method and write logic in main method to print "Critical Filling",if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print "Moderate Filling". Else print "Non-Critical Filling"

## Input

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

## Output

    2 Non-Critical Filling
    3 Non-Critical Filling
    4 Non-Critical Filling


Here is the Java code and its explanation with input, output, and possible solutions:
```
## Problem Statement

### Class Inventory
```java
class Inventory {
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
```
### Class Solution
```java
class Solution {
    static Inventory[] replenish(Inventory[] inventories, int limit) {
        ArrayList<Inventory> filteredInventories = new ArrayList<>();
        for (Inventory inventory : inventories) {
            if (inventory.getThreshold() <= limit) {
                filteredInventories.add(inventory);
            }
        }
        return (Inventory[]) filteredInventories.toArray(new Inventory[0]);
    }
}
```
### Main Method
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory[] inventories = new Inventory[4];
        int limit = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            inventories[i] = new Inventory(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }

        Inventory[] filteredInventories = Solution.replenish(inventories, limit);

        for (Inventory inventory : filteredInventories) {
            if (inventory.getThreshold() > 75) {
                System.out.println(inventory.getInventoryId() + " Critical Filling");
            } else if (inventory.getThreshold() >= 50 && inventory.getThreshold() <= 75) {
                System.out.println(inventory.getInventoryId() + " Moderate Filling");
            } else {
                System.out.println(inventory.getInventoryId() + " Non-Critical Filling");
            }
        }
    }
}
```
## Input

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

## Output

    2 Non-Critical Filling
    3 Non-Critical Filling
    4 Non-Critical Filling

Possible Solution:

The problem is to filter the inventory array based on the threshold value and limit provided. The threshold value should be less than or equal to the limit. Then, check the threshold value and print the corresponding filling message.

In the main method, we read the input values for the inventory objects and store them in an array. Then, we call the `replenish` method to filter the inventory array based on the limit. Finally, we loop through the filtered array and print the filling messages based on the threshold value.

Note that the `Scanner` class is used to read the input values from the console, and the `ArrayList` class is used to store the filtered inventory array. The `toArray` method is used to convert the `ArrayList` to a regular array.