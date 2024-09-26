## Problem Statement

Write a Java program to check whether a given number is a perfect square or not

### Condition

Input will only be a positive interger and will not have any decimal or special characters

## Input

    9

## Output

    TRUE

## Explanation

> A positive integer is a perfect square if it is the product of some integer with itself.
> As `9` is a square of `3` (ie., `3 * 3 = 9`).


## Perfect Square Checker

### Problem Statement

Write a Java program to check whether a given number is a perfect square or not.

### Condition

Input will only be a positive integer and will not have any decimal or special characters.

### Java Code

```java
import java.lang.Math;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        int number = 9; // Input
        double sqrt = Math.sqrt(number);
        if (sqrt % 1 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
```

### Input

    9

### Output

    TRUE

### Explanation

> A positive integer is a perfect square if it is the product of some integer with itself.
> As `9` is a square of `3` (ie., `3 * 3 = 9`).

This code calculates the square root of the input number and checks if it is an integer by using the modulus operator (`%`). If the remainder is `0`, it means the number is a perfect square, and the program prints `TRUE`. Otherwise, it prints `FALSE`.