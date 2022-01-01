//Area Of Rectangle Program

package com.company.assignment3;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of rectangle: ");
        int base=sc.nextInt();

        System.out.print("Enter height of rectangle: ");
        int height = sc.nextInt();

        System.out.println("Area of rectangle is: "+base+height);

    }
}
