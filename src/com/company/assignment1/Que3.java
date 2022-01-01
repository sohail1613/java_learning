//Take a number as input and print the multiplication table for it.

package com.company.assignment1;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("The table of "+number+" is: ");

        for (int i=1; i<=10; i++){
            int answer=number*i;
            System.out.print(answer+" ");
        }
    }
}
