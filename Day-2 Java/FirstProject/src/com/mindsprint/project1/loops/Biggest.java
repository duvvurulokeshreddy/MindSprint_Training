package com.mindsprint.project1.loops;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number");
        int n=sc.nextInt();
        System.out.println("Enter The Second number");
        int n1=sc.nextInt();
        if(n>n1){
            System.out.println("It is biggest");
        }
        else{
            System.out.println("It is smallest");
        }
    }
}
