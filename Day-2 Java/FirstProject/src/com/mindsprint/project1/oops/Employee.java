package com.mindsprint.project1.oops;

public class Employee {

    private int id;
    private String name;
    private double sal;

    public Employee(double sal, String name, int id) {
        this.sal = sal;
        this.name = name;
        this.id = id;
    }

    public void setSal(double sal){
        this.sal=sal;
    }
    public double getSal(){
        return sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public static void main(String[] args) {
        Employee e=new Employee(10.3,"Chandhu",10);
        e.setId(10);
        e.setName("Loki");
        e.setSal(45.5);
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
        System.out.println(e);
    }
}
