Create a class Car with the following attributes:

make - String
model - String
year - int
price - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - findMostExpensiveCar and getCarByMakeAndModel in Solution class.

findMostExpensiveCar method:
This method will take an array of Car objects as input.
The method will return the Car object with the highest price.
If the array is empty, the method should return null.

getCarByMakeAndModel method:
This method will take three input parameters - array of Car objects, make and model (both strings).
The method will return the Car object that matches the make and model attributes passed as parameters.
If no car with the given make and model is present in the array of car objects, then the method should return null.

Note: The search should be case insensitive.

These above mentioned static methods should be called from the main method.

For findMostExpensiveCar method - The main method should print the make, model, year and price of the returned Car object. 
If the returned value is null then it should print "Sorry - No car is available".

For getCarByMakeAndModel method - The main method should print the year and price of the returned Car object. If the returned 
value is null then it should print "Sorry - No car is available".

Before calling these static methods in main, use Scanner object to read the values of four Car objects referring attributes in 
the above mentioned attribute sequence. Next, read the values for make and model.

Input:
-----------------
Mercedes
S-Class
2020
1250000
BMW
5-Series
2019
900000
Audi
A4
2022
800000
Jaguar
F-PACE
2021
1100000
Audi
A4

Output:
---------------------
Mercedes
S-Class
1250000.0
2020
2022
800000.0

Here is the Java code and explanation for the new question:

**Class Car**
```java
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // Parameterized constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
```
**Class Solution**
```java
public class Solution {
    public static void main(String[] args) {
        // Read values for four Car objects
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
        Car car2 = new Car(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
        Car car3 = new Car(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
        Car car4 = new Car(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());

        // Read values for make and model
        String make = scanner.nextLine();
        String model = scanner.nextLine();

        // Call static methods
        Car mostExpensiveCar = findMostExpensiveCar(new Car[] {car1, car2, car3, car4});
        if (mostExpensiveCar != null) {
            System.out.println("Make: " + mostExpensiveCar.getMake());
            System.out.println("Model: " + mostExpensiveCar.getModel());
            System.out.println("Year: " + mostExpensiveCar.getYear());
            System.out.println("Price: " + mostExpensiveCar.getPrice());
        } else {
            System.out.println("Sorry - No car is available");
        }

        Car carByMakeAndModel = getCarByMakeAndModel(new Car[] {car1, car2, car3, car4}, make, model);
        if (carByMakeAndModel != null) {
            System.out.println("Year: " + carByMakeAndModel.getYear());
            System.out.println("Price: " + carByMakeAndModel.getPrice());
        } else {
            System.out.println("Sorry - No car is available");
        }
    }

    // Static method to find the most expensive car
    public static Car findMostExpensiveCar(Car[] cars) {
        if (cars.length == 0) {
            return null;
        }
        Car mostExpensiveCar = cars[0];
        for (Car car : cars) {
            if (car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    // Static method to get the car by make and model
    public static Car getCarByMakeAndModel(Car[] cars, String make, String model) {
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)) {
                return car;
            }
        }
        return null;
    }
}
```
**Explanation**

The `Car` class has attributes `make`, `model`, `year`, and `price`, along with getter and setter methods. The `Solution` class has a `main` method that reads values for four `Car` objects and make and model, and then calls the `findMostExpensiveCar` and `getCarByMakeAndModel` static methods.

The `findMostExpensiveCar` method iterates through the array of `Car` objects and returns the one with the highest price. If the array is empty, it returns `null`.

The `getCarByMakeAndModel` method iterates through the array of `Car` objects and returns the one that matches the given make and model. The search is case insensitive. If no car is found, it returns `null`.

In the `main` method, we read values for four `Car` objects and make and model, and then call the `findMostExpensiveCar` and `getCarByMakeAndModel` methods. If the returned values are `null`, we print a message indicating that no car is available. Otherwise, we print the make, model, year, and price of the most expensive car and the year and price of the car by make and model.