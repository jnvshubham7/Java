import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum+= Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),3);   
        }
        if(sum == Integer.parseInt(num))
        {
            System.out.println("Yes, the number is an Armstrong number.");
        }
        else{
            System.out.println("No, the number is not an Armstrong number.");
        }
    }
}