//Perimeter Of Rectangle

package com.company.assignment3;

import java.util.Scanner;

public class Que11 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in); //importing scanner class and creating constructer.
        //formula = 2(length+width)
        System.out.print("Enter length: ");
        int length= sc.nextInt();
        System.out.print("Enter width: ");
        int width= sc.nextInt();

        int perimeter=2*(length+width);
        System.out.print("The perimeter of the rectangle is: "+perimeter);

    }
}
