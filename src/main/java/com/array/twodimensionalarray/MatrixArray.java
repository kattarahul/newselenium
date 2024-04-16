package com.array.twodimensionalarray;

public class MatrixArray {


    public static void main(String args[]){

        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};

        int c[][]=new int[3][3];

        System.out.println("Adding to Matrices");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("********************************");
        int d[][] = new  int[3][3];

        System.out.println("Multiplying to Matrices");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                d[i][j]=a[i][j]*b[i][j];
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }



    }



}
