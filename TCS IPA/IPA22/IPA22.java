
import java.util.*;

class Associate {

    int id;
    String name;
    String tech;
    int exp;

    public Associate(int id,
            String name,
            String tech,
            int exp) {
        this.id = id;
        this.name = name;
        this.tech = tech;
        this.exp = exp;

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

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

}

class IPA22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Associate[] a = new Associate[5];

        for (int i = 0; i < 5; i++)

        {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String tech = sc.nextLine();
            int exp = sc.nextInt();
            sc.nextLine();

            a[i] = new Associate(id, name, tech, exp);

        }

        String s_tech = sc.nextLine();

        Associate[] result = findAssociateWithMaxExp(a, s_tech);

        if (result != null) {
            for (Associate aa : result) {
                System.out.println(aa.getId());
            }
        }

        else {
            System.out.println("No data found");
        }

    }

    public static Associate[] findAssociateWithMaxExp(Associate[] a, String tech) {

        List<Associate> list = new ArrayList<>();

        for (Associate aa : a) {
            if (aa.getTech().equalsIgnoreCase(tech) && aa.getExp() % 5 == 0) {
                list.add(aa);
            }
        }

        Associate[] arr = list.toArray(new Associate[list.size()]);

        if (arr.length > 0) {
            return arr;
        }

        return null;

    }

}
