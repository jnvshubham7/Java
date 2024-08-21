package oom;

import java.util.Scanner;

class Student{
    int roll;
    float height;
    public void getData(){
        System.out.println("Roll number is " + roll + " and Height is " + height);
    }
    Student(int r, float h){
        roll = r;
        height = h;
    }
}

public class que2 {
    static float avght(Student st[]){
        float sum=0;
        for (int i=0; i<3; i++){
            sum+=st[i].height;
        }
        sum=(float) sum/3;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st[] = new Student[3];
        int r;
        float h;
        int k=0;
        for (int i=0; i<3; i++){
            System.out.println("Enter roll and height of student " + ++k);
            r = sc.nextInt();
            h = sc.nextFloat();
           st[i] = new Student(r,h);
        }
        k=0;
        for (int i=0; i<3; i++){
            System.out.print("For student " + ++k + " : ");
            st[i].getData();
        }
        float avg = avght(st);
        System.out.println("the average height is "+ avg);

    }
}