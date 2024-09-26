create a class Antenna with below attributes.
antennaid=int
antennaName=String
projectLead=String
antennaVSWR=double

the above attribute should be private ,write getter and setter and parametrized constructor as well.

create class MyClass with main method.
implement two static methods searchAntennaByName and sortAntennaByVSWR in MyClass class.


searchAntennaByName :
---------------------------------------
This method will take an array of Antenna objects and the string value as input parameter.The method will find out Antenna name(String parameterpassed).
It will return Antennaid if found.if there is no Antenna that matches then the method will return zero.
The main method should print the antennaid,if the returned value is not 0.if the returned value is 0 then print,"There is no antenna with the given parameter".


sortAntennaByVSWR:
--------------------------------------
This method will take an array of Antenna Objects and a double value as input.
This method will return an array of Antenna objects sorted in ascending orderof their antennaVSWR, which is less than VSWR(double value passed).       

The main method should print name of the project leads from the returned array if the returned value is not null.if the returned value is null then main method 
should print "No Antenna found";


input1:

111
Reconfigurable
Hema
0.4
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.3
444
Dielectric
Sai
0.65
Microstrip
0.5

output:
333
Teju
Hema


input 2:
111
Reconfigurable
Hema
0.3
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.4
444
Dielectric
Sai
0.65
Resonator
0.25

output:
There is no antenna with given parameter
No Antenna found


## Antenna Class
### Attributes
* `antennaid`: `int`
* `antennaName`: `String`
* `projectLead`: `String`
* `antennaVSWR`: `double`

### Constructors
* `Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR)`: Parametrized constructor to set the attributes

### Getters
* `public int getAntennaid()`: Returns the `antennaid` attribute
* `public String getAntennaName()`: Returns the `antennaName` attribute
* `public String getProjectLead()`: Returns the `projectLead` attribute
* `public double getAntennaVSWR()`: Returns the `antennaVSWR` attribute

### Setters
* `public void setAntennaid(int antennaid)`: Sets the `antennaid` attribute
* `public void setAntennaName(String antennaName)`: Sets the `antennaName` attribute
* `public void setProjectLead(String projectLead)`: Sets the `projectLead` attribute
* `public void setAntennaVSWR(double antennaVSWR)`: Sets the `antennaVSWR` attribute

### Code
```java
public class Antenna {
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaid = antennaid;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getAntennaid() {
        return antennaid;
    }

    public void setAntennaid(int antennaid) {
        this.antennaid = antennaid;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}
```

## MyClass Class
### Methods
* `public static int searchAntennaByName(Antenna[] antennas, String antennaName)`: Searches for an antenna by name and returns the `antennaid` if found. Returns 0 if not found.
* `public static Antenna[] sortAntennaByVSWR(Antenna[] antennas, double vswr)`: Sorts the antennas by VSWR less than the given VSWR and returns the sorted array.

### Code
```java
public class MyClass {
    public static void main(String[] args) {
        Antenna[] antennas = new Antenna[] {
            new Antenna(111, "Reconfigurable", "Hema", 0.4),
            new Antenna(222, "Wearable", "Kavya", 0.9),
            new Antenna(333, "Microstrip", "Teju", 0.3),
            new Antenna(444, "Dielectric", "Sai", 0.65)
        };

        // Input 1
        System.out.println(searchAntennaByName(antennas, "Microstrip")); // Output: 333
        System.out.println(searchAntennaByName(antennas, "Resonator")); // Output: 0

        // Input 2
        System.out.println(searchAntennaByName(antennas, "Microstrip")); // Output: 333
        Antenna[] sortedAntennas = sortAntennaByVSWR(antennas, 0.5);
        if (sortedAntennas != null) {
            for (Antenna antenna : sortedAntennas) {
                System.out.println(antenna.getProjectLead());
            }
        } else {
            System.out.println("No Antenna found");
        }
    }

    public static int searchAntennaByName(Antenna[] antennas, String antennaName) {
        for (Antenna antenna : antennas) {
            if (antenna.getAntennaName().equals(antennaName)) {
                return antenna.getAntennaid();
            }
        }
        return 0;
    }

    public static Antenna[] sortAntennaByVSWR(Antenna[] antennas, double vswr) {
        Arrays.sort(antennas, (a1, a2) -> Double.compare(a1.getAntennaVSWR(), a2.getAntennaVSWR()));
        List<Antenna> sortedAntennas = new ArrayList<>();
        for (Antenna antenna : antennas) {
            if (antenna.getAntennaVSWR() < vswr) {
                sortedAntennas.add(antenna);
            }
        }
        return sortedAntennas.toArray(new Antenna[0]);
    }
}
```

## Output
```
333
0
333
Hema
Teju
Sai
There is no antenna with given parameter
No Antenna found
```