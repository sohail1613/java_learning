//Perimeter Of Parallelogram

package com.company.assignment3;

import java.util.Scanner;

public class Que10 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        int base= sc.nextInt();

        System.out.print("Enter side: ");
        int side= sc.nextInt();

        int perimeter= 2*(base*side);  // formula =2(base*side)

        System.out.print("The perimeter of parallelogram is: "+perimeter);
    }
}
