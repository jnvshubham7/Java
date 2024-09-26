## Problem Statement

Create a class Movie with the below attributes:
movieId - int
director - String
rating - int
budget - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findAvgBudgetByDirector and getMovieByRatingBudget in Solution class.

findAvgBudgetByDirector method:
This method will take two input parameters - array of Movie objects and string parameter director.
The method will return the average of the budget attribute from Movie objects directed by the director passed as parameter.
If no movie with the given director is present in the array of movie objects, then the method should return 0.

getMovieByRatingBudget method:
This method will take two int parameters rating and budget, along with the array of movie objects.
The method will return the movie object, if the input parameters rating and budget, matches with the rating and budget attribute of the movie object respectively.

Also check if rating is a factor of budget (eg: 3 is a factor of 12 because 3 divides 12 without leaving a remainder).
If any of the conditions are not met, then the method should return null.

Note : No two movie object would have the same value for rating and budget attributes.
All the searches should be case insensitive.
The budget mentioned are in crores and in INR.

These above mentioned static methods should be called from the main method.

For findAvgBudgetByDirector method - The main method should print the average budget as it is if the returned value is greater than 0, or it
should print "Sorry - The given director has not yet directed any movie".

For getMovieByRatingBudget method - The main method should print the movieId of the returned movie object. If the returned value is null
then it should print "Sorry - No movie is available with the specified rating and budget requirement".

Before calling these static methods in main, use Scanner object to read the values of four
Movie objects referring attributes in the above mentioned attribute sequence.
Next, read the value for director, rating and budget.

## Input

    1101
    GVM
    4
    100
    1201
    Shankar
    5
    500
    1301
    Shankar
    3
    50
    1401
    GVM
    5
    300
    GVM
    5
    300

## Output

    200
    1401


Here is the solution in Java:

**Movie class**
```java
public class Movie {
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    // Parameterized constructor
    public Movie(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    // Getters
    public int getMovieId() {
        return movieId;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public int getBudget() {
        return budget;
    }

    // Setters
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
```

**Solution class**
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie[] movies = new Movie[4];
        movies[0] = new Movie(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt());
        movies[1] = new Movie(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt());
        movies[2] = new Movie(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt());
        movies[3] = new Movie(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt());

        String director = scanner.next();
        int rating = scanner.nextInt();
        int budget = scanner.nextInt();

        int avgBudget = findAvgBudgetByDirector(movies, director);
        if (avgBudget > 0) {
            System.out.println(avgBudget);
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Movie movie = getMovieByRatingBudget(movies, rating, budget);
        if (movie != null) {
            System.out.println(movie.getMovieId());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
    }

    public static int findAvgBudgetByDirector(Movie[] movies, String director) {
        int sum = 0;
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                sum += movie.getBudget();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public static Movie getMovieByRatingBudget(Movie[] movies, int rating, int budget) {
        for (Movie movie : movies) {
            if (movie.getRating() == rating && budget % movie.getRating() == 0 && movie.getBudget() == budget) {
                return movie;
            }
        }
        return null;
    }
}
```

**Explanation**

We create a `Movie` class with a parameterized constructor, getters, and setters. The `Solution` class has two static methods - `findAvgBudgetByDirector` and `getMovieByRatingBudget`.

In the `main` method, we read the movie objects from the input, along with the director, rating, and budget. We then call these static methods and print the output.

The `findAvgBudgetByDirector` method iterates through the movie objects, checks if the director matches the given director, and if so, adds the budget to the sum and increments the count. Finally, it returns the average budget if there are movies by the given director, or 0 otherwise.

The `getMovieByRatingBudget` method iterates through the movie objects, checks if the rating and budget match the given rating and budget, and if the rating is a factor of the budget. If all conditions are met, it returns the movie object. Otherwise, it returns null.

**Input**

The input is provided in the problem statement.

**Output**

The output is:

```
200
1401
```

This corresponds to the average budget for the given director and the movieId of the movie with the specified rating and budget requirement.