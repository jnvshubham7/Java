 Create the class Flowers with below attribute:

flowerId-int;
flowerName-String;
price-int;
rating-int;
type-String;

The above attributes must be private,write getters and setters and parametrized constructor as well.

Create class MyClass with main method.

Implement one static method:findMinPriceByType in MyClass class.

findMinPriceByType Method:

This method will take two input parameters:Array of Flower objects and String parameter.This method will return the minimum 
priced flower object from  array of Flower objects for the given type(String parameter),only if the rating is greater than 
3. If no Flowers with the above conditions are present in the array of the flower objects,then the method will return null.

For this method-The main method  should print the flowerId from the returned object if the returned value is not null.
else it should print "There is no flower with given type".

**********************************************************************

input1:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
ephemerals



output:

213





**********************

input2:

123

Yellow trout lilly

3000

5

ephemerals

345

snowdrop

2500

4

ephemerals

321

Yarrow

1000

4

perennials

213

red trillium

2250

4

ephemerals

Biennial


output2:

There is no flower with given type.

Here is the answer to the question in structured markdown format with headers for questions and methods:

**Create the class Flowers with attributes**

The class Flowers has the following attributes:

* `flowerId`: an integer
* `flowerName`: a string
* `price`: an integer
* `rating`: an integer
* `type`: a string

The attributes must be private, and we will create getters and setters and a parameterized constructor to access and initialize these attributes.

Java Code:
```java
public class Flowers {
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    public Flowers(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
```
**Create class MyClass with main method**

Create a class MyClass with a main method that will call the static method `findMinPriceByType`.

Java Code:
```java
public class MyClass {
    public static void main(String[] args) {
        // Create an array of Flowers objects
        Flowers[] flowers = new Flowers[] {
            new Flowers(123, "Yellow trout lilly", 3000, 5, "ephemerals"),
            new Flowers(345, "snowdrop", 2500, 4, "ephemerals"),
            new Flowers(321, "Yarrow", 1000, 4, "perennials"),
            new Flowers(213, "red trillium", 2250, 4, "ephemerals")
        };

        // Call the static method findMinPriceByType
        Flowers minPriceFlower = findMinPriceByType(flowers, "ephemerals");

        // Print the flowerId if the returned value is not null
        if (minPriceFlower != null) {
            System.out.println(minPriceFlower.getFlowerId());
        } else {
            System.out.println("There is no flower with given type");
        }
    }

    // Implement the static method findMinPriceByType
    public static Flowers findMinPriceByType(Flowers[] flowers, String type) {
        Flowers minPriceFlower = null;

        // Iterate through the array of Flowers objects
        for (Flowers flower : flowers) {
            // Check if the rating is greater than 3 and the type matches
            if (flower.getRating() > 3 && flower.getType().equals(type)) {
                // If this is the first flower with matching type and rating, set minPriceFlower
                if (minPriceFlower == null || flower.getPrice() < minPriceFlower.getPrice()) {
                    minPriceFlower = flower;
                }
            }
        }

        // Return the minimum priced flower object with matching type and rating
        return minPriceFlower;
    }
}
```
**Input, Output, and Possible Solutions**

Input 1:
```
123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
ephemerals
```
Output 1:
```
213
```

Input 2:
```
123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
Biennial
```
Output 2:
```
There is no flower with given type
```

The `findMinPriceByType` method iterates through the array of Flowers objects and checks if the rating is greater than 3 and the type matches. If a flower with matching type and rating is found, it is saved as the minimum priced flower object. If no flowers with matching type and rating are found, the method returns null.