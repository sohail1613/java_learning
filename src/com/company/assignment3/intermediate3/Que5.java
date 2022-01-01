//Calculate Distance Between Two Points

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for points A=(x1,y1) and B=(x2,y2)

        //for point A
        System.out.print("Enter point x1 value :");
        int x1= sc.nextInt();
        System.out.print("Enter point y1 value :");
        int y1= sc.nextInt();

        //for point B
        System.out.print("Enter point x2 value :");
        int x2= sc.nextInt();
        System.out.print("Enter point y2 value :");
        int y2=sc.nextInt();

        double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between two points is :"+distance);
    }
}
