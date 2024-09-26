## Problem Statement

Write a Java program to count both vowels and consonants in a given string

### Conditions

Only alphabets should be considered for counting

## Input

    Hello World!

## Output

    Vowels count - 3
    Consonants count - 7

## Explanation

> The vowels in the given string are `e`,`o` and `o` and so the vowels count is 3.
> Likewise, the consonants in the given string are `h`,`l`,`l`,`w`,`r`,`l` and `d` and so the count is 7.


Here is the solution to the problem:

## Problem Statement

Write a Java program to count both vowels and consonants in a given string

### Conditions

Only alphabets should be considered for counting

## Input

    Hello World!

## Output

    Vowels count - 3
    Consonants count - 7

## Explanation

### Code

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello World!";
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonantCount++;
            }
        }

        System.out.println("Vowels count - " + vowelCount);
        System.out.println("Consonants count - " + consonantCount);
    }
}
```

### Output

    Vowels count - 3
    Consonants count - 7

### Solution

The program works by iterating through each character in the input string. It uses an if-else statement to check if the character is a vowel (either uppercase or lowercase) or a consonant. If the character is a vowel, it increments the `vowelCount` variable. If the character is a consonant, it increments the `consonantCount` variable. The program then prints the count of vowels and consonants.