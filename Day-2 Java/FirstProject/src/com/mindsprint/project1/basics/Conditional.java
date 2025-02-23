package com.mindsprint.project1.basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1=sc.nextInt();
        System.out.println("Enter The Second Number ");
        int num2=sc.nextInt();
        System.out.println("num1>num2 : "+(num1>num2));
        System.out.println("num1<num2 : "+(num1<num2));
        System.out.println("num1>=num2 : "+(num1>=num2));
        System.out.println("num1<=num2 : "+(num1<=num2));
        System.out.println("num1!=num2 : "+(num1!=num2));
        System.out.println("num1==num2 : "+(num1==num2));

    }

}
