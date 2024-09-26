import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

class Solution {
    public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
        // Count the number of SIMs in circle1
        int count = 0;
        for (Sim sim : sims) {
            if (sim.getCircle().equalsIgnoreCase(circle1)) {
                count++;
            }
        }

        // Create an array to hold only the SIMs in circle1
        Sim[] result = new Sim[count];
        int index = 0;

        for (Sim sim : sims) {
            if (sim.getCircle().equalsIgnoreCase(circle1)) {
                sim.setCircle(circle2);
                result[index++] = sim;
            }
        }

        // Sort result with respect to rate per second in descending order
        Arrays.sort(result, Comparator.comparingDouble(Sim::getRatePerSecond).reversed());

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Adjust the number of SIMs to match the provided input data
        Sim[] sims = new Sim[5];

        for (int i = 0; i < 5; i++) {
            int simId = sc.nextInt();
            sc.nextLine();
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();

            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }

        // Read the circles to transfer from and to
        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        // Perform the circle transfer
        Sim[] result = transferCircle(sims, circle1, circle2);

        // Output the results
        for (Sim sim : result) {
            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
        }

        sc.close();
    }
}
