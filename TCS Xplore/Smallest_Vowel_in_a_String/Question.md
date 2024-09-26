## Problem Statement

Write a program to print the smallest vowel in a given string

## Input

    matrix

## Output

    a

## Explanation

> The vowels in the given string are `a` and `i`.
> And the alphabetically smallest between them is `a`.


## Problem Statement
Write a program to print the smallest vowel in a given string

## Input
matrix

## Output
a

## Explanation
> The vowels in the given string are `a` and ``.
> And the alphabetically smallest between them is `a`.

### Java Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String smallestVowel = findSmallestVowel(str);
        System.out.println("The smallest vowel is: " + smallestVowel);
    }

    public static String findSmallestVowel(String str) {
        String vowels = "aeiouAEIOU";
        String smallest = "";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(String.valueOf(c)) != -1) {
                if (smallest.isEmpty()) {
                    smallest = String.valueOf(c);
                } else if (c < smallest.charAt(0)) {
                    smallest = String.valueOf(c);
                }
            }
        }
        return smallest;
    }
}
```

### Solution

The program is designed to accept a string from the user and find the smallest vowel in the input string. The `findSmallestVowel` method iterates over each character of the input string and checks if the character is a vowel (using the `vowels` string constant). If the character is a vowel, it checks if the `smallest` variable is empty or if the current vowel should replace the current `smallest` vowel. If it should replace the `smallest` vowel, it updates the `smallest` variable. Finally, it prints the smallest vowel to the console.