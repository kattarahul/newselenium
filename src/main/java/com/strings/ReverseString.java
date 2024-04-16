package com.strings;

public class ReverseString {


    public static void main(String[] args)
    {
        String str = "Testing";

        String str2 ="";


        char ch = 0;

        for(int i = str.length()-1;i>=0; i--)
        {
            str2 = str2 + str.charAt(i);

        }

        System.out.println(str2);

    }


}
