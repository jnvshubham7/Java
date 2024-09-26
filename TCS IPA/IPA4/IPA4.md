Create a class College with the below attributes.

 id-int 

 name -String 

 contactNo-int

 address-String 

 pinCode-int



Write the getters and setters and parametrized constructor in the above 

mentioned sequence as required.



Create the class Solution with the main method.

Implement the two static methods:

 1.findCollegeWithMaximumPincode 

 2.searchCollegeByAddress



findCollegeWithMaximumPincode method:

   Create the Static method in the Solution Class.

 This method will take array of the College objects and return the 

College object having maximum pincode if found else return null if not 

found.

   for this method ,main method will print College object with maximum

pincode if the returned value is not null.if the returned value is null ,


then the main method will print "No college found with mentioned attribute".





searchCollegeByAddress method:

   Create the Static method in the Solution Class.

This method will take array of College objects as input and address as 

input and return College object having the mentioned address if found 

else return null if not found.

   for this method main method will print College object details as it is ,

 if the returned value is not null.if the returned value is null then ,


main method will print "No college found with mentioned attribute".


 

***************************************************************************

input 1:

4
109 
ACT
2500256
mumbai
695001
107
MCE
2500254
malapuram
612354
113
CTE
2500252
chennai
623145
102
SCT
2500255
AP
523641
AP



OUTPUT1:

id-109

name-ACT

contactNo-2500256

address-mumbai

pincode-695001

id-102

name-SCT

contactNo-2500255

address-AP

pincode-523641







INPUT2:

4
111
MJT
2500251
Calicut
401235
105
MET
2500256
kochi
668745
115
IIT
2500262
banglore
569874
110
ACT
2500263
delhi
687945
delhi


output2:

id-110

name-ACT

contactNo-2500263

address-delhi

pincode-687945

id-110

name-ACT

contactNo-2500263

address-delhi

pincode-687945

Here is the Java code with explanations and solutions for the given problem.

**College Class**

```java
public class College {
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pinCode;

    // parametrized constructor
    public College(int id, String name, int contactNo, String address, int pinCode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public int getPinCode() {
        return pinCode;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
```

**Solution Class**

```java
public class Solution {
    public static College findCollegeWithMaximumPincode(College[] colleges) {
        College maxPinCodeCollege = null;
        int maxPinCode = Integer.MIN_VALUE;

        for (College college : colleges) {
            if (college.getPinCode() > maxPinCode) {
                maxPinCode = college.getPinCode();
                maxPinCodeCollege = college;
            }
        }

        return maxPinCodeCollege;
    }

    public static College searchCollegeByAddress(College[] colleges, String address) {
        for (College college : colleges) {
            if (college.getAddress().equals(address)) {
                return college;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        // input 1
        College[] colleges1 = new College[6];
        colleges1[0] = new College(109, "ACT", 2500256, "mumbai", 695001);
        colleges1[1] = new College(107, "MCE", 2500254, "malapuram", 612354);
        colleges1[2] = new College(113, "CTE", 2500252, "chennai", 623145);
        colleges1[3] = new College(102, "SCT", 2500255, "AP", 523641);
        College maxPinCodeCollege1 = findCollegeWithMaximumPincode(colleges1);
        if (maxPinCodeCollege1 != null) {
            System.out.println("id-" + maxPinCodeCollege1.getId());
            System.out.println("name-" + maxPinCodeCollege1.getName());
            System.out.println("contactNo-" + maxPinCodeCollege1.getContactNo());
            System.out.println("address-" + maxPinCodeCollege1.getAddress());
            System.out.println("pincode-" + maxPinCodeCollege1.getPinCode());
        } else {
            System.out.println("No college found with mentioned attribute");
        }

        // input 2
        College[] colleges2 = new College[6];
        colleges2[0] = new College(111, "MJT", 2500251, "Calicut", 401235);
        colleges2[1] = new College(105, "MET", 2500256, "kochi", 668745);
        colleges2[2] = new College(115, "IIT", 2500262, "banglore", 569874);
        colleges2[3] = new College(110, "ACT", 2500263, "delhi", 687945);
        College maxPinCodeCollege2 = findCollegeWithMaximumPincode(colleges2);
        if (maxPinCodeCollege2 != null) {
            System.out.println("id-" + maxPinCodeCollege2.getId());
            System.out.println("name-" + maxPinCodeCollege2.getName());
            System.out.println("contactNo-" + maxPinCodeCollege2.getContactNo());
            System.out.println("address-" + maxPinCodeCollege2.getAddress());
            System.out.println("pincode-" + maxPinCodeCollege2.getPinCode());
        } else {
            System.out.println("No college found with mentioned attribute");
        }
    }
}
```

In the above code, we first create the `College` class with the required attributes and methods. Then, we create the `Solution` class with the two static methods `findCollegeWithMaximumPincode` and `searchCollegeByAddress`. In the `findCollegeWithMaximumPincode` method, we iterate through the array of `College` objects and find the one with the maximum pin code. In the `searchCollegeByAddress` method, we iterate through the array of `College` objects and find the one with the matching address.

In the `main` method, we create an array of `College` objects for each input and call the `findCollegeWithMaximumPincode` method to find the college with the maximum pin code. If the method returns a non-null value, we print the college details. Otherwise, we print "No college found with mentioned attribute".