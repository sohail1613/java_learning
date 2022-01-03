//Perimeter Of Parallelogram

package com.company.assignment3;

import java.util.Scanner;

public class Que10 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        int base= sc.nextInt();

        System.out.print("Enter height: ");
        int height= sc.nextInt();

        int perimeter= 2*(base+height);  // formula =2(base+height)

        System.out.print("The perimeter of parallelogram is: "+perimeter);
    }
}
