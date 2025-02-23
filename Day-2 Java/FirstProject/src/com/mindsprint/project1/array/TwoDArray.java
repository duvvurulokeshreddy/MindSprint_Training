package com.mindsprint.project1.array;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("Access Using for Each");
        }

        System.out.println("Access Using for Each");
        for(int[] arr:array){
            for(int num:arr){
                System.out.print(num+"\t");
            }
            System.out.println("Access");
        }

    }
}
