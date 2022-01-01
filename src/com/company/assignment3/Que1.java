//Area Of Circle Java Program

package com.company.assignment3;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius= sc.nextInt();

       // double area= 3.14*(radius*radius);  // area = 3.14*r^2
        double pi = 3.142, area;
        area=pi*radius*radius;

        System.out.println("Area of the circle is: "+area);
    }
}
