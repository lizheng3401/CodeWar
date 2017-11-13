package com.codewar.day2;

public class Vowels {

    public static int getCount(String str) {
        int j = 0;
        char[] key = str.toCharArray();
        for(int i = 0; i < key.length; i++)
        {
            if(key[i] == 'a' | key[i] =='e'| key[i] == 'i' | key[i] == 'o' | key[i] == 'u')
            {
                j++;
            }
        }
        return j;
    }

    public static void main(String args[])
    {
        if(getCount("abracadabra") == 5)
        {
            System.out.println("case ok");
        }
    }
}
