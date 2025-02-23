package com.mindsprint.project1.basics;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Details");
        int num1=sc.nextInt();
        float num2=sc.nextFloat();
        double num3=sc.nextInt();
        boolean num4=sc.nextBoolean();
        String str=sc.next();
        System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+str);
    }
}
