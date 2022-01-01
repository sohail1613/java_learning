//Curved Surface Area Of Cylinder

package com.company.assignment3;

import java.util.Scanner;

public class Que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        int radius=sc.nextInt();
        System.out.print("Enter height of cylinder: ");
        int height= sc.nextInt();
        double PI=3.14;
        double surfaceArea=2*PI*radius*height; // formula=2*pi*r*h

        System.out.println("Surface area of cylinder is: "+surfaceArea);
    }
}
