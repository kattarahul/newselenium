package com.strings;

public class DuplicateElements {


    public static void main(String[] args) {

        int [] arr = new int [] {4, 6, 6, 5, 8, 7, 1, 8, 2};
        System.out.println("Duplicate elements in given array: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

}
