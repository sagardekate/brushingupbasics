package com.sagar.datastructures;

public class StudentStack {
    private Student studentStack[];
    private int top;
    private int size;

    public StudentStack(){
        top=-1;
        this.size = 50;
        studentStack = new Student[this.size];
    }
    public StudentStack(int size){
        top=-1;
        this.size = size;
        studentStack = new Student[this.size];
    }

    public boolean push(Student item){
        if (!isFull()) {
            top++;
            studentStack[top] = item;
            return true;
        }else{
            return false;
        }
    }

    public Student pop(){
            return studentStack[top--];
    }

    public boolean isFull(){
        return (top == studentStack.length-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

}