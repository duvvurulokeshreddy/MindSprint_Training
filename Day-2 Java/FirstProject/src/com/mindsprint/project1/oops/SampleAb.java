package com.mindsprint.project1.oops;

abstract class Test{
    public abstract void display();
}

public class SampleAb extends Test{
    public void display(){
        System.out.println("Implemented Parent Method");
    }

    public static void main(String[] args) {
        Test t=new SampleAb();
        t.display();

    }
}
