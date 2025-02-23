package com.mindsprint.project1.oops;

public class WaterBottle {
        int capacity;
        String color;
        String brand;

        public void setData(int capacity,String color,String brand){
            this.capacity=capacity;
            this.brand=brand;
            this.color=color;
    }

    public void display(){
        System.out.println("--------------------");
        System.out.println("Brand: "+brand);
        System.out.println("Color: "+color);
        System.out.println("Capacity: "+capacity);
    }

    public static void main(String[] args) {
        WaterBottle b1=new WaterBottle();
        b1.setData(1, "green","ignore");
        b1.display();
    }
}
