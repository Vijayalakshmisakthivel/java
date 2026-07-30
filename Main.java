import java.util.Scanner;

abstract class Shape {
    int a, b;

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.Rectangle");
        System.out.println("2.Triangle");
        System.out.println("3.Circle");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
       
        switch(choice)
        {
        case 1:
            Rectangle r=new Rectangle();
            System.out.println("Enter length:");
            r.a=sc.nextInt();
            System.out.println("Enter breath:");
            r.b=sc.nextInt();
            r.printArea();
            break;
            
        case 2:
            Triangle t=new Triangle();
            System.out.println("Enter base:");
            t.a=sc.nextInt();
            System.out.println("Enter height:");
            t.b=sc.nextInt();
            t.printArea();
            break;

        case 3:
            Circle c=new Circle();
            System.out.println("Enter radius:");
            c.a=sc.nextInt();
            c.printArea();
            break;
       
        default:
            System.out.println("Invaild input");

        
    }
}
}