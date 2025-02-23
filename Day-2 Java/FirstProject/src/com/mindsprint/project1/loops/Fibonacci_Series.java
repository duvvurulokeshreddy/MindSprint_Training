package com.mindsprint.project1.loops;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        int first = 0,second = 1;
        System.out.println("This is The Fibonacci");

        for(int i=2;i<n;i++){
            int next = first + second;
            first = second;
            second =next;
            System.out.println(" "+next);
        }
    }
}
