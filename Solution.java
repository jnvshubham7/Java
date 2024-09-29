import java.util.ArrayList;

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

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Name: " + carName + ", Fuel: " + fuelType;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Create an ArrayList of Car objects
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Petrol"));
        cars.add(new Car(2, "Honda", "Diesel"));
        cars.add(new Car(3, "Ford", "Electric"));

        // Remove the second car (Honda)
        cars.remove(1);

        // Print the list after removal
        for (Car car : cars) {
            System.out.println(car);
        }

        int indx = 1;

        for (Car car : cars) {
            car.setCarId(indx);
            indx++;
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}