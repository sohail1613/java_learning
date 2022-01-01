//Check Leap Year Or Not

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :");
        int year= sc.nextInt();
        if (year%4==0){
           if (year%100!=0){
               System.out.println(year+" it's leap year");
           } else if (year%100==0){
               System.out.println(year+" it's leap year");
           }
        } else{
            System.out.println(year+" it's not leap year");
        }
    }
}
