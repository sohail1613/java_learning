//Sum Of N Numbers

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que14 {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int sum=0; //initial value
        // asking number from user
        System.out.print("Enter number to get it's sum :");
        int number= sc.nextInt();

        //using for loop to iterate upto number and add it
        for (int i=1; i<=number;i++){
            sum=sum+i;
        }
        System.out.println("The total sum of "+number+" is :"+sum);
    }
}
