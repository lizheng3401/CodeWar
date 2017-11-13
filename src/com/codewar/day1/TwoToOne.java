package com.codewar.day1;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        char[] str = (s1+s2).toCharArray();
        int[] key = new int[26];
        char[] aim = new char[26];
        for(int i = 0; i < str.length; i++)
        {
            key[(int)str[i] - 97] = 1;
        }
        int i = 0;
        for(int j = 0; j < 26; j++)
        {
            if(key[j] == 1)
            {
                aim[i] = (char)(j+97);
                i++;
            }
        }
        char[] re = new char[i];
        System.arraycopy(aim, 0, re, 0,i);
        return new String(re);
    }

    public static void main(String args[])
    {
        if(longest("aretheyhere", "yestheyarehere").equals("aehrsty") )
        {
            System.out.println("case 1 ok");
        }
        if(longest("loopingisfunbutdangerous", "lessdangerousthancoding").equals("abcdefghilnoprstu"))
        {
            System.out.println("case 2 ok");
        }
        if(longest("inmanylanguages", "theresapairoffunctions").equals("acefghilmnoprstuy"))
        {
            System.out.println("case 3 ok");
        }
    }
}
