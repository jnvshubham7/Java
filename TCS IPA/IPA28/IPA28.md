Create class Team with below attributes:

tId - int
tName - String
tCountry - String
tRun - int

The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.

Implement One static method-

● findPlayer

findPlayer in the solution class. 
This method will take array of Team objects, int paramater run and String country and returns the Team object where taken 
country is matched with the country of team object and team run is greater than the taken run.

Write code to perform following tasks:

1. In main mehod, take 1st input as integer parameter which shows the number of team object.
2. Take necessary input variable and call findPlayer.
3. All searches should be case insensitive.

For this method- The main method should print the team object. As if the returned value is not null, 
or it should print "No team is found from the given country and run".

Input
------------------
3 
1
Arijit
India
43
2
Doremon
China
40
3
Donal
England
32
35
China



Output
--------------
2
Doremon
China
40

**Question 2:**
### Implementing findPlayer Method

**Java Code:**
```java
public class Team {
    private int tId;
    private String tName;
    private String tCountry;
    private int tRun;

    public Team(int tId, String tName, String tCountry, int tRun) {
        this.tId = tId;
        this.tName = tName;
        this.tCountry = tCountry;
        this.tRun = tRun;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettCountry() {
        return tCountry;
    }

    public void settCountry(String tCountry) {
        this.tCountry = tCountry;
    }

    public int gettRun() {
        return tRun;
    }

    public void settRun(int tRun) {
        this.tRun = tRun;
    }
}

public class Solution {
    public static Team findPlayer(Team[] teams, int run, String country) {
        for (Team team : teams) {
            if (team.gettCountry().equalsIgnoreCase(country) && team.gettRun() > run) {
                return team;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Team[] teams = new Team[n];
        for (int i = 0; i < n; i++) {
            teams[i] = new Team(
                    Integer.parseInt(args[1 + i * 4]),
                    args[2 + i * 4],
                    args[3 + i * 4],
                    Integer.parseInt(args[4 + i * 4]));
        }
        int run = Integer.parseInt(args[5]);
        String country = args[6].toLowerCase();
        Team result = findPlayer(teams, run, country);
        if (result != null) {
            System.out.println(result.gettId() + " " + result.gettName() + " " + result.gettCountry() + " " + result.gettRun());
        } else {
            System.out.println("No team is found from the given country and run");
        }
    }
}
```
**Explanation:**

* The `Team` class has private attributes `tId`, `tName`, `tCountry`, and `tRun`. We have implemented getter and setter methods for each attribute.
* The `findPlayer` method takes an array of `Team` objects, an integer `run`, and a string `country` as input. It iterates through the array of `Team` objects and checks if the country matches the input country (case-insensitive) and if the team run is greater than the input run. If a match is found, it returns the `Team` object.
* In the `main` method, we first parse the input parameters and create an array of `Team` objects. Then, we call the `findPlayer` method and print the result. If no match is found, we print "No team is found from the given country and run".

**Input:**
```
3
1
Arijit
India
43
2
Doremon
China
40
3
Donal
England
32
35
China
```
**Output:**
```
2
Doremon
China
40
```
**Note:** The case-insensitive matching is achieved by converting the input `country` to lowercase using the `toLowerCase()` method.