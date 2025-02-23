package com.mindsprint.project1.oops;

public class Student {
    int id;
    String name;
    String email;
    String address;

    public Student(String address, String email, String name) {
//      this((int)Math.round(Math.random()*10000),name,email,address);
      this.id=(int)Math.round(Math.random()*10000);
      this.name=name;
      this.email=email;
      this.address=address;
    }

    public Student(int id, String address, String email, String name) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    Student(){

    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s=new Student("Naidupeta","loki@gmail.com","loki");
        Student s2=new Student(1000,"Tirupati","Raju@gmail.com","Raju");
        System.out.println(s1);
        System.out.println(s.address+" "+s.name+" "+s.email);
        System.out.println(s2.address+" "+s2.name+" "+s2.email+" "+s2.id);
    }
}
