//Area Of Parallelogram

package com.company.assignment3;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        int area= base*height;

        System.out.print("Area of the parallelogram is: "+area);


    }
}
