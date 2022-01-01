//Take 2 numbers as inputs and find their HCF and LCM.

package com.company.assignment1;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        int number1= sc.nextInt();
        int number2= sc.nextInt();

        int a=number1;
        int b=number2;

        while (b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        int gcd=a;
        int lcm=(number1*number2)/gcd;

        System.out.println("The HCF of "+number1+" and "+number2+" is: "+gcd);
        System.out.println("The LCM of "+number1+" and "+number2+" is: "+lcm);
    }
}
