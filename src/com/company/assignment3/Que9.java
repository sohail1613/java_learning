//Perimeter Of Equilateral Triangle

package com.company.assignment3;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sides of triangle: ");
        int side=sc.nextInt();
        int perimeter=3*side;  //perimeter= 3*sides

        System.out.println("The perimeter of the triangle is: "+perimeter);
    }
}
