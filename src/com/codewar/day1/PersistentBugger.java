package com.codewar.day1;

public class PersistentBugger {

    public static int persistence(long n) {

        char str[] = (n+"").toCharArray();
        int time=0;
        while(str.length > 1)
        {
            int temp = 1;
            int[] key = new int[str.length];
            for(int i = 0; i < str.length; i++)
            {
                key[i] = Integer.parseInt(String.valueOf(str[i]));
                temp = key[i] * temp;
            }
            str = (temp+"").toCharArray();
            time++;
            if(temp < 10)
            {
                break;
            }

        }

        return time;
    }

    public static void main(String args[])
    {
        if(persistence(39) == 3)
        {
            System.out.println("case 1 ok");
        }
        if(persistence(4) == 0)
        {
            System.out.println("case 2 ok");
        }
        if(persistence(25) == 2)
        {
            System.out.println("case 3 ok");
        }
        if(persistence(999) == 4)
        {
            System.out.println("case 4 ok");
        }
    }

}
