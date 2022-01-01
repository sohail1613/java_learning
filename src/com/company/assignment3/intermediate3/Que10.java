//Calculate CGPA Java Program

//1. First you need to calculate the total percentage, i.e.
//300/600*100 = 50%
//2. Then, to calculate CGPA from percentage, you need to divide your percentage by 9.5, i.e.
//50/9.5= 5.26 CGPA approx.

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks he/she scored :");
        int scoredMarks= sc.nextInt();
        System.out.print("Enter maximum marks :");
        int maximumMarks= sc.nextInt();

        //convert it to the percentage
        double percentage=(scoredMarks/maximumMarks)*100;

        System.out.println("Percentage is :"+percentage+"%");

        //step2- dividing percentage by 9.5 to get CGPA
        double cgpa=percentage/9.5;
        System.out.print("CGPA is :"+cgpa);
    }
}
