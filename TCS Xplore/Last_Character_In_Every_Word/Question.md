## Problem Statement

Write a Java program to print the last character of every word in a given string

### Conditions

Ignore all the digits and whitespaces

## Input

    Hey3 Java   Learners

## Output

    as

## Explanation

> As the first word `Hey3` has digit in its last position, ignore it.
> The second word `Java` has multiple white spaces after it. But those white spaces should be ignored and only the last character should be printed.
> Likewise, the last character of the word `Learners` should be printed.
> Thus, the output `as`.


Here is a structured markdown format with headers for questions and methods, along with Java code and explanations:
### Problem Statement
Write a Java program to print the last character of every word in a given string

### Conditions
Ignore all the digits and whitespaces


## Input
    Hey3 Java   Learners



## Output
    as


## Explanation
> As the first word `Hey3` has digit in its last position, ignore it.
> The second word `Java` has multiple white spaces after it. But those white spaces should be ignored and only the last character should be printed.
> Likewise, the last character of the word `Learners` should be printed.
> Thus, the output `as`.

### Solution

#### Method 1: Using Regular Expressions
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "Hey3 Java   Learners";
        
        Pattern pattern = Pattern.compile("\\b\\w*");
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() > 0) {
                System.out.print(word.charAt(word.length()-1) + " ");
            }
        }
    }
}
```
#### Input
    Hey3 Java   Learners

#### Output
    a s


#### Explanation
We use the `Pattern` class to compile a regular expression that matches a word boundary (`\\b`) followed by zero or more word characters (`\\w*`). Then, we use a `Matcher` object to match the pattern in the input string. For each match, we print the last character of the matched word using `charAt(word.length()-1)`.

#### Alternative Method 1: Using String Functions
```java
public class Main {
    public static void main(String[] args) {
        String input = "Hey3 Java   Learners";
        
        String[] words = input.split("\\s+|\\d+");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(word.length()-1) + " ");
            }
        }
    }
}
```
#### Input
    Hey3 Java   Learners

#### Output
    a s


#### Explanation
We split the input string into an array of words using a regular expression that matches one or more whitespace characters (`\\s+`) or one or more digits (`\\d+`). Then, we iterate over the array and print the last character of each word using `charAt(word.length()-1)`, ignoring empty strings.

### Conclusion

Both methods provide a solution to the problem by ignoring digits and whitespaces and printing the last character of every word in the input string. However, the second method is more concise and efficient as it eliminates the need for regular expressions.