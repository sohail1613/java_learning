//Perimeter Of Rhombus

package com.company.assignment3;

import java.util.Scanner;

public class Que13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter side of rhombus: ");
        int side= sc.nextInt();

        int perimeter=4*side;
        System.out.println("The perimeter of rhombus is: "+perimeter);
    }
}
