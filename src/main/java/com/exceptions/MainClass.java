package com.exceptions;

public class MainClass {


    public static void main(String[] args) throws CustomizeException {

        int i;

        try{
            i= 9/0;

        }
        catch (RuntimeException runtimeException)
        {
            i =10/2;
            System.out.println(i);
        }
        catch (Exception e )
        {
            throw new CustomizeException(" don not do ");

        }

        System.out.println(" use correct logic  ");

    }



}
