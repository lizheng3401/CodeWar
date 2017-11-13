package com.codewar.day2;

public class TriangleTester {

    public static boolean isTriangle(int a, int b, int c){
        if( a+b > c & a+c > b & b+c > a )
        {
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        if(isTriangle(1,2,2) == true)
        {
            System.out.println("case 1 ok");
        }
        if(isTriangle(7,2,2) == false)
        {
            System.out.println("case 2 ok");
        }
    }

}
