// Hamza Yousaf
// Chapter 13. Exercise 13.1

import java.io.*;
import java.util.Scanner;


// Base class
class GeometricObject
{

    void setSide1(double s1)
    {
        side1 = s1;
    }
    void setSide2(double s2)
    {
        side2 = s2;
    }
    void setSide3(double s3)
    {
        side3 = s3;
    }
    double getSide1()
    {
        return (side1);
    }
    double getSide2()
    {
        return (side2);
    }
    double getSide3()
    {
        return (side3);
    }
    void setColor(String clr)
    {
        color=clr;
    }
    String getColor()
    {
        return(color);
    }
    void setFilled(boolean fill)
    {
        filled=fill;
    }
    boolean isFilled()
    {
        return(filled);
    }

    double side1,side2,side3;
    String color;
    boolean filled;

};

// Derived class
class Triangle extends GeometricObject
{

    double s1,s2,s3,perimeter,p,pd,area;

    Triangle()
    {
        setSide1(1.0);
        setSide2(1.0);
        setSide3(1.0);

    }
    Triangle(double s1,double s2,double s3)
    {
        setSide1(s1);
        setSide2(s2);
        setSide3(s3);

    }

    double getArea()
    {
        p=getPerimeter()/2;
        pd=p*(p-s1)*(p-s2)*(p-s3);
        area=Math.sqrt(pd);
        return (area);
    }
    double getPerimeter()
    {
        s1=getSide1();
        s2=getSide2();
        s3=getSide3();
        perimeter=s1+s2+s3;
        return (s1+s2+s3);
    }
};


class TestTriangle
{
    public static void main(String []args)

    {

        System.out.println("Enter three sides: ");
        Scanner scan=new Scanner(System.in);

        double side1, side2, side3;

        side1=scan.nextDouble();
        side2=scan.nextDouble();
        side3=scan.nextDouble();
        Triangle triangle=new Triangle(side1, side2, side3);

        System.out.println("Enter the color: ");

        String color;

        color=scan.next();

        System.out.println("Enter true/false for filled : ");

        boolean filled;

        filled=scan.nextBoolean();


        triangle.setColor(color);

        triangle.setFilled(filled);

        System.out.println("Area is "+triangle.getArea());

        System.out.println("Perimeter is "+triangle.getPerimeter());

        System.out.println("Color is " +triangle.getColor());

        System.out.println("Filled is "+(triangle.isFilled()));

    }
}

