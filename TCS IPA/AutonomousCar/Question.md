## Problem Statement

Create a class AutonomousCar with the below attributes:
carld – int
brand – String noOfTestsConducted – int
noOfTestsPassed- int
environment – String
grade – String

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method. Implement two static methods – findTestPassedByEnv and updateCarGrade in Solution class.

**findTestPassedByEnv method:**

This method will take two input parameters -array of AutonomousCar objects and string parameter environment. The method will return the sum of the noOfTestsPassed attribute from autonomousCar objects for the environment passed as parameter.
If no autonomousCar with the given environment is present in the array of AutonomousCar objects, then the method should return 0.

**updateCarGrade method:**

This method will take a String parameter brand, along with the array of AutonomousCar objects. The method will return the autonomousCar object, if the input String parameter matches with the brand attribute of the autonomousCar object. Before returning the object, the grade should be derived based on the rating calculation mentioned below. This grade value should be assigned to the object. If any of the above conditions are not met, then the method should return null.
The grade attribute should be calculated as follows: rating .(noOfTestsPassed \* 100)/noOfTestsConducted If the rating > = 80 then grade should be ‘A1’, otherwise the grade should be ‘B2’.

The above mentioned static methods should be called from the main method. For findTestPassedByEnv method – The main method should print the totalTestPassed as it is, if the returned value is greater than 0, or it should print “There are no tests passed in this particular environment”.

For updateCarGrade method – The main method should print the brand and grade of the returned autonomousCar object. The brand and grade should be concatinated with :: while printing. eg:- Tesla::A1, where Tesla is the brand and Al is the grade.

If the returned value is null then it should print “No Car is available with the specified brand”.
Before calling these static methods in main, use Scanner object to read the values of four autonomousCar objects referring attributes in the above mentioned attribute sequence (except grade attribute). Next, read the value for environment and brand.

## Input

    100
    Tesla
    1000
    500
    Hills
    200
    Ford
    2000
    1500
    Desert
    300
    Royce
    3000
    1700
    Hills
    400
    Mercedez
    1000
    400
    Desert
    Desert
    Mercedez

## Output

    1900
    Mercedez::B2


## Problem Statement

Create a class AutonomousCar with the below attributes:
carld – int
brand – String noOfTestsConducted – int
noOfTestsPassed- int
environment – String
grade – String

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method. Implement two static methods – findTestPassedByEnv and updateCarGrade in Solution class.

**findTestPassedByEnv method:**

This method will take two input parameters -array of AutonomousCar objects and string parameter environment. The method will return the sum of the noOfTestsPassed attribute from autonomousCar objects for the environment passed as parameter.
If no autonomousCar with the given environment is present in the array of AutonomousCar objects, then the method should return 0.

**updateCarGrade method:**

This method will take a String parameter brand, along with the array of AutonomousCar objects. The method will return the autonomousCar object, if the input String parameter matches with the brand attribute of the autonomousCar object. Before returning the object, the grade should be derived based on the rating calculation mentioned below. This grade value should be assigned to the object. If any of the above conditions are not met, then the method should return null.
The grade attribute should be calculated as follows: rating .(noOfTestsPassed \* 100)/noOfTestsConducted If the rating > = 80 then grade should be ‘A1’, otherwise the grade should be ‘B2’.

The above mentioned static methods should be called from the main method. For findTestPassedByEnv method – The main method should print the totalTestPassed as it is, if the returned value is greater than 0, or it should print “There are no tests passed in this particular environment”.

For updateCarGrade method – The main method should print the brand and grade of the returned autonomousCar object. The brand and grade should be concatinated with :: while printing. eg:- Tesla::A1, where Tesla is the brand and Al is the grade.

If the returned value is null then it should print “No Car is available with the specified brand”.
Before calling these static methods in main, use Scanner object to read the values of four autonomousCar objects referring attributes in the above mentioned attribute sequence (except grade attribute). Next, read the value for environment and brand.

## Java Code
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AutonomousCar {
    private int carld;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public AutonomousCar(int carld, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carld = carld;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }

    public int getCarld() {
        return carld;
    }

    public void setCarld(int carld) {
        this.carld = carld;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }

    public void setNoOfTestsConducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }

    public void setNoOfTestsPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class Solution {
    public static int findTestPassedByEnv(List<AutonomousCar> cars, String environment) {
        int totalTestPassed = 0;
        for (AutonomousCar car : cars) {
            if (car.getEnvironment().equals(environment)) {
                totalTestPassed += car.getNoOfTestsPassed();
            }
        }
        return totalTestPassed;
    }

    public static AutonomousCar updateCarGrade(String brand, List<AutonomousCar> cars) {
        for (AutonomousCar car : cars) {
            if (car.getBrand().equals(brand)) {
                double rating = (double) car.getNoOfTestsPassed() / car.getNoOfTestsConducted() * 100;
                if (rating >= 80) {
                    car.setGrade("A1");
                } else {
                    car.setGrade("B2");
                }
                return car;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<AutonomousCar> cars = new ArrayList<>();

        AutonomousCar car1 = new AutonomousCar(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next());
        AutonomousCar car2 = new AutonomousCar(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next());
        AutonomousCar car3 = new AutonomousCar(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next());
        AutonomousCar car4 = new AutonomousCar(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next());
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        String environment = scanner.next();
        String brand = scanner.next();

        int totalTestPassed = Solution.findTestPassedByEnv(cars, environment);
        if (totalTestPassed > 0) {
            System.out.println(totalTestPassed);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar car = Solution.updateCarGrade(brand, cars);
        if (car != null) {
            System.out.println(car.getBrand() + "::" + car.getGrade());
        } else {
            System.out.println("No Car is available with the specified brand");
        }
    }
}
```
## Input

```
100
Tesla
1000
500
Hills
200
Ford
2000
1500
Desert
300
Royce
3000
1700
Hills
400
Mercedez
1000
400
Desert
Desert
Mercedez
```
## Output

```
1900
Mercedez::B2
```
## Explanation

The program creates a list of AutonomousCar objects and reads the values for four autonomousCar objects and for the environment and brand.

The `findTestPassedByEnv` method iterates through the list of AutonomousCar objects and sums up the noOfTestsPassed attribute for the environment passed as a parameter. If no AutonomousCar with the given environment is present in the list, the method returns 0.

The `updateCarGrade` method iterates through the list of AutonomousCar objects and checks if the brand matches with the brand attribute of the AutonomousCar object. If it matches, the method calculates the grade based on the rating calculation and assigns it to the AutonomousCar object. If no AutonomousCar with the specified brand is found, the method returns null.

In the main method, we call the `findTestPassedByEnv` method and print the total test passed if it is greater than 0, otherwise we print "There are no tests passed in this particular environment". Then we call the `updateCarGrade` method and print the brand and grade of the returned AutonomousCar object, concatenating them with ::. If the returned value is null, we print "No Car is available with the specified brand".