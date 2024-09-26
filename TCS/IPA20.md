Create a class Engine with the below attributes:

engineld – int

engineName – String

engine Type – String

enginePrice – double

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class MyClass with main method.

Implement two static methods – findAvgEnginePriceByType and searchEngineByName in MyClass class.

findAvgEnginePriceByType method: This method will take two input parameters Engine objects and String parameter. 
The method will return the average price of Engines from array of Engine objects for the given engine type 
(String parameter passed). If no Engine with the given type is present in the array of Engine objects, then the method 
should return 0.


searchEngineByName method: This method will take a String parameter and an array of Engine objects as the other parameter. 
The method will return Engine object array in an ascending order of their engine ids, from the array of Engine objects whose 
name attribute matches with the given engine name (String parameter passed). If no Engine with the given name is present in 
the array of Engine objects, then the method should return null.

Note: No two Engine object would have the same engine id.

All searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findAvgEnginePriceByType method: The main method should print the average enginePrice of Engines as it is, if the returned 
value is greater than 0, or it should print “There are no engine with given type”.

For searchEngineByName method: The main method should print the engineld from the returned Engine object array if the returned 
value is not null. If the returned value is null, then it should print “There are no engine with the given name”. 

Before calling these static methods in main, use Scanner object to read the values of four Engine objects referring attributes 
in the above mentioned attribute sequence. next, read the value of two String parameters for capturing engine type and engine 
name respectively.

Input :

1001
Maruti
Diesel
20000
1002
Kia
Pertro
17000
1003
Hyundai
Diesel
24000
1000
Maruti
Petrol
27500
Petrol
Maruti

Output :

27500
1000
1001

Here are the Java code, explanation, input, output and possible solution for the above problem:
# Creating an Engine Class

```java
class Engine {
    private int engineId;
    private String engineName;
    private String engineType;
    private double enginePrice;

    public Engine(int engineId, String engineName, String engineType, double enginePrice) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getEnginePrice() {
        return enginePrice;
    }

    public void setEnginePrice(double enginePrice) {
        this.enginePrice = enginePrice;
    }
}
```

# Creating a MyClass with main method

```java
import java.util.Scanner;

public class MyClass {
    public static double findAvgEnginePriceByType(Engine[] engines, String type) {
        double sum = 0;
        int count = 0;
        for (Engine engine : engines) {
            if (engine.getEngineType().equalsIgnoreCase(type)) {
                sum += engine.getEnginePrice();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public static Engine[] searchEngineByName(String name, Engine[] engines) {
        Engine[] result = new Engine[0];
        for (Engine engine : engines) {
            if (engine.getEngineName().equalsIgnoreCase(name)) {
                result = addEngine(result, engine);
            }
        }
        return result.length > 0 ? sortEngine(result) : null;
    }

    private static Engine[] addEngine(Engine[] engines, Engine engine) {
        Engine[] result = new Engine[engines.length + 1];
        System.arraycopy(engines, 0, result, 0, engines.length);
        result[engines.length] = engine;
        return result;
    }

    private static Engine[] sortEngine(Engine[] engines) {
        for (int i = 0; i < engines.length - 1; i++) {
            for (int j = i + 1; j < engines.length; j++) {
                if (engines[i].getEngineId() > engines[j].getEngineId()) {
                    Engine temp = engines[i];
                    engines[i] = engines[j];
                    engines[j] = temp;
                }
            }
        }
        return engines;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Engine[] engines = new Engine[4];
        for (int i = 0; i < 4; i++) {
            engines[i] = new Engine(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
        }
        String type = scanner.next();
        String name = scanner.next();
        double avgPrice = findAvgEnginePriceByType(engines, type);
        if (avgPrice > 0) {
            System.out.println(avgPrice);
        } else {
            System.out.println("There are no engine with given type");
        }
        Engine[] result = searchEngineByName(name, engines);
        if (result != null) {
            for (Engine engine : result) {
                System.out.println(engine.getEngineId());
            }
        } else {
            System.out.println("There are no engine with the given name");
        }
    }
}
```

# Explanation:

In this program, we first create an Engine class with private attributes and respective getter and setter methods. Then we create a MyClass with main method. In the main method, we first read the values of four Engine objects, then read the values of two String parameters for capturing engine type and engine name respectively.

We then call the two static methods, findAvgEnginePriceByType and searchEngineByName from the main method. The findAvgEnginePriceByType method calculates the average price of the Engines for the given engine type and the searchEngineByName method returns the Engine object array in an ascending order of their engine ids.

The main method then prints the average enginePrice of Engines if the returned value is greater than 0, or it prints “There are no engine with given type”. Similarly, it prints the engineld from the returned Engine object array if the returned value is not null, or it prints “There are no engine with the given name”.