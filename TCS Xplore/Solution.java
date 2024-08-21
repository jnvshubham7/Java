import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static Sim[] transferCircle(Sim[] sim, String circle1, String circle2) {
        // Count the number of SIMs in circle1
        int count = 0;
        for (Sim s : sim) {
            if (s.getCircle().equalsIgnoreCase(circle1)) {
                count++;
            }
        }

        // Create an array to hold only the SIMs in circle1
        Sim[] res = new Sim[count];
        int index = 0;

        for (Sim s : sim) {
            if (s.getCircle().equalsIgnoreCase(circle1)) {
                s.setCircle(circle2);
                res[index++] = s;
            }
        }

        // Sort res with respect to rate per second in descending order
        Arrays.sort(res, Comparator.comparing(Sim::getRate_p_s).reversed());

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Adjust the number of SIMs to match the provided input data
        Sim[] sim = new Sim[5];

        for (int i = 0; i < 5; i++) {
            int simId = sc.nextInt();
            sc.nextLine();
            String cus_name = sc.nextLine();
            double bal = sc.nextDouble();
            double rate_p_s = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();

            sim[i] = new Sim(simId, cus_name, bal, rate_p_s, circle);
        }

        // Read the circles to transfer from and to
        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        // Perform the circle transfer
        Sim[] res = transferCircle(sim, circle1, circle2);

        // Output the results
        for (Sim s : res) {
            if (s != null) {
                System.out.println(s.getSimId());
                System.out.println(s.getCus_name());
                System.out.println(s.getBal());
                System.out.println(s.getRate_p_s());
            }
        }

        sc.close();
    }
}

class Sim {
    private int simId;
    private String cus_name;
    private double bal;
    private double rate_p_s;
    private String circle;

    public Sim(int simId, String cus_name, double bal, double rate_p_s, String circle) {
        this.simId = simId;
        this.cus_name = cus_name;
        this.bal = bal;
        this.rate_p_s = rate_p_s;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public String getCus_name() {
        return cus_name;
    }

    public double getBal() {
        return bal;
    }

    public double getRate_p_s() {
        return rate_p_s;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
