package com.sagar.datastructures;

public class IntStack {
    private int intStack[];
    private int top;
    private int size;

    public IntStack(){
        top=-1;
        this.size = 50;
        intStack = new int[this.size];
    }
    public IntStack(int size){
        top=-1;
        this.size = size;
        intStack = new int[this.size];
    }

    public boolean push(int item){
        if (!isFull()) {
            top++;
            intStack[top] = item;
            return true;
        }else{
            return false;
        }
    }

    public int pop(){
        if(!isEmpty()) {
            return intStack[top--];
        }else {
            return 1111;
        }
    }

    public boolean isFull(){
        return (top == intStack.length-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

}
