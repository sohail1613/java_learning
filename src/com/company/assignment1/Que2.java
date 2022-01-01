//Take two numbers and print the sum of both.

package com.company.assignment1;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) { // entered into program from here
        Scanner sc = new Scanner(System.in); // importing scanner to ask from user

        int number1 = sc.nextInt(); //enter input 1
        int number2 = sc.nextInt();//enter 2 input

        int sum = number1+number2; //addition perform


        System.out.println("Total sum of both numbers is: "+sum);
    }
}
