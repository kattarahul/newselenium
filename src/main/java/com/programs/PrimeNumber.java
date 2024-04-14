package com.programs;

import java.util.Scanner;

public class PrimeNumber {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

       boolean flag = false;


        for (int i = 2 ; i<n/2;i++)
        if (n%i==0)
        {
            flag = true;
            break;
        }

        if (flag == false )
        {
            System.out.println(n +" is a Prime Number");
        }
        else
        {
            System.out.println(n+ " not a Prime Number");
        }

    }
}
