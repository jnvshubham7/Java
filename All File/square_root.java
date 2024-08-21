import java.util.Scanner;

public class square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a, b, c  : ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        double D=b*b - 4*a*c;
        double x;
        if(D>=0)
        {
            x=Math.sqrt(D);
            System.out.println("Root 1 : "+(-b+D)/2*a);
            System.out.println("Root 2 : "+(-b-D)/2*a);
        }
        else
        {
            System.out.println("Roots ar imaginary");
        }
        sc.close();

    }
    
}
