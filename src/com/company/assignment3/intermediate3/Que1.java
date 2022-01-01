//Factorial Program In Java

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();
        System.out.print("Factorial is: ");
        int factorial=1;
        for (int i=1; i<=number; i++){
            factorial=factorial*i;
           // System.out.print(i);
            // applying to for not printing multiple sign in last
//            if (i<number){
//                System.out.print("*");
//            }
        }
        System.out.println("Factorial is :"+factorial);
    }
}
