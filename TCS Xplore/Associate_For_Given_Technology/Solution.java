import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Associate {
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

    public String getName() {
        return name;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }
}

public class Solution {
    public static List<Integer> associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        List<Integer> result = new ArrayList<>();
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) && associate.getExperienceInYears() % 5 == 0) {
                result.add(associate.getId());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Associate[] associates = new Associate[5];

        for (int i = 0; i < 5; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            String technology = scanner.next();
            int experienceInYears = scanner.nextInt();
            associates[i] = new Associate(id, name, technology, experienceInYears);
        }

        String searchTechnology = scanner.next();
        List<Integer> result = associatesForGivenTechnology(associates, searchTechnology);

        System.out.println("Output:");
        for (Integer id : result) {
            System.out.print(id + " ");
        }
    }
}




















// import java.util.Arrays;
// import java.util.Scanner;
// public class Solution {
//     public static void main(String[] args) {
//         Associate[] associates = new Associate[5];
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0;i < 5;i++) {
//             associates[i] = new Associate(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
//         }
//         String searchTechnology = sc.next();
//         sc.close();
//         Associate[] result= associatesForGivenTechnology(associates,searchTechnology);
//         for(int i=0;i<result.length;i++)
//             System.out.println(result[i].getId());
//     }

//     public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
//         Associate[] refined = new Associate[0];
//         for(int i=0;i<associates.length;i++) {
//             if(associates[i].getTechnology().equals(searchTechnology) && associates[i].getExperienceInYears()%5==0){
//                 refined=Arrays.copyOf(refined,refined.length+1);
//                 refined[refined.length-1] = associates[i];
//             }
//         }
//         return refined;
//     }
// }

// class Associate{
//     private int id;
//     private String name;
//     private String technology;
//     private int experienceInYears;
//     public int getId() {
//         return id;
//     }
//     public void setId(int id) {
//         this.id = id;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getTechnology() {
//         return technology;
//     }
//     public void setTech(String technology) {
//         this.technology = technology;
//     }
//     public int getExperienceInYears() {
//         return experienceInYears;
//     }
//     public void setExp(int experienceInYears) {
//         this.experienceInYears = experienceInYears;
//     }
//     public Associate(int id, String name, String technology, int experienceInYears) {
//         this.id = id;
//         this.name = name;
//         this.technology = technology;
//         this.experienceInYears = experienceInYears;
//     }
// }




