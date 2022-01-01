//Area Of Equilateral Triangle

package com.company.assignment3;

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side value: ");
        int side= sc.nextInt();

        double area=(1.73*side*side); // formula=((3^1/2)*side^2) / 4

        System.out.print("Area of Equilateral triangle is: "+area);
    }
}
