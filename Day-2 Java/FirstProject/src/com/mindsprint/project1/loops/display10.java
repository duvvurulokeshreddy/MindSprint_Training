package com.mindsprint.project1.loops;

import java.util.Scanner;

public class display10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(n+" X "+i +" = "+(n*i));
        }

    }
}
