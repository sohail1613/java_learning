//Input a number and print all the factors of that number (use loops).

package com.company.assignment3;

import java.util.Scanner;

public class Que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for fibonacci series: ");
        int number= sc.nextInt();

        for (int i=1; i<number; i++){
            if (number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
