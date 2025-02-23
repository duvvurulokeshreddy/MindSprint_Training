package com.mindsprint.project1.oops;

public class MethodOverload {

    public int add(int num1,int num2){
        return num1+num2;
    }

    public float sub(float num1,float num2){
        return num1-num2;
    }

    public static void main(String[] args) {
        MethodOverload m=new MethodOverload();
        System.out.println(m.add(30,60));
        System.out.println(m.sub(20,10));
    }
}
