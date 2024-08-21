import java.util.Scanner;

public class sum_of_all_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits is : "+sum);
        sc.close();
    }
    
}
