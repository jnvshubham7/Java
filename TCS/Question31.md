## Problem Statement

Write a Java program to print the characters at the odd position of a given string

## Input

    Hey there!

## Output

    e hr!

## Explanation

> All the characters (including whitespace) at the odd position of the string `Hey there!` are printed.


## Problem Statement
Write a Java program to print the characters at the odd position of a given string

## Input
    Hey there!

## Output
    e hr!

## Explanation
> All the characters (including whitespace) at the odd position of the string `Hey there!` are printed.

### Solution

#### Java Code
```java
public class OddPositionChars {
    public static void main(String[] args) {
        String str = "Hey there!";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
```

#### Explanation

The problem requires printing the characters at the odd positions of a given string. We can achieve this by iterating through each character of the string using a `for` loop, and then checking if the index of the character is odd using the modulus operator `%`. If the index is odd, we print the character. The `charAt()` method is used to get the character at a specific index.

#### Output
    e hr!

#### Possible Solutions

1. Iterate through each character of the string using a `for` loop and check if the index of the character is odd. If it is, print the character.
2. Use a `StringBuilder` to store the characters at odd positions and then print the `StringBuilder` object.
3. Use regex to find all the characters at odd positions in the string.

Note: The above solution uses a simple `for` loop to iterate through each character of the string and checks if the index of the character is odd. This approach is efficient and easy to understand.