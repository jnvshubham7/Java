import java.util.Scanner;

public class sum_of_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. n  : ");
        int n = sc.nextInt();
        double fact=1;
        double sum =0;
        for(int i=1; i<=n; i++)
        {
            fact= fact*i;
            sum= sum+((double)i/fact);
        }
        System.out.println("Sum of the series 1/1! + 2/2! + 3/3!  .....   is  : "+sum);
        sc.close();
    }
}
