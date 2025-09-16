package com.Risav.day42;

public class PrintFirstAndLastRowOf2dArray{
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[0][j]+" ");
        }
        System.out.println();
        for(int j=0;j<matrix[matrix.length-1].length;j++){
            System.out.print(matrix[matrix.length-1][j]+" ");
        }
        System.out.println();
    }
}