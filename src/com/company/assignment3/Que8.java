    //Perimeter Of Circle

package com.company.assignment3;

import java.util.Scanner;
import java.lang.Math;

public class Que8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int radius=sc.nextInt();
       // double PI=3.14;
        double perimeter=2*Math.PI*radius;  // perimeter formula=2*PI*radius

        System.out.print("The perimeter of circle is: "+perimeter);
    }
}
