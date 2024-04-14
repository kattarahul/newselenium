package com.programs;

import java.util.Scanner;

public class StringPalindrome {



    Scanner sc = new Scanner(System.in);
    public  String str ="";

        public String reverseWord() {
            System.out.println("Enter a String :");
            str = sc.nextLine();
            String str2 = "";
            char ch = 0;

            for (int i = str.length() - 1; i >= 0; i--) {

                str2 = str2 + str.charAt(i);

            }


            System.out.println(str2);


           return str2;

        }


    public static void main(String[] args) {

        StringPalindrome sp = new StringPalindrome();


        if (sp.str.equals(sp.reverseWord()))
        {
            System.out.println("It is a Palindrome");

        }
        else {
            System.out.println("It is not a Palindrome");

        }

    }

    }
