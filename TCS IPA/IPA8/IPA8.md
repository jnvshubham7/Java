Create a class Hotel with the below attributes:
 
hotelId - int
hotelName - String
dateOfBooking – String (in the format dd-mon-yyyy)
noOfRoomsBooked – int
wifiFacility – String
totalBill- double



The above attributes should be private, write getters, setters and parameterized constructor as required.
 
Create class Solution with main method.
 
Implement two static methods – noOfRoomsBookedInGivenMonth and searchHotelByWifiOption in Solution class.
 
noOfRoomsBookedInGivenMonth method:
This method will take two input parameter - array of Hotel objects and a String parameter.
The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String parameter passed).
If no rooms are booked for the given month in the array of Hotel objects, then the method should return 0.



searchHotelByWifiOption method:
This method will take two input parameter - array of Hotel objects and a String parameter
The method will return Hotel object with second highest totalbill, from the array of Hotel objects where wifiFacility attribute 
matches with the given wifi facility(String parameter passed).
If no Hotel with the given wifi option is present in the array of Hotel objects, then the method should return null.
 
Note : 
No two Hotel object would have the same hotelId.
No two Hotel object would have the same totalbill.
The Array either has at least two objects with specified wifi option OR  no object with specified wifi option. 
All the searches should be case insensitive. 
dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)
 
The above mentioned static methods should be called from the main method. 
 
For noOfRoomsBookedInGivenMonth method - The main method should print the total number of booked rooms as it is, 
if the returned value is greater than 0, else it should print "No rooms booked in the given month"
 
For searchHotelByWifiOption method - The main method should print the hotelId from the returned Hotel object if the returned value is not null. 
If the returned value is null then it should print "No such option available".
 
Before calling these static methods in main, use Scanner object to read the values of four Hotel objects referring attributes in the above mentioned attribute sequence. 
Next, read the value of two String parameters for capturing the month and wifi option .



Consider below sample input and output:


Input1:
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May
Yes
 
Output1:
5
103



Input2:
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May1
Yes1



Output2:
No rooms booked in the given month
No such option available

--------------------------------------------------
Sample code snippet for reference: 
Please use below code to build your Solution.
--------------------------------------------------
import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
 {
    //code to read values 
  //code to call required method
  //code to display the result
 }
    
 //code the first method 
  
    
 //code the second method    

}
    
//code the class

-------------------------------------------------
Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:
1001
Savings

Referring below code:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -&gt; here we expect str to have value Savings.Instead it may be "".

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.


Here is the solution in Java, along with explanations, input, output, and possible solutions:

**Question:** Create a class Hotel with the given attributes and methods, and then create a class Solution with a main method and two static methods noOfRoomsBookedInGivenMonth and searchHotelByWifiOption.

**Solution:**
```java
import java.util.Scanner;
import java.util.Arrays;

public class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];

        for (int i = 0; i < 4; i++) {
            int hotelId = scanner.nextInt();
            String hotelName = scanner.next();
            String dateOfBooking = scanner.next();
            int noOfRoomsBooked = scanner.nextInt();
            String wifiFacility = scanner.next();
            double totalBill = scanner.nextDouble();

            hotels[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);
        }

        String month = scanner.next();
        String wifiOption = scanner.next();

        int roomsBookedInGivenMonth = noOfRoomsBookedInGivenMonth(hotels, month);
        System.out.println(roomsBookedInGivenMonth > 0 ? roomsBookedInGivenMonth : "No rooms booked in the given month");

        Hotel hotelWithSecondHighestTotalBill = searchHotelByWifiOption(hotels, wifiOption);
        if (hotelWithSecondHighestTotalBill != null) {
            System.out.println(hotelWithSecondHighestTotalBill.getHotelId());
        } else {
            System.out.println("No such option available");
        }
    }

    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month) {
        int totalRoomsBooked = 0;
        for (Hotel hotel : hotels) {
            String[] dateParts = hotel.getDateOfBooking().split("-");
            String dateMonth = dateParts[1];

            if (dateMonth.equalsIgnoreCase(month)) {
                totalRoomsBooked += hotel.getNoOfRoomsBooked();
            }
        }
        return totalRoomsBooked;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] hotels, String wifiOption) {
        Arrays.sort(hotels, (a, b) -> Double.compare(b.getTotalBill(), a.getTotalBill()));

        for (Hotel hotel : hotels) {
            if (hotel.getWifiFacility().equalsIgnoreCase(wifiOption)) {
                if (hotels.length > 1 && hotel.getTotalBill() < hotels[1].getTotalBill()) {
                    return hotel;
                }
                return hotel;
            }
        }
        return null;
    }
}
```
**Input 1:**
```
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May
Yes
```
**Output 1:**
```
5
103
```
**Input 2:**
```
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May1
Yes1
```
**Output 2:**
```
No rooms booked in the given month
No such option available
```
**Note:** In the `noOfRoomsBookedInGivenMonth` method, we iterate through the array of Hotels and check if the month of the dateOfBooking matches the given month. If it does, we add the number of rooms booked to the total. If no rooms are booked in the given month, the method returns 0.

In the `searchHotelByWifiOption` method, we sort the array of Hotels in descending order of totalBill and then iterate through the array to find the first Hotel with the given wifiFacility. If we find a Hotel with the given wifiFacility and its totalBill is lower than the second highest totalBill (which is the first element in the sorted array), we return that Hotel. If no Hotel with the given wifiFacility is found, we return null.