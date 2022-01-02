//Area of Rhombus

package com.company.assignment3;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first diagonal: ");
        int diagonal1= sc.nextInt();

        System.out.print("Enter second diagonal: ");
        int diagonal2= sc.nextInt();

        int area= (diagonal1*diagonal2)/2;
        System.out.print("Area of the Rhombus is: "+area);
    }
}
