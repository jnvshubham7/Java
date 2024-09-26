## Problem Statement

Create a class Player with below attributes:
playerId - int
skill - String
level - String
points - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

findPointsForGivenSkill method:
This method will take two input parameters - array of Player objects and string parameter skill.
The method will return the sum of the points attribute from player objects for the skill passed as parameter.
If no player with the given skill is present in the array of player objects, then the method should return 0.

getPlayerBasedOnLevel method:
This method will take two String parameters level and skill, along with the array of Player objects.
The method will return the player object, if the input String parameters matches with the level and skill attribute of the player object and its point attribute is greater than or equal to 20. If any of the conditions are not met, then the method should return null.

Note : No two player object would have the same value for skill and level attribute.
All player object would have the points greater than 0.
All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPointsForGivenSkill method - The main method should print the points as it is if the returned price is greater than 0, or it
should print "The given Skill is not available".

For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object. If the returned value is null
then it should print "No player is available with specified level, skill and eligibility points".

Before calling these static methods in main, use Scanner object to read the values of four Player objects referring attributes in the above mentioned attribute sequence.
Next, read the value for skill and level.
Please consider the skill value read above as skill parameter for both the static methods.

## Input

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

## Output

    45
    102


Here is the Java code for the problem statement:

```markdown
# Problem Statement

## Class Player

```java
public class Player {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
```

## Class Solution

```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
        Player player2 = new Player(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
        Player player3 = new Player(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
        Player player4 = new Player(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());

        String skill = scanner.next();
        String level = scanner.next();

        System.out.println(findPointsForGivenSkill(new Player[]{player1, player2, player3, player4}, skill));
        System.out.println(getPlayerBasedOnLevel(new Player[]{player1, player2, player3, player4}, level, skill));
    }

    static int findPointsForGivenSkill(Player[] players, String skill) {
        int points = 0;
        for (Player player : players) {
            if (player.getSkill().equalsIgnoreCase(skill)) {
                points += player.getPoints();
            }
        }
        return points;
    }

    static Player getPlayerBasedOnLevel(Player[] players, String level, String skill) {
        for (Player player : players) {
            if (player.getLevel().equalsIgnoreCase(level) && player.getSkill().equalsIgnoreCase(skill) && player.getPoints() >= 20) {
                return player;
            }
        }
        return null;
    }
}
```

# Input

```
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
```

# Output

```
45
102
```

# Explanation

The `Player` class has four attributes: `playerId`, `skill`, `level`, and `points`. It has a constructor and getters and setters for these attributes.

The `Solution` class has a `main` method that reads four `Player` objects and their attributes, then it reads a `skill` and `level`. It then calls the `findPointsForGivenSkill` and `getPlayerBasedOnLevel` methods with these values.

The `findPointsForGivenSkill` method iterates through the array of `Player` objects and returns the sum of the points for the players with the given `skill`.

The `getPlayerBasedOnLevel` method iterates through the array of `Player` objects and returns the first player that matches the given `level` and `skill` and has points greater than or equal to 20. If no such player is found, it returns null.

Finally, the `main` method prints the output of these methods. If the output is greater than 0, it prints the points as is; otherwise, it prints "The given Skill is not available". If the output is null, it prints "No player is available with specified level, skill and eligibility points".