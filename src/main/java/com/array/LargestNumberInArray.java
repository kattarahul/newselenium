package com.array;

public class LargestNumberInArray {



    int arr[] = {1,20,56,235,7894,653,45, 9};


    public int maxNumber()
    {
        int max = arr[0];

        for (int i=0; i<arr.length-1; i++)
        {
            if(arr[i]>max)
            {
                max =arr[i];
            }

        }

        return max;
    }

    public static void main(String[] args)
    {
        LargestNumberInArray largestNumberInArray = new LargestNumberInArray();
        System.out.println(" Largest NO. is :" + largestNumberInArray.maxNumber());

    }



}
