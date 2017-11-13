package com.codewar.day2;

class MorseCode{
    public static String get(String temp)
    {
        return "";
    }
}
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String s = morseCode.replaceAll("   ", "#").replaceAll(" ", "|");
        char[] key = s.toCharArray();
        String result = "";
        String temp = "";
        String str = "";
        for(int i = 0; i < key.length; i++)
        {
            if(key[i] == '|')
            {
                str += MorseCode.get(temp);
                temp = "";
            }
            else if(key[i] == '#')
            {
                str += MorseCode.get(temp);
                result += str + " ";
                str = "";
                temp = "";
            }
            else{
                temp += key[i];
            }

        }
        str += MorseCode.get(temp);
        result += str;
        return result;
    }

    public static void main(String args[])
    {
        if(decode(".... . -.--   .--- ..- -.. .") == "HEY JUDE")
        {
            System.out.println("case ok");
        }
    }

}
