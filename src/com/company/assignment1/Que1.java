//Input a year and find whether it is a leap year or not.

package com.company.assignment1;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
//        System.out.println(year54);
        if(year%400==0){
            System.out.println("Leap year: "+year);
        }
        else if(year%4==0 ){
            if (year%100!=0){
                System.out.println("Leap year: "+year);
            } else{
                System.out.println("Non leap year: "+year);
            }
        }else{
            System.out.println("NON leap");
        }
    }
}
