public class BitwiseOperators {

    public static void main(String[] args) {
        int bit1 = Integer.parseInt("10101010", 2);
        int bit2 = Integer.parseInt("01010101", 2);


        
        System.out.println(Integer.toBinaryString(bit1 & bit2));
        System.out.println(Integer.toBinaryString(bit1 ^ bit2));
        System.out.println(Integer.toBinaryString(bit1 | bit2));
        System.out.println(Integer.toBinaryString(bit1 << bit2));
        System.out.println(Integer.toBinaryString(bit1 >> bit2));
    }
}