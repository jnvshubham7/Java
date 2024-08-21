import java.util.*;

public class NewspaperIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Newspaper[] np = new Newspaper[4];

        for (int i = 0; i < np.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();

            np[i] = new Newspaper(a, b, c, d);
        }

        int pubyear = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        sc.close();

        int totalprice = findTotalPriceByPublicationYear(np, pubyear);
        if (totalprice != 0) {
            System.out.println(totalprice);
        } else {
            System.out.println("No Newspaper found with the mentioned attribute");
        }

        Newspaper obj = searchNewspaperByName(np, name);
        if (obj != null) {
            System.out.println("regNo-" + obj.getRegNo());
            System.out.println("name-" + obj.getName());
            System.out.println("publicationYear-" + obj.getPublicationYear());
            System.out.println("price-" + obj.getPrice());
        } else {
            System.out.println("No Newspaper found with the given name");
        }
    }

    public static int findTotalPriceByPublicationYear(Newspaper[] np, int pubyear) {
        int totalPrice = 0;  // Initialize the total price

        for (Newspaper newspaper : np) {
            if (newspaper.getPublicationYear() == pubyear) {
                totalPrice += newspaper.getPrice();
            }
        }

        return totalPrice; // Return the total price directly
    }

    public static Newspaper searchNewspaperByName(Newspaper[] np, String name) {
        for (Newspaper newspaper : np) {
            if (newspaper.getName().equalsIgnoreCase(name)) {
                return newspaper; // Return the newspaper if the name matches
            }
        }
        return null; // Return null if no match is found
    }
}

class Newspaper {
    int regNo;
    String name;
    int publicationYear;
    int price;

    public Newspaper(int regNo, String name, int publicationYear, int price) {
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
