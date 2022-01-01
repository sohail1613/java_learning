//Subtract the Product and Sum of Digits of an Integer
package com.company.assignment3;

import java.util.Scanner;

public class Que22 {
    public static void main(String[] args) {
        //suppose we have 2 numbers for products and sum
        Scanner sc =new Scanner(System.in);

        //product
        System.out.print("Enter first number: ");
        int number1= sc.nextInt();
        System.out.print("Enter second number: ");
        int number2= sc.nextInt();
        //multiplication operation
        int product= number1*number2;
        System.out.println("Product of numbers is: "+product); //printing product value

        //sum
        System.out.print("Enter third number: ");
        int number3= sc.nextInt();
        System.out.print("Enter fourth number: ");
        int number4= sc.nextInt();
        int sum=number3+number4; // addition of both numbers
        System.out.println("Sum of both number is: "+sum);

        //Final result
        int result=product-sum;  // subtracting product and sum
        System.out.print("The final result is: "+result); // printing final value

    }

}
