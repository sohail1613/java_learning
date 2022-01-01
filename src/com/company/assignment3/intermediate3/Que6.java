//Calculate Commission Percentage

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //we are using straight commission method
        //income=sales*commission
        System.out.print("Enter sale :");
        int sales= sc.nextInt();
        System.out.print("Enter commission :");
        double commission= sc.nextInt();
        //converting commission
        commission=commission/100;
        double income=sales*commission;
        System.out.println("Final income is :"+income);
    }
}
