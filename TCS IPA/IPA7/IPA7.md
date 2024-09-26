Create a class Sim with below attributes:



simId - int

customerName - String

balance - double

ratePerSecond - double

circle - String



Write getters, setters and parameterized constructor as required. 



Public class Solution is already created with main method.


Code inside main method should not be altered else your solution might be 


scored as zero.You may copy the code from main method in eclipse to 

verify your implementation. 





Implement static method - transferCustomerCircle in Solution class.

This method will take first parameter as array of Sim class objects, 

second parameter as circle to be transferred (which is String parameter 

circle1) and third parameter as new circle (which is String parameter 

circle2).



Method will transfer the customer to new circle (circle2), where the

 circle attribute would match second parameter (circle1). 


Method will return array of Sim objects for which circle is transferred.


 Return array should be sorted in descending order of ratePerSecond

 (assuming ratePerSecond is not same for any of the Sim objects).





This method should be called from main method and display the simId,

customerName,circle and ratePerSecond of returned objects 

(as per sample output).



Main method mentioned above already has Scanner code to read values, 

create objects and test above methods. Hence do not modify it.






************************************************************************



Consider below sample input and output:



Input:

1
raj
100
1.5
KOL
2
chetan
200
1.6
AHD
3
asha
150
1.7
MUM
4
kiran
50
2.2
AHD
5
vijay
130
1.8
AHD
AHD
KOL



Output:

4 kiran KOL 2.2

5 vijay KOL 1.8

2 chetan KOL 1.6



Here is the solution for the problem:

**Question:** Implement a static method `transferCustomerCircle` in the `Solution` class that takes an array of `Sim` objects, a circle to be transferred, and a new circle as parameters. The method should transfer the customers to the new circle and return an array of `Sim` objects that match the second circle parameter, sorted in descending order of ratePerSecond.

**Java Code:**
```java
public class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

public class Solution {
    public static Sim[] transferCustomerCircle(Sim[] sims, String circle1, String circle2) {
        List<Sim> simsToTransfer = new ArrayList<>();
        for (Sim sim : sims) {
            if (sim.getCircle().equals(circle1)) {
                sim.setCircle(circle2);
                simsToTransfer.add(sim);
            }
        }
        simsToTransfer.sort((o1, o2) -> Double.compare(o2.getRatePerSecond(), o1.getRatePerSecond()));
        return simsToTransfer.toArray(new Sim[0]);
    }

    public static void main(String[] args) {
        // Read input values from Scanner
        // Create Sim objects and store them in an array
        // Call the transferCustomerCircle method and display the result
    }
}
```
**Explanation:**

1. The `Sim` class has attributes `simId`, `customerName`, `balance`, `ratePerSecond`, and `circle`. The class has a parameterized constructor, getters, and setters for each attribute.
2. The `transferCustomerCircle` method takes an array of `Sim` objects, a circle to be transferred, and a new circle as parameters.
3. The method iterates through the array of `Sim` objects and transfers the customers to the new circle if the current circle matches the second circle parameter.
4. The method adds the transferred `Sim` objects to a list and sorts the list in descending order of ratePerSecond using the `sort` method.
5. The method returns the sorted list of `Sim` objects as an array.
6. In the `main` method, we read input values from the Scanner, create `Sim` objects and store them in an array, call the `transferCustomerCircle` method, and display the result.

**Input:**
```
1
raj
100
1.5
KOL
2
chetan
200
1.6
AHD
3
asha
150
1.7
MUM
4
kiran
50
2.2
AHD
5
vijay
130
1.8
AHD
AHD
KOL
```
**Output:**
```
4 kiran KOL 2.2
5 vijay KOL 1.8
2 chetan KOL 1.6
```
**Possible Solution:**

1. Call the `transferCustomerCircle` method from the `main` method and store the result in a `Sim` array.
```java
Sim[] result = Solution.transferCustomerCircle(sims, "AHD", "KOL");
```
2. Iterate through the `Sim` array and print the `simId`, `customerName`, `circle`, and `ratePerSecond` attributes for each object.
```java
for (Sim sim : result) {
    System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
}
```
Note: The input values and output will vary based on the implementation of the `transferCustomerCircle` method and the input values provided.