package com.sagar.datastructures;

public class StudentQueue {
    private Student studentQueue[];
    private int front;
    private int rear;
    private int total;
    private int size;

    public StudentQueue(){
        front = 0;
        rear = 0;
        total = 0;
        this.size = 50;
        studentQueue = new Student[this.size];
    }

    public StudentQueue(int size){
        front = 0;
        rear = 0;
        total = 0;
        this.size = size;
        studentQueue = new Student[this.size];
    }

    public boolean enqueue(Student item){
        if(!isFull()) {
            total++;
            studentQueue[rear] = item;
            rear = (rear+1) % size;
            return true;
        }else {
            return false;
        }
    }

    public Student dequeue (){
            Student item = studentQueue[front];
            total--;
            front = (front+1)%size;
            return item;
    }

    public boolean isFull(){
        if(size == total){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(total == 0){
            return true;
        }else {
            return false;
        }
    }

    public void showAll(){
        int f = front;
        if(total!=0){
            for (int i=0;i<=total;i++){
                System.out.println(" " +studentQueue[f]);
                f=(f+1)%size;

            }
        }
    }
}
