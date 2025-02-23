package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int percent=sc.nextInt();
        if(percent>=70 && percent<=100){
            System.out.println("Congratulation..!! You got Distinction");
        } else if (percent>=60 && percent<=70) {
            System.out.println("Congratulation..!! You got First Class");
        }
        else if (percent>=50 && percent<=60) {
            System.out.println("Congratulation..!! You got Second Class");
        }
        else if (percent>=35 && percent<=50) {
            System.out.println("Congratulation..!! You got Third Class");
        }
        else{
            System.out.println("Kindly enter correct percentage");
        }

    }
}
