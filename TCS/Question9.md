Create a Class Player with below attributes:

id - int
country - String
side - String
price - double

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - searchPlayerForMatch in Solution class.

This method will take a String parameter along with the other parameter as array of Player objects. 
The method will return array of Player where the String parameter appears in the side attribute (with case insensitive search).

This method should be called from main method and display the id of returned objects in ascending order. 

Before calling this method(searchPlayerForMatch) in the main method, use Scanner object to read values for four Player objects 
referring the attributes in the above sequence, then, read the value for search parameter. 
Next call the method searchPlayerForMatch, write the logic to sort the id in ascending order (in main method) and display the 
result. 

Consider below sample input and output:

Input:
------------
1
India
Batting
2500000
2
Australia
Batting
1000000
3
Srilanka
Bowling
1700000
4
England
Bowling
2000000
Batting

Output:
------------
1
2

Here is the solution to the problem:

**Class Player:**
```java
public class Player {
    private int id;
    private String country;
    private String side;
    private double price;

    // Parameterized constructor
    public Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getSide() {
        return side;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
```

**Class Solution:**
```java
public class Solution {
    // Static method to search for players by side
    public static Player[] searchPlayerForMatch(String side, Player[] players) {
        List<Player> result = new ArrayList<>();
        for (Player player : players) {
            if (player.getSide().toLowerCase().contains(side.toLowerCase())) {
                result.add(player);
            }
        }
        return result.toArray(new Player[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read values for four Player objects
        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            players[i] = new Player(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
        }

        // Read value for search parameter
        String side = scanner.next();

        // Call the searchPlayerForMatch method
        Player[] result = searchPlayerForMatch(side, players);

        // Sort the id in ascending order
        Arrays.sort(result, (a, b) -> Integer.compare(a.getId(), b.getId()));

        // Display the id of returned objects
        for (Player player : result) {
            System.out.println(player.getId());
        }
    }
}
```

**Explanation:**

In the `Player` class, we have defined a parameterized constructor to initialize the object with the given attributes. We have also defined getters and setters for each attribute.

In the `Solution` class, we have implemented the `searchPlayerForMatch` method, which takes a `String` parameter (side) and an array of `Player` objects as input. The method iterates through the array of players and checks if the given side (with case insensitive search) appears in the `side` attribute of each player. If it does, the player is added to the result list. The method returns an array of players where the given side appears in the `side` attribute.

In the `main` method, we use a `Scanner` object to read values for four `Player` objects and a search parameter. We then call the `searchPlayerForMatch` method and store the result in a `Player` array. We sort the array of players based on their id in ascending order using the `Arrays.sort` method. Finally, we display the id of returned objects.

**Input:**
```
1
India
Batting
2500000
2
Australia
Batting
1000000
3
Srilanka
Bowling
1700000
4
England
Bowling
2000000
Batting
```

**Output:**
```
1
2
```

I hope this helps! Let me know if you have any questions.