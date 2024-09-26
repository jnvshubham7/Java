## Problem Statement

Write a Java program to reverse a given number

### Condition

Input will only be a positive interger and will not have any characters

## Input

    12345

## Output

    54321

## Explanation

> Solution1-Explanation
> Number modulo 10 will give the last digit as result. (ie., 12345 % 10 = 5).
> Again dividing the same number by 10 will give the remaining digits except last one.
> Solution2-Explanation
> StringBuffer's append method concats the given input to the buffer.
> StringBuffer's reverse method reverses the contents of the StringBuffer.


Here's the solution to the problem:

**Problem Statement**
Write a Java program to reverse a given number

### Condition

* Input will only be a positive integer and will not have any characters

## Input

    12345

## Output

    54321

## Explanation

### Solution 1 - Using Modulus and Division

This solution uses modulus and division operators to extract digits from the given number and reverse it.

#### Java Code
```java
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev); // Output: 54321
    }
}
```

#### Explanation

* We initialize a variable `rev` to store the reversed number, and another variable `num` to store the input number.
* We use a while loop to extract digits from the input number.
* Inside the loop, we calculate the last digit of the input number using modulus operator (`num % 10`).
* We add this digit to the `rev` variable after shifting its digits to the left by multiplying it by 10 (`rev * 10`).
* We then divide the input number by 10 to move to the next digit.
* We repeat this process until the input number becomes 0.
* Finally, we print the reversed number.

### Solution 2 - Using StringBuffer

This solution uses the StringBuffer class to reverse the given number.

#### Java Code
```java
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString()); // Output: 54321
    }
}
```

#### Explanation

* We first convert the input number to a string using `String.valueOf`.
* We create a StringBuilder object from the string.
* We use the `reverse` method of the StringBuilder object to reverse the string.
* Finally, we convert the reversed string back to an integer and print it.

### Possible Solutions

* We can also use a recursive function to reverse the number.
* We can use a loop to concatenate the digits in reverse order and convert the result back to an integer.

Remember to include the necessary import statements at the beginning of your Java code.