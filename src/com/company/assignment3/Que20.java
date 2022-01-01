//Total Surface Area Of Cube

package com.company.assignment3;

import java.util.Scanner;

public class Que20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of cube: ");
        int side= sc.nextInt();

        //formula for TSA=6(side*side)
        int totalSurfaceArea=6*(side*side);
        System.out.println("Total surface area of cube is: "+totalSurfaceArea);
    }
}
