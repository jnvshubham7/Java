import java.util.Scanner;



class Student {
    private String name;
    private static char section='A';
    private int roll;
    private static int standard=2;
    private static int totalMarks=500;
    private int obtainedMarks;

    //setter methods
    public void setter(String n, int r, int mO)
    {
        this.name =n;
        this.roll =r;
        this.obtainedMarks=mO;
    }

    //getter methods
    public void getter()
    {
        System.out.println("\n\nName                               :  "+name);
        System.out.println("Standard                           :  "+standard);
        System.out.println("Section                            :  "+section);
        System.out.println("Total Marks obtained out of "+totalMarks+" is :  "+obtainedMarks);
        System.out.println("Percent_Obtained                   :  "+percent(obtainedMarks));
        System.out.println("Roll no.                           :  "+roll);
        System.out.println("Grade                              :  "+grade(obtainedMarks));
    }

    public float percent(int mO)
    {
        return (float)mO/(float)5*1f;
    }

    public char grade(int mO)
    {
        float x=mO/5*1f; 
        if(x>90)
        return 'A';
        else
        if(x>80)
        return 'B';
        else
        if(x>70)
        return 'C';
        else
        if(x>60)
        return 'D';
        else 
        if(x>50)
        return 'E';
        else
        return 'F';
    }

}
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj= new Student();
        System.out.print("Enter name           : ");
        String name = sc.next();
        System.out.print("Enter roll No.       : ");
        int roll = sc.nextInt();
        System.out.print("Enter marks obtained : ");
        int marks = sc.nextInt();
        obj.setter(name , roll, marks);
        obj.getter();
        sc.close();
    }
}
