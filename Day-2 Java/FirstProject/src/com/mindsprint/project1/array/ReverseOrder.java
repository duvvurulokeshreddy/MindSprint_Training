package com.mindsprint.project1.array;

import java.util.Arrays;

public class ReverseOrder {

    public static void main(String[] args) {
        int[] rev={10,20,30};
        System.out.println("It is Original Number");

        int n=rev.length;
        for(int i=0;i<n/2;i++){
            int temp=rev[i];
            rev[i] = rev[n -1 -i];
            rev[n - 1 -i]=temp;
        }
        System.out.println("It is reverse "+ Arrays.toString(rev));
    }
}
