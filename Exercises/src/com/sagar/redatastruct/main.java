package com.sagar.redatastruct;

import java.util.Arrays;


public class main {
    public static void main(String[] args) {


        //Testing Doubly Linked List
        Student student1 = new Student("Sagar", 6);
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(student1);
        Student student2 = new Student("Vera", 20);
        Student student3 = new Student("Vondo", 39);
        Student student4 = new Student("Xena", 1);
        doublyLinkedList.insertStudent(student2);
        doublyLinkedList.insertStudent(student3);
        doublyLinkedList.insertStudent(student4);
        doublyLinkedList.printAllStudents();
        doublyLinkedList.bubbleSort();
        doublyLinkedList.printAllStudents();
        /*//Testing Singly Linked List
        Student student1 = new Student("Sagar", 6);
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(student1);
        Student student2 = new Student("Vera", 20);
        Student student3 = new Student("Vondo", 39);
        Student student4 = new Student("Xena", 1);
        singlyLinkedList.insertStudent(student2);
        singlyLinkedList.insertStudent(student3);
        singlyLinkedList.insertStudent(student4);
        singlyLinkedList.printStudentList();
        singlyLinkedList.bubbleSort();
        singlyLinkedList.printStudentList();*/

        //Testing Student Queue
        /*StudentQueue studentQueue = new StudentQueue(4);
        Student student1 = new Student("Sagar", 5);
        Student student2 = new Student("Vera", 20);
        Student student3 = new Student("Vondo", 39);
        Student student4 = new Student("Xena", 1);
        studentQueue.enqueue(student1);
        studentQueue.enqueue(student2);
        studentQueue.enqueue(student3);
        studentQueue.enqueue(student4);
        studentQueue.printStudentQueue();
        studentQueue.dequeue();
        studentQueue.dequeue();
        studentQueue.printStudentQueue();*/

        /*//Testing studentStack
        StudentStack studentStack = new StudentStack(5);
        Student student1 = new Student("Sagar", 5);
        Student student2 = new Student("Vera", 20);
        Student student3 = new Student("Vondo", 39);
        Student student4 = new Student("Xena", 1);
        Student student5 = new Student("Brad", 6);

        studentStack.push(student1);
        studentStack.push(student2);
        studentStack.push(student3);
        studentStack.push(student4);
        studentStack.push(student5);

        System.out.println(studentStack.pop().toString());
        System.out.println(studentStack.pop().toString());*/

    }
}
