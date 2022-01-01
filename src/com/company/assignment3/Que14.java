//Volume Of Cone Java Program

package com.company.assignment3;

import java.util.Scanner;

public class Que14 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter radius of cone: ");
        int radius= sc.nextInt();

        System.out.print("Enter height of cone: ");
        int height= sc.nextInt();
        height=height/3;  //dividing height by 3 to fit in formula

        double PI=3.14; //constant
        double volume=PI*radius*radius*height;

        System.out.print("The volume of cine is: "+volume);

    }
}
