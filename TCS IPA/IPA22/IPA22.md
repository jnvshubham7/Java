Create class Associate with below attributes:
id - int
name - String
technology - String
experienceInYears - int

Create class Solution and implement static method "associatesForGivenTechnology" in the Solution class.
This method will take array of Associate objects and a searchTechnology String as parameters.
And will return another array of Associate objects where the searchTechnology String matches with the original array of 
Associate object's technology attribute (case insensitive search) and experienceInYears attribute should be multiples of 5.

Write necessary getters and setters.

Before calling "associatesForGivenTechnology" method in the main method, read values for five associate objects referring 
the attributes in above sequence along with a String searchTechnology.
Then call the "associatesForGivenTechnology" method and write the logic to print the id's in the main method.

Input
-----------------
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

Output
------------------
101
104

**Associates for Technology**
=====================



**Class Definition**

### Associate.java
```java
public class Associate {
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

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

### Solution.java
```java
public class Solution {
    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        List<Associate> result = new ArrayList<>();

        for (Associate associate : associates) {
            if (associate.getTechnology().toLowerCase().equals(searchTechnology.toLowerCase()) && associate.getExperienceInYears() % 5 == 0) {
                result.add(associate);
            }
        }

        return result.toArray(new Associate[0]);
    }
}
```

### main method
```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Associate[] associates = new Associate[5];

    for (int i = 0; i < 5; i++) {
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter technology:");
        String technology = scanner.next();
        System.out.println("Enter experience in years:");
        int experienceInYears = scanner.nextInt();

        associates[i] = new Associate(id, name, technology, experienceInYears);
    }

    System.out.println("Enter search technology:");
    String searchTechnology = scanner.next();

    Associate[] result = Solution.associatesForGivenTechnology(associates, searchTechnology);

    for (Associate associate : result) {
        System.out.println(associate.getId());
    }
}
```

**Input**
-----------------

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

**Output**
------------------

101
104