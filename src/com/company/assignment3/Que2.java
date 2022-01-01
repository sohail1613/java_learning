//Area Of Triangle

package com.company.assignment3;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        area of triangle = 1/2 * base * height
        System.out.print("Enter base of triangle: ");
        int base = sc.nextInt();

        System.out.print("Enter height of triangle: ");
        int height = sc.nextInt();
        double area = 0.5*(base*height);

        System.out.print("Area if triangle is: "+area);


    }

}
