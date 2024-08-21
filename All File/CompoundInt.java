import java.util.*;

class CompoundInt{
    private static float p=5000;
    private static float r=9;
    private static float n=12;
    private static float t=6;
    private static float base=(1+r/(n*100));
    private static float exponent=n*t;
    public float power(float base, float exponent)
    {
        exponent=(int)exponent;
        float result=base;
        while(exponent!=0)
        {
            result*=base;
            exponent--;
        }
        return result;
    }
    
    public void Calculate_interest(){
        double a=p*(power(base, exponent));
        System.out.println(a-p);
    }
    public static void main(String[] args) {
        CompoundInt obj = new CompoundInt();
        System.out.print("Interest :  ");
        obj.Calculate_interest(); 
    }
}