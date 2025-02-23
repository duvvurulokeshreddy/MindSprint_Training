package com.mindsprint.project1.oops;

class ParentPhone{
    public void call(){
        System.out.println("Parent Phone is calling");
    }
}

class ChildPhone extends ParentPhone{
    @Override
    public void call() {
        super.call();
        System.out.println("Child Phone is Calling");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        ChildPhone ch=new ChildPhone();
        ch.call();
    }
}
