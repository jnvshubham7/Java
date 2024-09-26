## Problem Statement

Write a Java program to compute the number of spaces and characters in a given string

### Condition

Ignore all the digits

## Input

    Hello This is ABCD from XYZ city

## Output

    No of spaces : 6 and characters : 26

## Explanation

> The total number of spaces and all the characters excluding numbers/digits are computed and printed.


## Problem Statement
Write a Java program to compute the number of spaces and characters in a given string, ignoring all the digits.

### Code

```java
public class Main {
    public static void main(String[] args) {
        String input = "Hello This is ABCD from XYZ city";
        int spaceCount = 0;
        int charCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                charCount++;
            } else if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        System.out.println("No of spaces : " + spaceCount + " and characters : " + charCount);
    }
}
```

### Input

    Hello This is ABCD from XYZ city

### Output

    No of spaces : 6 and characters : 26

### Explanation

> This program iterates through the input string, and uses the `Character.isLetter()` method to check if a character is a letter (i.e., not a digit). It increments the `charCount` variable for each letter encountered. It uses the following condition to check for spaces:

```java
if (input.charAt(i) == ' ') {
    spaceCount++;
}
```

> Finally, it prints the count of spaces and characters.

### Possible Solutions

*   Use regular expressions to find the number of spaces and characters. This approach might be less efficient for large inputs, but it can be more intuitive:

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String input = "Hello This is ABCD from XYZ city";
        int spaceCount = Pattern.matches("[\\s]+", input).matches().group().length();
        int charCount = input.replaceAll("[\\d]", "").length();
        System.out.println("No of spaces : " + spaceCount + " and characters : " + charCount);
    }
}
```

*   Use `String.replaceFirst()` to remove all digits, then calculate the length of the resulting string for the number of characters, and use `String.replaceAll()` to replace all spaces with an empty string, then get the length of the resulting string for the number of spaces:

```java
public class Main {
    public static void main(String[] args) {
        String input = "Hello This is ABCD from XYZ city";
        int spaceCount = input.replaceAll("[\\d]", "").replace(" ", "").length();
        int charCount = input.length() - spaceCount;
        System.out.println("No of spaces : " + (input.length() - spaceCount) + " and characters : " + charCount);
    }
}
```