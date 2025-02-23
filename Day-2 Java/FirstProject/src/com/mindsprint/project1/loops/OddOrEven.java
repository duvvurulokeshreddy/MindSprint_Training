package com.mindsprint.project1.loops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("It is Odd Number");
        }
    }
}
