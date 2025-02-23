package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter First The Number");
            double num1 = sc.nextDouble();
            System.out.println("Enter The Second Number");
            double num2 = sc.nextDouble();
            System.out.println("Enter The Below Options + for addition\n - for subtraction\n * multipulation\n / for division");

            String input = sc.next();
            switch (input) {
                case "+":
                    System.out.println("Addition " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("subtraction " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("multipulation " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("division " + (num1 / num2));
                    break;
                default:
                    System.out.println("Kindly Enter The Correct Data");
            }
            System.out.println("Enter y to continue press any key to exit");
            String op=sc.next();
            if(op.equals("Y") || op.equals("y")){
                continue;
            }
            else{
                break;
            }
        }
    }
}
