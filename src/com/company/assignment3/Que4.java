//Area Of Isosceles Triangle

package com.company.assignment3;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height=sc.nextInt();

        int area= (base*height)/2;
        System.out.print("Area of isosceles traingle is: "+area);
    }
}
