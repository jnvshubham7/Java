Define two functions as given below.

1. validateScore: This function will validate a given number whether it is less than or equal to 100 and greater than 0. 
If these conditions are matched, function will return True, otherwise return False

2. findValidScores : This function will take a list of scores (numbers ) as input,and return a list of scores from the input 
list after validation . Use the method validateScore to validate scores in the input list. If the input list does not contain 
any valid score, function should return None.

Define the main section for the following:

1. Create a list of positive integers by taking user inputs
To create the list, do the following:
a. First read the number of elements (integer) you want to store in the list as input from user
b. Read a number as input and add to the list. Repeat this step for the number of elements to be stored in the list (considered
 in the first line of input)

2. Call the method findValidScores by passing the list created in point #1 as argument.

3. Print a message “Valid Scores =” (excluding the quotes) followed by the list returned by the method findValidScores in the 
same line. If the method returns None, print the message “No valid score found.” (excluding the quotes).

Sample Input description:
The first input is the number of elements to be added to the list.

The next set of inputs are the numbers to be added to the list one after another and is repeated for the number of elements 
given in the first line of input.
 
Check the sample input and output below.


Sample Input 1:
For example, if you want to create a list of 5 positive numbers with values 10,20 ,101,90 and 0
then the input should be read/given as follows:

5
10
20
101
90
0

And the output for the above set of input will be:

Valid Scores = [10, 20, 90]

Sample Input 2:
8
-100
101
0
.80
101
120
-75
0.78

Output:
No valid score found.

## Question: Validate Scores

### Problem Statement

Define the following functions:

1. `validateScore`: Validate a given number whether it is less than or equal to 100 and greater than 0. If these conditions are matched, the function returns `True`, otherwise returns `False`.
2. `findValidScores`: Take a list of scores (numbers) as input and return a list of scores from the input list after validation. Use the `validateScore` method to validate scores in the input list. If the input list does not contain any valid score, the function should return `None`.

### Main Method

Create a list of positive integers by taking user inputs:

1. Read the number of elements (integer) to be stored in the list as input from the user.
2. Read a number as input and add it to the list. Repeat this step for the number of elements to be stored in the list.
3. Call the `findValidScores` method by passing the list created in step 1 as an argument.
4. Print a message "Valid Scores = " followed by the list returned by the `findValidScores` method. If the method returns `None`, print the message "No valid score found."

### Java Code
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidateScores {
    public static boolean validateScore(int score) {
        return score > 0 && score <= 100;
    }

    public static List<Integer> findValidScores(List<Integer> scores) {
        List<Integer> validScores = new ArrayList<>();
        for (int score : scores) {
            if (validateScore(score)) {
                validScores.add(score);
            }
        }
        return validScores.isEmpty() ? null : validScores;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // read number of elements
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scores.add(scanner.nextInt()); // read numbers to be added to the list
        }
        List<Integer> validScores = findValidScores(scores);
        if (validScores == null) {
            System.out.println("No valid score found.");
        } else {
            System.out.println("Valid Scores = " + validScores);
        }
    }
}
```

### Sample Input 1:

5
10
20
101
90
0

### Output:

Valid Scores = [10, 20, 90]

### Sample Input 2:

8
-100
101
0
.80
101
120
-75
0.78

### Output:

No valid score found.