Create a class Car with the below attributes:

carId – int
carName – String
fuelType – String

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class RemoveCar with main method.

Implement two static methods – RemoveAndRearrange in RemoveCar class.

RemoveAndRearrange method: 
This method will take int input parameter. The method will return the new array of Car object and remove that car whose 
id is match with the input parameter. Remove the car details and return the array with continuous new ids.

If no car with the given id is present in the array of Car objects, then the method should return null.

Note: No two Car object would have the same engine id.

The above mentioned static methods should be called from the main method.

For RemoveAndRearrange method: The main method should print the id and car name as it is, if the returned 
value is not null, or it should print “There are no car with given id”. 

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes 
in the above mentioned attribute sequence. next, read the value of int parameters for capturing car id.

Input :

1001
Maruti
Diesel
1002
Kia
Pertro
1003
Hyundai
Diesel
1004
Taxi
Petrol
1005
Truck
Diesel
1003

Output :

1001 : Maruti
1002 : Kia
1003 : Hyundai
1004 : Taxi

Here is the solution:

**Question**

Create a class Car with the below attributes:

carId – int
carName – String
fuelType – String

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class RemoveCar with main method.

Implement two static methods – RemoveAndRearrange in RemoveCar class.

RemoveAndRearrange method: 
This method will take int input parameter. The method will return the new array of Car object and remove that car whose 
id is match with the input parameter. Remove the car details and return the array with continuous new ids.

If no car with the given id is present in the array of Car objects, then the method should return null.

Note: No two Car object would have the same engine id.

The above mentioned static methods should be called from the main method.

For RemoveAndRearrange method: The main method should print the id and car name as it is, if the returned 
value is not null, or it should print “There are no car with given id”. 

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes 
in the above mentioned attribute sequence. next, read the value of int parameters for capturing car id.

**Input**

1001
Maruti
Diesel
1002
Kia
Pertro
1003
Hyundai
Diesel
1004
Taxi
Petrol
1005
Truck
Diesel
1003

**Output**

1001 : Maruti
1002 : Kia
1003 : Hyundai
1004 : Taxi

**Java Code**

```java
import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private int carId;
    private String carName;
    private String fuelType;

    public Car(int carId, String carName, String fuelType) {
        this.carId = carId;
        this.carName = carName;
        this.fuelType = fuelType;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

class RemoveCar {
    public static Car[] RemoveAndRearrange(Car[] cars, int id) {
        Car[] result = new Car[cars.length];
        int index = 0;
        boolean found = false;

        for (Car car : cars) {
            if (car.getCarId() != id) {
                result[index] = car;
                index++;
            } else {
                found = true;
            }
        }

        if (found) {
            Car[] newCars = new Car[index];
            System.arraycopy(result, 0, newCars, 0, index);
            return newCars;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();

        System.out.println("Enter car details:");
        for (int i = 0; i < 5; i++) {
            int carId = scanner.nextInt();
            String carName = scanner.next();
            String fuelType = scanner.next();
            cars.add(new Car(carId, carName, fuelType));
        }

        int id = scanner.nextInt();

        Car[] removedCars = RemoveAndRearrange(cars.toArray(new Car[0]), id);

        if (removedCars != null) {
            System.out.println("Removed cars:");
            for (Car car : removedCars) {
                System.out.println(car.getCarId() + " : " + car.getCarName());
            }
        } else {
            System.out.println("There are no car with given id.");
        }
    }
}
```

**Explanation**

The `Car` class has private attributes `carId`, `carName`, and `fuelType`, and their corresponding getters and setters. The `RemoveCar` class has a static method `RemoveAndRearrange` that takes an array of `Car` objects and an integer `id` as input. The method iterates through the array, removes the car with the matching `id`, and returns a new array with continuous IDs. If no car with the given `id` is found, the method returns `null`.

In the `main` method, we read car details using a `Scanner` object and store them in an array list. We then call the `RemoveAndRearrange` method with the array of cars and the `id` to be removed. If the method returns a non-null value, we print the removed cars; otherwise, we print a message indicating that no car with the given `id` was found.