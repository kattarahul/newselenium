package com.programs;

public class MergeSort {


    public static void merge(int[] arr, int left, int mid, int right)
    {
        int mergeArr[] = new int [right - left +1];
        int indexOne = left;
        int indexTwo = mid+1;
        int mergeArrIndex = 0;

        while (indexOne <= mid && indexTwo <= right) {
            if (arr[indexOne] <= arr[indexTwo]) {
                mergeArr[mergeArrIndex] = arr[indexOne];
                mergeArrIndex++;
                indexOne++;
            } else {
                mergeArr[mergeArrIndex] = arr[indexTwo];
                mergeArrIndex++;
                indexTwo++;
            }
        }
            while (indexOne <= mid)
            {
                mergeArr[mergeArrIndex] = arr[indexOne];
                mergeArrIndex++;
                indexOne++;
            }
            while (indexTwo <= right)
            {
                mergeArr[mergeArrIndex] = arr[indexTwo];
                mergeArrIndex++;
                indexTwo++;
        }
            for (int i=0,j=left ; i < mergeArr.length ;i++,j++)
            {
                    arr[j]= mergeArr[i];
            }
    }


    public static void divide(int arr[], int left ,int right )
    {
        if(left >= right) {
            return;
        }
            int mid = left + (right - left) / 2;
            divide(arr, left, mid);
            divide(arr, mid + 1, right);
            merge(arr, left, mid, right);

    }
    public static void main(String[] args) {



        int arr[] = {6,4,5,3,2,1};
        int n = arr.length;
        System.out.println("Given Array");
        for (int i=0; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println( );

        divide(arr,0,n-1);

        System.out.println("Sorted Array");
        for (int i=0; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
    }
}
