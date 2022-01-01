//Take integer inputs till the user enters 0 and print the largest number from all.

package com.company.assignment3;

import java.util.Scanner;

public class Que25 {
    public static void main (String[] args){
        int number;
        while(true){
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter number:");
            number= sc.nextInt();
            //if 0 then, terminate
            if (number==0)
                break;
            else if (number>0){

            }
        }
        System.out.print("The greatest number is: "+number);
    }
}
