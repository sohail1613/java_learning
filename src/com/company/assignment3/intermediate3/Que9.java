//Calculate average batting score

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
//        Batting Average = Runs Scored ÷ Times Out
//
//    “Runs Scored” – The number of runs scored by the batter.
//    “Times Out” – The number of times the batter has been caught out.
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter total runs scored :");
        int runScored= sc.nextInt();
        System.out.print("Enter how number of out :");
        int out=sc.nextInt();

        float battingAverage=runScored/out;
        System.out.println("The batting average is ="+battingAverage);
    }
}
