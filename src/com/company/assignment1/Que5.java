//Keep taking numbers as inputs till the user enters ‘0’, after that print sum of all.

package com.company.assignment1;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter number: ");
            int number=sc.nextInt();

            if (number==0)
                break;
            else if (number>0){
                sum=sum+number;
            }
        }
        System.out.println(sum);
    }
}
