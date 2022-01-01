//Addition Of Two Numbers

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int first= sc.nextInt();
        System.out.print("Enter second number :");
        int second= sc.nextInt();

        int addition=first+second;
        System.out.println("Sum of first and second number is :"+addition);
    }
}
