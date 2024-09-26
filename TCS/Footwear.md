create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.

create the class footwearProgrammm with the main method.
implement the 2 static methods.getCountByType and
getSecondHighestPriceByBrand in the Solution class.


getCountByType method:
   this method will take two input parameters.
array of the Footwear objects and string parameter footwear type.
this method will return the count of the footwears from array of the
footwear objects for the given type of footwear.
if no footwear with the given footwear type is found in the
array of footwear abjects,then the method should return 0.



getSecondHighestPriceByBrand method:
  this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
will return the second highest footwear objects based on the price from the array of the Footwear objects


whose brand name matches with the input string parameter.


if no footwear with the given brand is present in the array of the footwear objects,the the method
should return null.

NOTE: no two footwear objects would have the same footwearId.All the searches should be case insensitive.
the above mentioned static methods should be called from the main method.

for getCountByType method- the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print "Footwear not available";

for getSecondHighestPriceByBrand method-The main method should print price from the returned footwear objects


if the returned footwear object is not null.else it should print "Brand not available".
for example.
112
ABC
25555
  where 112 is the footwear id,ABC is brand name,25555 is price.

consider the sample input and output.
100
Sketchers
sneekers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok

Sample output:
3
99
reebok
5666

Sample input2:

100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
102
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata

Sample output:
Footwear not available
Brand not available


Here is the Java code with explanations, input, output, and possible solutions:

**Footwear Class**
```java
public class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    // Parameterized constructor
    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    // Getters and setters
    public int getFootwearId() {
        return footwearId;
    }

    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
```
**FootwearProgrammm Class**
```java
public class FootwearProgrammm {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Footwear[] footwearArray1 = {new Footwear(100, "Sketchers", "sneekers", 12345),
                                      new Footwear(103, "Puma", "running shoes", 10099),
                                      new Footwear(102, "Reebok", "Running shoes", 5667),
                                      new Footwear(101, "Reebok", "running shoes", 5656),
                                      new Footwear(99, "reebok", "floaters", 5666)};
        
        int count1 = solution.getCountByType(footwearArray1, "sneekers");
        if (count1 > 0) {
            System.out.println(count1);
        } else {
            System.out.println("Footwear not available");
        }

        Footwear[] footwearArray2 = {new Footwear(100, "Puma", "sneekers", 12345),
                                      new Footwear(101, "Puma", "sneekers", 10099),
                                      new Footwear(102, "Puma", "sneekers", 5000),
                                      new Footwear(102, "Reebok", "sneekers", 8000),
                                      new Footwear(104, "Puma", "floaters", 2000)};
        
        Footwear secondHighestPrice = solution.getSecondHighestPriceByBrand(footwearArray2, "Puma");
        if (secondHighestPrice != null) {
            System.out.println(secondHighestPrice.getPrice());
        } else {
            System.out.println("Brand not available");
        }
    }
}
```
**Solution Class**
```java
public class Solution {
    public static int getCountByType(Footwear[] footwearArray, String footwearType) {
        int count = 0;
        for (Footwear footwear : footwearArray) {
            if (footwear.getFootwearType().equalsIgnoreCase(footwearType)) {
                count++;
            }
        }
        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwearArray, String inputFootwearName) {
        Footwear secondHighestPrice = null;
        int secondHighestPriceValue = Integer.MIN_VALUE;
        for (Footwear footwear : footwearArray) {
            if (footwear.getFootwearName().equalsIgnoreCase(inputFootwearName)) {
                if (footwear.getPrice() > secondHighestPriceValue) {
                    secondHighestPriceValue = footwear.getPrice();
                    secondHighestPrice = footwear;
                } else if (footwear.getPrice() > secondHighestPriceValue && secondHighestPrice == null) {
                    secondHighestPriceValue = footwear.getPrice();
                    secondHighestPrice = footwear;
                }
            }
        }
        return secondHighestPrice;
    }
}
```
**Explanation**

* In the `Footwear` class, we have private attributes `footwearId`, `footwearName`, `footwearType`, and `price`. We have a parameterized constructor to initialize these attributes. We also have getter and setter methods for each attribute.
* In the `FootwearProgrammm` class, we create two arrays of `Footwear` objects and call the `getCountByType` and `getSecondHighestPriceByBrand` methods from the `Solution` class.
* In the `getCountByType` method, we iterate through the `footwearArray` and count the number of footwears with the given type. We return the count. If no footwears with the given type are found, we return 0.
* In the `getSecondHighestPriceByBrand` method, we iterate through the `footwearArray` and find the second highest price for each brand. We return the footwear object with the second highest price. If no footwears with the given brand are found, we return null.
* We call these methods from the `main` method of the `FootwearProgrammm` class and print the results.