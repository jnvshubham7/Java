Create a class Player with below attributes: 

playerId - int 
skill - String 
level - String 
points - int

Write getters, setters and parameterized constructor in the above mentioned attribute 
sequence as required.

Create class Solution with the main method.

Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

findPointsForGivenSkill method: 
------------------------------------
This method will take two input parameters - array of Player objects 
and string parameter skill. The method will return the sum of the points attribute from player objects 
for the skill passed as parameter. If no player with the given skill is present in the array of player 
objects, then the method should return 0.

getPlayerBasedOnLevel method: 
-------------------------------------
This method will take two String parameters level and skill, along with the array of Player objects. 
The method will return the player object, if the input String parameters matches with the level and 
skill attribute of the player object and its point attribute is greater than or equal to 20. If any 
of the conditions are not met, then the method should return null.

Note : No two player object would have the same value for skill and level attribute. All player object 
would have the points greater than 0. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPointsForGivenSkill method - The main method should print the points as it is if the returned 
price is greater than 0, or it should print "The given Skill is not available".

For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object.
If the returned value is null then it should print "No player is available with specified level, skill 
and eligibility points".

Before calling these static methods in main, use Scanner object to read the values of four Player objects 
referring attributes in the above mentioned attribute sequence. Next, read the value for skill and level.
Please consider the skill value read above as skill parameter for both the static methods.

Input:
-----------
101
Cricket
Basic
20
102
Cricket
Intermediate
25
111
Football
Intermediate
50
113
BaseBall
Advanced
100
Cricket
Intermediate

Output:
--------------
45
102

Here is the structured markdown format with headers for questions and methods:

**Class Player**
===============

```java
public class Player {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    // Parameterized constructor
    public Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    // Getters
    public int getPlayerId() {
        return playerId;
    }

    public String getSkill() {
        return skill;
    }

    public String getLevel() {
        return level;
    }

    public int getPoints() {
        return points;
    }

    // Setters
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
```

**Class Solution**
================

```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            players[i] = new Player(
                    Integer.parseInt(scanner.nextLine()),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    Integer.parseInt(scanner.nextLine())
            );
        }

        String skill = scanner.nextLine();
        String level = scanner.nextLine();

        int pointsForGivenSkill = findPointsForGivenSkill(players, skill);
        System.out.println(pointsForGivenSkill > 0 ? pointsForGivenSkill : "The given Skill is not available");

        Player player = getPlayerBasedOnLevel(players, level, skill);
        System.out.println(player != null ? player.getPlayerId() : "No player is available with specified level, skill and eligibility points");
    }

    // Static method findPointsForGivenSkill
    public static int findPointsForGivenSkill(Player[] players, String skill) {
        int sum = 0;
        for (Player player : players) {
            if (player.getSkill().equalsIgnoreCase(skill)) {
                sum += player.getPoints();
            }
        }
        return sum;
    }

    // Static method getPlayerBasedOnLevel
    public static Player getPlayerBasedOnLevel(Player[] players, String level, String skill) {
        for (Player player : players) {
            if (player.getLevel().equalsIgnoreCase(level) && player.getSkill().equalsIgnoreCase(skill) && player.getPoints() >= 20) {
                return player;
            }
        }
        return null;
    }
}
```

**Explanation**

The code implementation is as follows:

*   We define a class `Player` with attributes `playerId`, `skill`, `level`, and `points`, and implement getters and setters for these attributes.
*   In the `Solution` class, we use a `Scanner` object to read the values for four `Player` objects and store them in an array `players`.
*   We then read the values for `skill` and `level`, and use these values to call the static methods `findPointsForGivenSkill` and `getPlayerBasedOnLevel`, which are implemented in the `Solution` class.
*   The `findPointsForGivenSkill` method iterates through the array of `Player` objects and sums the points for the `Player` objects with the given `skill`. If no `Player` object with the given `skill` is found, the method returns 0.
*   The `getPlayerBasedOnLevel` method iterates through the array of `Player` objects and returns the `Player` object with the given `level`, `skill`, and points greater than or equal to 20. If no such `Player` object is found, the method returns `null`.
*   In the `main` method, we print the result of the `findPointsForGivenSkill` method and the `getPlayerBasedOnLevel` method.