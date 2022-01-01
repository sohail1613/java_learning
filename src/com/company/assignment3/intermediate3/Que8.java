//Calculate Depreciation of Value

package com.company.assignment3.intermediate3;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //there are 3 methods but we will use Straight line method
        System.out.print("Enter value of depreciation factor :");
        double depreciationFactor= sc.nextDouble();
        System.out.print("Enter value for lifespan :");
        double lifespan= sc.nextDouble();
        lifespan=1/lifespan;
        int remiainigBookValue= sc.nextInt();

        double annualDepreciation=depreciationFactor*lifespan*remiainigBookValue;
        System.out.print("The Annual Depreciation is :"+annualDepreciation);
    }
}
