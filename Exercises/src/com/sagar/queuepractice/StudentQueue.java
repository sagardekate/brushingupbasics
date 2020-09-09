package com.sagar.queuepractice;

public class StudentQueue {
    private Student studentqueue[];
    private int front;
    private int rear;
    private int total;
    private int size;

    public StudentQueue(){
        front = 0;
        rear = 0;
        total = 0;
        this.size = 50;
        studentqueue = new Student[this.size];
    }
    public StudentQueue(int size){
        front = 0;
        rear = 0;
        total = 0;
        this.size = size;
        studentqueue = new Student[this.size];
    }

    public boolean enqueue(Student item){
        if(!isFull()) {
            total++;
            studentqueue[rear] = item;
            rear = (rear + 1) % size;
            return true;
        }else {
            return false;
        }
    }

    public Student dequeue(){
        if(total!=0) {
            total--;
            Student item = studentqueue[front];
            front = (front+1)%size;
            return item;
        }else {
            return null;
        }
    }

    public boolean isFull(){
        if(size == total){
            return true;
        }else {
            return false;
        }
    }

    public void showAll(){
        int f = front;
        if(total!=0){
            for (int i=0;i<total;i++){
                System.out.println(studentqueue[f].toString());
                f=(f+1)%size;
            }
        }
    }
}
