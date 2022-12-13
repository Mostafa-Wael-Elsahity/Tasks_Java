import java.math.BigInteger;
import java.util.Scanner;
import java.util.Timer;

class Circle {
    private double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return radius * radius * 3.14;
    }

    double getSurrounding() {
        return 2 * 3.14 * radius;
    }
}

class Triangle {
    int a=0, b=0, c=0;
    void setSides(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int []getSides(){
        int sides[]={a,b,c};
        return sides;
    }
    double getArea(){
        double semi=(a+b+c)/2.0;
        return Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
    }
    int getSurrounding(){
        return a+b+c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // task 6 : Triangle and Circle (Area and Surrounding)
        // Triangle
        System.out.print("Enter Sides of Triangle :");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        Triangle t1=new Triangle();
        t1.setSides(a,b,c);
        System.out.println("Area of Triangle = "+t1.getArea());
        System.out.println("Surrounding of Triangle = "+t1.getSurrounding());

        // Circle
        double radius = scan.nextDouble();
        Circle c1=new Circle();
        c1.setRadius(radius);
        System.out.println("Area of Circle = "+c1.getArea());
        System.out.println("Surrounding of Circle = "+c1.getSurrounding());

    }

}
