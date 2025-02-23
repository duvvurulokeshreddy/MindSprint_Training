package com.mindsprint.project1.loops;

public class ForLoop {
    public static void main(String[] args) {
        int g=0;
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nUsing While Loop");

        while(g<=10){
            System.out.print(g+" ");
            g++;
        }
        System.out.println("\nUsing The do while loop");
        do{
            System.out.print(g+" ");
            g++;
        }
        while(g<=10);
    }
}
