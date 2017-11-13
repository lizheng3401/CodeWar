package com.codewar.day1;

public class GrowthOfAPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {

        int sum;
        percent = percent*0.01;
        for(int i = 1; ; i++ )
        {
            sum = (int)(p0 + p0 * percent + aug);
            if( sum >= p)
            {
                return i;
            }
            p0 = sum;
        }
    }

    public static void main(String args[])
    {
        if (nbYear(1500, 5, 100, 5000) == 15 )
        {
            System.out.println("case 1 : ok");
        }
        if (nbYear(1500000, 2.5, 10000, 2000000) == 10 )
        {
            System.out.println("case 2 : ok");
        }
        if (nbYear(1500000, 0.25, 1000, 2000000) == 94 )
        {
            System.out.println("case 3 : ok");
        }

    }
}
