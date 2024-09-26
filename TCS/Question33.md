## Problem Statement

Write a Java program to print the unique characters present in the given string in the same sequence as they appear(the first occurrence) in the input.

### Condition

All the characters should be in lowercase only.

## Input

    xperience

## Output

    xperinc


Here is the solution to the problem in a structured markdown format with headers for questions and methods.
```markdown
## Problem Statement
Write a Java program to print the unique characters present in the given string in the same sequence as they appear(the first occurrence) in the input.

### Condition
All the characters should be in lowercase only.

## Input
    xperience

## Output
    xperinc

### Method 1: Using HashSet
Here is the Java code to solve the problem using HashSet:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "xperience";
        Set<Character> set = new LinkedHashSet<Character>();
        for (char c : input.toLowerCase().toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        System.out.println(result);
    }
}
```

### Explanation
This code uses a LinkedHashSet to store the unique characters of the input string. The LinkedHashSet maintains the same order as the characters appear in the input string. Then it iterates over the set and appends each character to a StringBuilder to form the output string.

### Input
    xperience

### Output
    xperinc

### Possible Solutions
*   Using HashSet and LinkedHashSet as shown in the code above.
*   Using distinct() function from Stream Api.
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "xperience";
        StringBuilder result = new StringBuilder();
        for (char c : input.toLowerCase().chars().distinct().mapToObj(String::valueOf).collect(Collectors.toList())) {
            result.append(c);
        }
        System.out.println(result);
    }
}
```

*   Sorting the input string and then iterating over it.