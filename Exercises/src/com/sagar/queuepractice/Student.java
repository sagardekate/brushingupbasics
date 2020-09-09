package com.sagar.queuepractice;

public class Student {
    private String name;
    private String rollno;

    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String toString(){
        return "Name: "+this.name+" RollNo.: "+this.rollno;
    }
}
