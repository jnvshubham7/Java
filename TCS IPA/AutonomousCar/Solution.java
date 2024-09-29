import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AutonomousCar[] cars = new AutonomousCar[4];
    
    // Reading input for 4 Autonomous Cars
    for (int i = 0; i < cars.length; i++) {
      int carId = sc.nextInt();
      sc.nextLine();
      String brand = sc.nextLine();
      int noOfTestsConducted = sc.nextInt();
      int noOfTestsPassed = sc.nextInt();
      sc.nextLine();
      String environment = sc.nextLine();
      cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
    }
    
    // Input for environment to find test passed
    String env = sc.nextLine();
    
    // Input for brand to update grade
    String brand = sc.nextLine();
    
    // Call the method to find number of tests passed in the given environment
    int testsPassed = findTestPassedByEnv(cars, env);
    if (testsPassed == 0)
      System.out.println("There are no tests passed in this particular environment");
    else
      System.out.println(testsPassed);
    
    // Call the method to update the car's grade by brand
    AutonomousCar updatedCar = updateCarGrade(cars, brand);
    if (updatedCar == null)
      System.out.println("No Car is available with the specified brand");
    else
      System.out.println(updatedCar.getBrand() + "::" + updatedCar.getGrade());
    
    sc.close();  // Closing the scanner
  }

  // Method to find total tests passed by environment
  public static int findTestPassedByEnv(AutonomousCar[] cars, String env) {
    int sum = 0;
    for (AutonomousCar car : cars) {
      if (car.getEnvironment().equalsIgnoreCase(env)) {
        sum += car.getNoOfTestsPassed();
      }
    }
    return sum;
  }

  // Method to update car's grade based on its brand
  public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String brand) {
    for (AutonomousCar car : cars) {
      if (car.getBrand().equalsIgnoreCase(brand)) {
        int noOfTestsConducted = car.getNoOfTestsConducted();
        int noOfTestsPassed = car.getNoOfTestsPassed();
        
        // Avoid division by zero
        if (noOfTestsConducted == 0) {
          car.setGrade("No Grade (No tests conducted)");
        } else {
          int rating = (noOfTestsPassed * 100) / noOfTestsConducted;
          
          // Set grade based on the rating
          if (rating >= 80) {
            car.setGrade("A1");
          } else {
            car.setGrade("B2");
          }
        }
        return car;  // Return the car once the grade is updated
      }
    }
    return null;  // Return null if no car matches the brand
  }
}

// AutonomousCar class to represent each autonomous car
class AutonomousCar {
  private int carId, noOfTestsConducted, noOfTestsPassed;
  private String brand, environment, grade;

  AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
    this.carId = carId;
    this.brand = brand;
    this.noOfTestsConducted = noOfTestsConducted;
    this.noOfTestsPassed = noOfTestsPassed;
    this.environment = environment;
  }

  int getCarId() {
    return carId;
  }

  String getBrand() {
    return brand;
  }

  int getNoOfTestsConducted() {
    return noOfTestsConducted;
  }

  int getNoOfTestsPassed() {
    return noOfTestsPassed;
  }

  String getEnvironment() {
    return environment;
  }

  void setGrade(String grade) {
    this.grade = grade;
  }

  String getGrade() {
    return grade;
  }
}
