//Perimeter Of Square

package com.company.assignment3;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        int side= sc.nextInt();
        int perimeter=4*side;   // formula = 4*sides
        System.out.println("The perimeter of square is: "+perimeter);
    }
}
