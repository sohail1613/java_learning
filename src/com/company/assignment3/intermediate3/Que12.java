//Calculate Average Marks

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //asking marks from user for respective subjects
        System.out.print("Enter marks for Math :");
        int math= sc.nextInt();
        System.out.print("Enter marks for Physics :");
        int physics= sc.nextInt();
        System.out.print("Enter marks for Chemistry :");
        int chemistry= sc.nextInt();
        System.out.print("Enter marks for Biology :");
        int biology= sc.nextInt();
        System.out.print("Enter marks for Social Science :");
        int socialScience= sc.nextInt();

        //calculating average
        double average=(math+physics+chemistry+biology+socialScience)/5;
        System.out.println("Average is :"+average);
    }
}
