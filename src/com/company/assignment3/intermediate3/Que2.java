package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter electricity unit: ");
        int units= sc.nextInt();
        int charge=9;
        int totalcost=charge*units;
        System.out.println("Cost per unit is Rs.9");
        System.out.print("Total cost of electricity bill is Rs. "+totalcost);
    }
}
