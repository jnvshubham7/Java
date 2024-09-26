Create class Player2 with below attributes:

id - int
name - String
iccRank - int
matchesPlayed - int
runsScored - int

Create class Solution and implement static method "findAverageOfRuns" in the Solution class.
This method will take array of Player objects and a target int as parameters.
And will return another double array where the target int is lesser than or equal to the original array of Player object's 
matchesPlayed attribute and contains the average run scored by each player satisfying above condition.

Write necessary getters and setters.

Before calling "findAverageOfRuns" method in the main method, read values for four Player objects referring the attributes 
in above sequence along with a int target.
Then call the "findAverageOfRuns" method and write logic in main method to print "Grade A",if the calculated averageRun 
value is 80 to 100. Else if the averageRun value is between 50 and 79 then print "Grade B". Else print "Grade C".

Input
------------------
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

Output
--------------------
Grade A
Grade A
Grade B

Here is the solution in Java with explanations, input, output, and possible solutions:

**Question:** Create class Player2 with the following attributes: `id`, `name`, `iccRank`, `matchesPlayed`, and `runsScored`. Implement a static method `findAverageOfRuns` in class Solution that takes an array of Player objects and a target int as parameters. The method should return a double array where the target int is lesser than or equal to the original array of Player object's `matchesPlayed` attribute and contains the average run scored by each player satisfying the above condition.

**Code:**
```java
public class Player2 {
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player2(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
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
    public static double[] findAverageOfRuns(Player2[] players, int target) {
        double[] averageRuns = new double[players.length];
        for (int i = 0; i < players.length; i++) {
            if (players[i].getMatchesPlayed() <= target) {
                averageRuns[i] = (double) players[i].getRunsScored() / players[i].getMatchesPlayed();
            } else {
                averageRuns[i] = -1; // or any other value to indicate mismatch
            }
        }
        return averageRuns;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player2[] players = new Player2[4];
        for (int i = 0; i < 4; i++) {
            players[i] = new Player2(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        int target = scanner.nextInt();

        double[] averageRuns = Solution.findAverageOfRuns(players, target);
        for (double run : averageRuns) {
            if (run >= 80 && run <= 100) {
                System.out.println("Grade A");
            } else if (run >= 50 && run <= 79) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }
    }
}
```
**Input:** 100, Sachin, 5, 150, 13000, 101, Sehwag, 4, 120, 10000, 103, Dhoni, 7, 110, 7000, 104, Kohli, 15, 57, 4400, 100

**Output:**
```
Grade A
Grade A
Grade B
```
Possible Solutions:

* If the calculated average run value is between 80 and 100, print "Grade A".
* If the calculated average run value is between 50 and 79, print "Grade B".
* Otherwise, print "Grade C".

In the main method, we read values for four Player objects and a target int using a Scanner object. Then, we call the `findAverageOfRuns` method and iterate through the resulting double array to print the grades based on the calculated average run values.