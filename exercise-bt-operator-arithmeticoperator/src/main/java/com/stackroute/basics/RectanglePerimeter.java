package com.stackroute.basics;


import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter length and breadth of the rectangle:");
        double l=scan.nextDouble();
        double b=scan.nextDouble();
        System.out.println(perimeterCalculator(l,b));


    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        double p=2*(length+breadth);
        return p;
    }
}
