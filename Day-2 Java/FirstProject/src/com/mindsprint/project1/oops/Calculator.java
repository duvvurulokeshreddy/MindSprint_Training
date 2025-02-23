package com.mindsprint.project1.oops;

public class Calculator {

    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
    public int mul(int num1,int num2){
        return num1*num2;
    }
    public int div(int num1,int num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.sub(10,20));
        System.out.println(c.mul(10,20));
        System.out.println(c.div(10,20));

    }

}
