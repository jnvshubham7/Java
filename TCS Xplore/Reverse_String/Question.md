## Problem Statement

Write a Java program to reverse a given string

### Condition

The reverse string should be printed in lowercase only.

## Input

    WelCome

## Output

    emoclew


## Problem Statement
Write a Java program to reverse a given string

### Condition
The reverse string should be printed in lowercase only.

## Input

    WelCome

## Output

    emoclew

### Solution
#### Method: Using Reverse Method of StringBuilder

Here is the Java code that uses the `reverse` method of the `StringBuilder` class to reverse the string:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder sb = new StringBuilder(input).reverse();
        System.out.println(sb.toString().toLowerCase());
    }
}
```

### Explanation

This program uses a `StringBuilder` object to reverse the input string. The `reverse` method of the `StringBuilder` class is used to reverse the string. Finally, the reversed string is converted to lowercase using the `toLowerCase` method of the `String` class and printed to the console.

### Input

    WelCome

### Output

    emoclew

### Possible Solutions

#### 1. Using Reverse Method of StringBuilder

This is the solution provided above.

#### 2. Using Char Array

We can also reverse the string by creating a char array and reversing the array in place. Here is the code for this method:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        System.out.println(new String(charArray).toLowerCase());
    }
}
```

This solution uses two pointers, one at the start of the array and one at the end. It swaps the characters at these positions and moves the pointers towards each other until they meet in the middle. Finally, the reversed character array is converted to a string and printed to the console.

#### 3. Using Iterative Approach

We can also reverse the string by iterating over the string and building a new string in reverse order. Here is the code for this method:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println(reversed.toLowerCase());
    }
}
```

This solution uses a for loop to iterate over the input string and build a new string in reverse order. Finally, the reversed string is converted to lowercase and printed to the console.