## Problem Statement

Create class Player with below attributes:
id - int
name - String
iccRank - int
matchesPlayed - int
runsScored - int

Create class Solution and implement static method "findAverageOfRuns" in the Solution class.
This method will take array of Player objects and a target int as parameters.
And will return another double array where the target int is lesser than or equal to the original array of Player object's matchesPlayed attribute and contains the average run scored by each player satisfying above condition.

Write necessary getters and setters.

Before calling "findAverageOfRuns" method in the main method, read values for four Player objects referring the attributes in above sequence along with a int target.
Then call the "findAverageOfRuns" method and write logic in main method to print "Grade A",if the calculated averageRun value is 80 to 100. Else if the averageRun value is between 50 and 79 then print "Grade B". Else print "Grade C"

## Input

    100
    Sachin
    5
    150
    13000
    101
    Sehwag
    4
    120
    10000
    103
    Dhoni
    7
    110
    7000
    104
    Kohli
    15
    57
    4400
    100

## Output

    Grade A
    Grade A
    Grade B


Here's a structured markdown format with headers for questions and methods, along with explanations, input, output, and possible solutions.

### Problem Statement

Create class `Player` with attributes:
```
id - int
name - String
iccRank - int
matchesPlayed - int
runsScored - int
```
Create class `Solution` and implement static method `"findAverageOfRuns"` in the `Solution` class. This method will take an array of `Player` objects and a target int as parameters. And will return another double array where the target int is lesser than or equal to the original array of `Player` object's `matchesPlayed` attribute and contains the average run scored by each player satisfying above condition.

Write necessary getters and setters.

Before calling `"findAverageOfRuns"` method in the `main` method, read values for four `Player` objects referring to the attributes in above sequence along with a int target.
Then call the `"findAverageOfRuns"` method and write logic in `main` method to print `"Grade A"`, if the calculated averageRun value is 80 to 100. Else if the averageRun value is between 50 and 79 then print `"Grade B"`. Else print `"Grade C"`.
### Input

```
100
Sachin
5
150
13000
101
Sehwag
4
120
10000
103
Dhoni
7
110
7000
104
Kohli
15
57
4400
100
```
### Output

```
Grade A
Grade A
Grade B
```
### Java Code
```
import java.util.Scanner;
import java.util.Arrays;

class Player {
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public void setIccRank(int iccRank) {
        this.iccRank = iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}

public class Solution {
    public static double[] findAverageOfRuns(Player[] players, int target) {
        double[] averageRuns = new double[players.length];
        for (int i = 0; i < players.length; i++) {
            if (players[i].getMatchesPlayed() <= target) {
                averageRuns[i] = (double) players[i].getRunsScored() / players[i].getMatchesPlayed();
            } else {
                averageRuns[i] = 0;
            }
        }
        return averageRuns;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            players[i] = new Player(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        int target = scanner.nextInt();
        double[] averageRuns = Solution.findAverageOfRuns(players, target);
        for (int i = 0; i < averageRuns.length; i++) {
            if (80 <= averageRuns[i] && averageRuns[i] <= 100) {
                System.out.println("Grade A");
            } else if (50 <= averageRuns[i] && averageRuns[i] < 80) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }
    }
}
```
In this code, we first define the `Player` class with its attributes and getters and setters. Then we define the `Solution` class with the static method `findAverageOfRuns` which takes an array of `Player` objects and a target int as parameters and returns another double array.

In the `main` method, we read the values for four `Player` objects and a int target from the user. We then call the `findAverageOfRuns` method and iterate through the returned array to calculate the Grade based on the averageRun value.

### Explanation:
The code first prompts the user to enter the values for four `Player` objects and a int target. It then calls the `findAverageOfRuns` method with these values and iterates through the returned array to calculate the Grade based on the averageRun value.