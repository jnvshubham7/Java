// package oom.tut_7;

import java.util.Scanner;

abstract class Shape{
    double a,p;
    abstract public void area();
    abstract public void perimeter();
}

class Circle extends Shape{
    double r;
    @Override
    public void area(){
        a=(22*r*r)/7;
        System.out.println("Area of the circle : "+a);
    }
    @Override
    public void perimeter(){
        p=(2*22*r)/7;
        System.out.println("Perimeter of the circle : "+p+"\n");
    }
}
class Rectangle extends Shape{
    double l,b;
    @Override
    public void area(){
        a=l*b;
        System.out.println("Area of the rectangle : "+a);
    }
    @Override
    public void perimeter(){
        p=2*(l+b);
        System.out.println("Perimeter of the rectangle : "+p+"\n");
    }
}
class Square extends Shape{
    double s;
    @Override
    public void area(){
        a=s*s;
        System.out.println("Area of the square : "+a);
    }
    @Override
    public void perimeter(){
        p=4*s;
        System.out.println("Perimeter of the square : "+p+"\n");
    }
}

public class tut7_que2 {
    public static void main(String[] args) {
        Circle c= new Circle();
        System.out.print("Enter radius of the circle : ");
        Scanner sc = new Scanner(System.in);
        c.r=sc.nextFloat();
        c.area();
        c.perimeter();

        Rectangle r= new Rectangle();
        System.out.print("Enter length of the rectangle : ");
        r.l=sc.nextFloat();
        System.out.print("Enter breadth of the rectangle : ");
        r.b=sc.nextFloat();
        r.area();
        r.perimeter();

        Square sq= new Square();
        System.out.print("Enter side of the square : ");
        sq.s=sc.nextFloat();
        sq.area();
        sq.perimeter();
    }
}