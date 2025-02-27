package com.mindsprint.project.model;

public class Customer {

    private int rollNo;
    private String name;
    private String address;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String name, int rollNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
