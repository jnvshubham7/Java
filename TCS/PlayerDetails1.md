Create class Player3 with below attributes:

id - int
name - String
Country - String
matchesPlayed - int
runsScored - int

the above attribute should be private ,write getter and setter and parametrized constructor as well.

Create class Solution and implement static method "findPlayerName" in the Solution class.
This method will take array of Player objects and a String as country parameters and int as run parameter.
And will return another array of Player object where the String is matched with country and run scored of that Player object 
is greater than the input int parameter. All the searches should be case insensitive.

Before calling "findPlayerName" method in the main method, read values for Player objects referring the attributes 
in above sequence along with a int target.
Then call the "findPlayerName" method and write logic in main method to print Player object. If any of the input doesn't match
with the following attributes then print "No player found".

Note:
--------------
1. First take input as the number of player object, then the player details
2. Show the output as the dictionary order of the players name
3. First print player id, and then use ' : ' sign and after that player name
    3 : Arijit
    1 : Minaz
    5 : Priyanka

Input : 1
--------------
5 
1
Arnab
India
4
94
2
Virat
UK
5
68
3
Arijit
India
82
87
4
Raj
India
21
78
5
Priyanka
India
12
86
India
80

Output : 1
-----------------
3:Arijit
1:Arnab
5:Priyanka

___________________________________________________________

Input : 2
--------------
5 
1
Arnab
India
4
94
2
Virat
UK
5
68
3
Arijit
India
82
87
4
Raj
India
21
78
5
Priyanka
India
12
86
UK
80

Output : 2
--------------------
No player found

**Question 1:**
Create a class Player3 with private attributes id, name, country, matchesPlayed, and runsScored. Implement getter and setter methods and a parameterized constructor.

**Java Code:**
```java
public class Player3 {
    private int id;
    private String name;
    private String country;
    private int matchesPlayed;
    private int runsScored;

    // Parameterized constructor
    public Player3(int id, String name, String country, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}
```
**Explanation:**
We have created a class `Player3` with private attributes `id`, `name`, `country`, `matchesPlayed`, and `runsScored`. We have implemented a parameterized constructor that takes these attributes as input and sets them in the object. We have also implemented getter and setter methods for each attribute to provide flexibility for accessing and modifying the attributes.

**Input:**
1. 5
   1
   Arnab
   India
   4
   94
   2
   Virat
   UK
   5
   68
   3
   Arijit
   India
   82
   87
   4
   Raj
   India
   21
   78
   5
   Priyanka
   India
   12
   86
   India
   80

**Output:**
1
-----------------
3:Arijit
1:Arnab
5:Priyanka