package com.mindsprint.project1.oops;

class Parent{
    public String name="test";
    public Parent(){
        System.out.println("Parent Class Constructor");
    }
    public void hello(){
        System.out.println("Hello from parent");
    }
}
class Child extends Parent{
    public Child()
    {
        super();
        System.out.println("Child Constructor");
    }
    public void print()
    {
        System.out.println("Welcome "+name);
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        Child child = new Child();
        child.print();
        child.hello();
        System.out.println((child.name));
    }
}
