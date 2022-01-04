//Volume Of Pyramid

package com.company.assignment3;

import java.util.Scanner;

public class Que18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length=sc.nextInt();
        System.out.print("Enter width: ");
        int width= sc.nextInt();
        System.out.print("Enter height: ");
        int height= sc.nextInt();

        int volume=(length*width*height)/3; //right rectangular pyramid
        System.out.println("Volume of Pyramid is: "+volume);
    }
}
