//Volume Of Cylinder

package com.company.assignment3;

import java.util.Scanner;

public class Que16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter cylinder radius: ");
        int radius=sc.nextInt();
        radius=radius*radius; //making square of radius and initializing
        System.out.print("Enter cylinder height: ");
        int height= sc.nextInt();
        double PI=3.14;

        double volume=PI*radius*height;
        System.out.println("Volume of the cylinder is: "+volume);


    }
}
