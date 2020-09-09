package com.sagar.queuepractice;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Sagar","12");
        Student student2 = new Student("Matt","39");
        Student student3 = new Student("Laila","10");
        StudentQueue studentQueue = new StudentQueue();
        studentQueue.enqueue(student1);
        studentQueue.enqueue(student2);
        studentQueue.enqueue(student3);
        studentQueue.showAll();
        System.out.println(studentQueue.dequeue().toString());
        System.out.println(studentQueue.dequeue().toString());
        System.out.println(studentQueue.dequeue().toString());

    }
}
