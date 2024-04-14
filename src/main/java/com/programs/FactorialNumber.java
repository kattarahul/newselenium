package com.programs;

public class FactorialNumber {


    public int factorialMethod(int num)
    {
        int fact = 1;
        int i;
        for (i = 2;i<=num;i++ )
        {
            fact *= i;
        }
        return fact;
    }


    public static void main(String[] args) {

        FactorialNumber fn = new FactorialNumber();
        int n = 3;
        System.out.println("Factorial Number of  : "  + fn.factorialMethod(4) );
    }

}
