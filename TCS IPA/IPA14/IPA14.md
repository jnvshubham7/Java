Create class Movie with below attributes: 

movieName - String 
company - String 
genre - String 
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
objects where the searchGenre String matches with the original array of Movie object's genre attribute 
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie

## Question 2: Get Movie by Genre with Budget Check
### Java Code:

```java
import java.util.ArrayList;
import java.util.List;

class Movie {
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

class Solution {
    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                result.add(movie);
            }
        }
        return result.toArray(new Movie[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie("aaa", "Marvel", "Action", 250000000);
        movies[1] = new Movie("bbb", "Marvel", "Comedy", 25000000);
        movies[2] = new Movie("ccc", "Marvel", "Comedy", 2000000);
        movies[3] = new Movie("ddd", "Marvel", "Action", 300000000);
        String searchGenre = "Action";

        Movie[] filteredMovies = Solution.getMovieByGenre(movies, searchGenre);
        for (Movie movie : filteredMovies) {
            if (movie.getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }
    }
}
```

### Explanation:

This program creates a `Movie` class with attributes `movieName`, `company`, `genre`, and `budget`. The `Solution` class contains a static method `getMovieByGenre` that takes an array of `Movie` objects and a search genre as parameters and returns an array of `Movie` objects where the genre matches the search genre (case insensitive search).

In the `main` method, an array of `Movie` objects is created and initialized with some values. Then, the `getMovieByGenre` method is called with the array of movies and a search genre. The resulting array of movies is then iterated over and for each movie, it is checked if the budget is greater than 80000000. If it is, "High Budget Movie" is printed; otherwise, "Low Budget Movie" is printed.

### Input:

```
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action
```

### Output:

```
High Budget Movie
High Budget Movie
```

### Solution:

The program correctly filters the movies by genre and checks if each movie's budget is greater than 80000000.