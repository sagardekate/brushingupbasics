package com.sagar.redatastruct;

public class StudentQueue {
    private Student studentQueue[];
    private int front;
    private int rear;
    private int size;
    private int total;

    public  StudentQueue(){
        this.front = 0;
        this.rear = 0;
        this.total = 0;
        this.size = 50;
        studentQueue = new Student[this.size];
    }

    public  StudentQueue(int students){
        this.front = 0;
        this.rear = 0;
        this.total = 0;
        this.size = students;
        studentQueue = new Student[this.size];
    }

    public boolean enqueue(Student student){
        if(!isFull()) {
            total++;
            studentQueue[rear] = student;
            rear = (rear + 1) % size;
            return true;
        }else {
            return false;
        }
    }

    public Student dequeue(){
            Student student = studentQueue[front];
            total--;
            front = (front + 1) % size;
            return student;
    }

    public boolean isFull(){
        if(size==total){
            return true;
        }else {
            return false;
        }
    }

    public void printStudentQueue(){
        int f = front;
        if(total!=0) {
            for (int i = 0; i <total; i++) {
                System.out.println(" "+studentQueue[f]);
                f = (f + 1) % size;
            }
        }
    }
}
