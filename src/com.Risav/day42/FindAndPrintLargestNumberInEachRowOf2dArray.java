package com.Risav.day42;

public class FindAndPrintLargestNumberInEachRowOf2dArray {
    public static void main(String[] args) {
        int[][] array = {{1,8,3,4},{5,2,9,6},{7,10,11,12},{69,96,14,16}};

        for (int i=0;i<array.length;i++) {
            int Max=array[i][0];
            for (int j=1;j<array[i].length;j++) {
                if (array[i][j]>Max) {
                    Max=array[i][j];
                }
            }
            System.out.println("row " + (i + 1) + " Largest " + ": " + Max);
        }
    }
}