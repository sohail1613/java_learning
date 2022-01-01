//Que23- Perfect Number In Java
//incomplete coding
package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();
        int sum=0;

       for (int i=1; i<number; i++){
           if (number%i==0)
               sum=sum+i;
           {
               System.out.print(sum+" ");
           } if (number%sum==0){
            //System.out.println("perfect number: "+number);
           } else {
               System.out.println("not perfect :"+number);
           }
       }
    }
}
