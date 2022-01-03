//Volume Of Prism

package com.company.assignment3;

import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base=sc.nextInt();
        System.out.print("Enter height: ");
        int height= sc.nextInt();
        System.out.print("Enter length: ");
        int length= sc.nextInt();

        double volume=0.5*base*height*length; //formula for triangular prism

        System.out.print("Volume of prism is: "+volume+" cm^3");
    }
}
