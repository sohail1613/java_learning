//Fibonacci Series In Java Programs

package com.company.assignment3;

import java.util.Scanner;

public class Que21 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int number1=0;
        int number2=1;
        int number3;
        System.out.print("Enter number to get fb series: ");
        int number= sc.nextInt();
        System.out.print("The fibonacci series of number "+number+" is: ");
        System.out.print(number1+" "+number2);

        for (int i=2; i<=number; i++){ //cause we used 0 and 1
            number3=number1+number2;  //adding previous values
            System.out.print(" "+number3);
            number1=number2;
            number2=number3;
        }
    }
}
