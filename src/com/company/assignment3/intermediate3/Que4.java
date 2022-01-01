//Calculate Discount Of Product
package com.company.assignment3.intermediate3;
import java.util.Scanner;
public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Discount = List price x Discount Rate
        double  actualcost;
        System.out.print("Enter list price :");
        int listprice=sc.nextInt();
        System.out.print("Enter discount rate in % :");
        int discountrate=sc.nextInt();

        double discount=(listprice*discountrate)/100;
        System.out.println("Total discount is ="+discount);

        actualcost=listprice-discount;
        System.out.println("Cost after discount is :"+actualcost);

    }
}
