//Find Ncr & Npr

//nCr = n!/[r! (n-r)!]
//nPr = n!/(n-r)!
package com.company.assignment3.intermediate3;
import java.util.Scanner;
public class Que16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); // asking number from user
        int r= sc.nextInt(); // asking used number from user
        int combination, permutation;
        //to find factorial of n
        for (int i=1; i<=n; i++){
             n=i*n;  //n!
        }

        //for used number =r factorial
        for (int i=1; i<=r; i++){
             r=i*r;   //r!
        }

        //for (n-r)!
        int j=n-r;
        for (int i=1; i<=j; j++){
            j=i*j;       //(n-r)!
        }

        //for combination nCr
        combination=n/r*(j);
        System.out.println("Combination is :"+combination);

        //for permutation nPr
        permutation=n/j;
        System.out.println("Permutation is :"+permutation);
    }
}
