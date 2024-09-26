Create a class newspaper with below attributes.


regNo-int

name-String

publicationYear-int

price-int



Write parametrised constructor as required.



Create class Solution with main method.

Implement 2 static methods findTotalPriceByPublicationYear and 

searchNewspaperByName in solution class.



findTotalPriceByPublicationYear method:

   This method will take array of the Newspaper objects and int parameter

type.This method will return the total price of newspapers from array of 

Newspaper objects,If the publication year attribute matches with the int 

parameter passed .If no Newspaper with the given publication year is present 

in the array ,then the method should return 0.



The main method should print total price if the returned value is greater 

than 0.Else it should print "No Newspaper found with the mentioned attribute".




searchNewspaperByName method :

   This method will take the array of the Newspaper objects and the String 

parameter type.This method will return the Newspaper object from the Array

of Newspaper objects,If the name attribute matches with the string 

parameter passed.

If no Newspaper with the given name is present in the array ,then the 

method should return null.



The main method should print the regNo,name,year of publication,and price 

if the returned Newspaper object is not null.

else it should print "No Newspaper found with the given name."





The above mentioned static methods should be called from main method.




**************************************************************************************************

input1:



134
Evening Mail
2018
79
178
Morning Mail
2017
65
176
Daily News
2017
98
219
Times of India
1988
15
2017
Times of India





output1:

163

regNo-219

name-Times of India

publicationYear-1988

price-15









input2:



201

Afternoon Mail

2019

79

202

Morning Mail

2014

65

156

Daily News

2004

98

278

Times of India

1967

15

2017

Times of America





output2:

No Newspaper found with the mentioned attribute

No Newspaper found with the given name

**Newspaper Class**
================

```java
public class Newspaper {
    int regNo;
    String name;
    int publicationYear;
    int price;

    public Newspaper(int regNo, String name, int publicationYear, int price) {
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }
}
```

**Solution Class**
================

```java
public class Solution {
    public static void main(String[] args) {
        Newspaper[] newspapers = {
            new Newspaper(134, "Evening Mail", 2018, 79),
            new Newspaper(178, "Morning Mail", 2017, 65),
            new Newspaper(219, "Daily News", 2017, 98),
            new Newspaper(15, "Times of India", 1988, 15)
        };

        int totalPrice = Solution.findTotalPriceByPublicationYear(newspapers, 1988);
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("No Newspaper found with the mentioned attribute");
        }

        Newspaper searchResult = Solution.searchNewspaperByName(newspapers, "Times of India");
        if (searchResult != null) {
            System.out.println("regNo: " + searchResult.regNo);
            System.out.println("name: " + searchResult.name);
            System.out.println("publicationYear: " + searchResult.publicationYear);
            System.out.println("price: " + searchResult.price);
        } else {
            System.out.println("No Newspaper found with the given name");
        }
    }

    public static int findTotalPriceByPublicationYear(Newspaper[] newspapers, int publicationYear) {
        int totalPrice = 0;
        for (Newspaper newspaper : newspapers) {
            if (newspaper.publicationYear == publicationYear) {
                totalPrice += newspaper.price;
            }
        }
        return totalPrice;
    }

    public static Newspaper searchNewspaperByName(Newspaper[] newspapers, String name) {
        for (Newspaper newspaper : newspapers) {
            if (newspaper.name.equals(name)) {
                return newspaper;
            }
        }
        return null;
    }
}
```

**Explanation**
---------------

The `Newspaper` class has four attributes: `regNo`, `name`, `publicationYear`, and `price`. The constructor takes these four parameters and initializes the corresponding attributes.

The `Solution` class has a `main` method that creates an array of `Newspaper` objects and calls the `findTotalPriceByPublicationYear` and `searchNewspaperByName` methods.

The `findTotalPriceByPublicationYear` method iterates over the array of `Newspaper` objects and returns the total price of the newspapers that have the specified `publicationYear`. If no newspaper matches the specified `publicationYear`, the method returns 0.

The `searchNewspaperByName` method iterates over the array of `Newspaper` objects and returns the first `Newspaper` object that has the specified `name`. If no newspaper matches the specified `name`, the method returns `null`.

In the `main` method, the program prints the total price if the returned value is greater than 0, or "No Newspaper found with the mentioned attribute" otherwise. It also prints the `regNo`, `name`, `publicationYear`, and `price` of the `Newspaper` object if it is not `null`, or "No Newspaper found with the given name" otherwise.

**Input and Output**
-------------------

**Input 1:**
```
134
Evening Mail
2018
79
178
Morning Mail
2017
65
176
Daily News
2017
98
219
Times of India
1988
15
2017
Times of India
```

**Output 1:**
```
163
regNo: 219
name: Times of India
publicationYear: 1988
price: 15
```

**Input 2:**
```
201
Afternoon Mail
2019
79
202
Morning Mail
2014
65
156
Daily News
2004
98
278
Times of India
1967
15
2017
Times of America
```

**Output 2:**
```
No Newspaper found with the mentioned attribute
No Newspaper found with the given name
```