//Calculate Average Of N Numbers

package com.company.assignment3.intermediate3;
import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();
        int sum=0;

        for (int i=1; i<=number; i++){
            sum=sum+i;
        }
        float average=sum/number;
        System.out.println("Average of number is ="+average);
    }
}
