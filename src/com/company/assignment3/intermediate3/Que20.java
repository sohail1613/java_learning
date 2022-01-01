//HCF Of Two Numbers Program

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numbers for HCF :");
        int number1= sc.nextInt();
        System.out.print("Enter second numbers for HCF :");
        int number2= sc.nextInt();

        int a=number1;
        int b=number2;

            while (b != 0) {
                int t = a;
                b = a % b;
                a = t;
            }
            int hcf = a;
            int lcm = (number1 * number2) / hcf;
            System.out.println("The HCF of " + number1 + " and " + number2 + " is :" + hcf);
            System.out.println("LCM is :" + lcm);
    }
}
