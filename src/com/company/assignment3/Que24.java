//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package com.company.assignment3;

import java.util.Scanner;

public class Que24 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);

        while(true){
            System.out.print("Enter number: ");
            int number= sc.nextInt();
            if (number==0)
                break;
            else if (number>0){
                sum=sum+number;
            }
        }
        System.out.print("Total sum is: "+sum);
    }
}
