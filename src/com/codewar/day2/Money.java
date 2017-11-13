package com.codewar.day2;

public class Money {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;

        while( principal < desired)
        {
            years++;
            principal = principal * ( 1 + interest ) - principal*interest*tax;
        }
        return years;
    }

    public static void main(String args[])
    {
        if(calculateYears(1000,0.05,0.18,1100) == 3)
        {
            System.out.println("case 1 ok");
        }
        if(calculateYears(1000,0.01625,0.18,1200) == 14)
        {
            System.out.println("case 2 ok");
        }
        if(calculateYears(1000,0.05,0.18,1000) == 0)
        {
            System.out.println("case 3 ok");
        }

    }

}
