## Problem Statement

Create class Associate with below attributes:
id - int
name - String
technology - String
experienceInYears - int

Create class Solution and implement static method "associatesForGivenTechnology" in the Solution class.
This method will take array of Associate objects and a searchTechnology String as parameters.
And will return another array of Associate objects where the searchTechnology String matches with the original array of Associate object's technology attribute (case insensitive search) and experienceInYears attribute should be multiples of 5.

Write necessary getters and setters.

Before calling "associatesForGivenTechnology" method in the main method, read values for five associate objects referring the attributes in above sequence along with a String searchTechnology.
Then call the "associatesForGivenTechnology" method and write the logic to print the id's in the main method.

## Input

    101
    Alex
    Java
    15
    102
    Albert
    Unix
    20
    103
    Alferd
    Testing
    13
    104
    Alfa
    Java
    15
    105
    Almas
    Java
    29
    Java

## Output

    101
    104


Here is the solution to the problem:

### Associate Class

```java
public class Associate {
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public Associate() {}

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
```

### Solution Class

```java
public class Solution {
    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        List<Associate> result = new ArrayList<>();
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) && associate.getExperienceInYears() % 5 == 0) {
                result.add(associate);
            }
        }
        return result.toArray(new Associate[0]);
    }
}
```

### Main Method

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Associate[] associates = new Associate[5];
    for (int i = 0; i < 5; i++) {
        associates[i] = new Associate(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
    }
    String searchTechnology = scanner.next();
    Associate[] result = Solution.associatesForGivenTechnology(associates, searchTechnology);
    for (Associate associate : result) {
        System.out.println(associate.getId());
    }
}
```

### Explanation

1. The `Associate` class has four attributes: `id`, `name`, `technology`, and `experienceInYears`. It also has getters and setters for these attributes.
2. The `Solution` class has a static method `associatesForGivenTechnology` that takes an array of `Associate` objects and a `searchTechnology` string as parameters. It returns an array of `Associate` objects where the `searchTechnology` string matches the `technology` attribute (case insensitive search) and the `experienceInYears` attribute is a multiple of 5.
3. In the `main` method, we read values for five `Associate` objects and a `searchTechnology` string using a `Scanner`.
4. We then call the `associatesForGivenTechnology` method and store the result in an array of `Associate` objects.
5. Finally, we print the `id` of each `Associate` object in the result array.

### Input

```
101
Alex
Java
15
102
Albert
Unix
20
103
Alferd
Testing
13
104
Alfa
Java
15
105
Almas
Java
29
Java
```

### Output

```
101
104
```