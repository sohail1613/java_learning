//Volume Of Sphere

package com.company.assignment3;
import java.util.Scanner;

public class Que17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //declaring and initializing radius
        System.out.print("Enter radius: "); // telling user to enter radius value
        int radius= sc.nextInt(); ///asking value from user
            radius=radius*radius*radius; // making cube root of radius and re-assign to radius
        double PI=3.14; //pi value is constant

        double volume=1.33*(PI*radius); //according to formula
        System.out.print("Volume of Sphere is: "+volume);



    }
}
