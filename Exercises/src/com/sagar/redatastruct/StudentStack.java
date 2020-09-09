package com.sagar.redatastruct;

public class StudentStack {
    private Student studentStack[];
    private int top;
    private int rear;
    private int size;

    public StudentStack(){
        this.top = -1;
        this.size = 50;
        studentStack = new Student[this.size];
    }

    public StudentStack(int students){
        this.top = -1;
        this.size = students;
        studentStack = new Student[this.size];
    }

    public boolean push(Student student){
        if(!isFull()) {
            top++;
            studentStack[top] = student;
            return true;
        }else{
            return false;
        }
    }

    public Student pop(){
        return studentStack[top--];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==studentStack.length-1);
    }
}
