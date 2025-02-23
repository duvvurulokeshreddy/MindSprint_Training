package com.mindsprint.project1.oops;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class StudentGradesManagementSystem {

    String name;
    int[] grades;

    StudentGradesManagementSystem(String name,int[] grades){
        this.name=name;
        this.grades=grades;
    }

    public int average(){
       int sum=0;
       for(int i=0;i< grades.length;i++){
           sum=sum+grades[i];
       }
       return (sum/(grades.length+1));
    }

    public void displayInfo(){
        System.out.println("Name Of The Student "+name);
        System.out.println("Grade Of The Student "+average());
    }



    public static void main(String[] args) {
        StudentGradesManagementSystem s1=new StudentGradesManagementSystem("Loki",new int[]{10,20,30});
        s1.displayInfo();


    }
}
