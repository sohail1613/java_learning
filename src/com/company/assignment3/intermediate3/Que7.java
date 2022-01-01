//Power In Java

package com.company.assignment3.intermediate3;

import java.util.Scanner;
import java.lang.Math; // for raised to power
public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value :");
        int base= sc.nextInt(); // its base value
        System.out.print("Enter exponent value :");
        int exponent=sc.nextInt(); // it's exponent value

        System.out.print("The power value is: ");
        System.out.println(Math.pow(base, exponent)); //to print power of base number (5^2=25)
        // or we can do in other way and getting same answer
        //power=Math.pow(base, exponent);
        //System.out.println(power);
    }
}
