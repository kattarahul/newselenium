package com.programs;

import java.util.Scanner;

public class FibonacciSeriesFirstN {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n ;
        int m ;

        int n3 ;

        System.out.println(" Enter the Number of Fibonacci Series :");
        int count = sc.nextInt();


        int n1 = 0;
        int n2 = 1;

        System.out.println(" The Fibonacci Series is :");

        for (int i=2; i<=count;i++) {
            n3 = n1 + n2;

            System.out.print( " " +n3);

            n1 = n2;
            n2 = n3;
        }




    }


}
