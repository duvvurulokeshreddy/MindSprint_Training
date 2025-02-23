package com.mindsprint.project1.basics;

import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1=sc.nextInt();
        System.out.println("Enter The Second Number ");
        int num2=sc.nextInt();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiple: "+(num1*num2));
        System.out.println("Divided: "+(num1/num2));
    }
}
