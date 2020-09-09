package com.sagar.redatastruct;

import javax.swing.*;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList(Student student){
        head = new Node();
        head.student = student;
        head.next = null;
        head.prev = null;
    }

    public boolean insertStudent(Student student){
        Node newNode = new Node();
        newNode.student = student;
        newNode.prev = head;
        newNode.next = null;
        if (head.next != null) {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }else{
            head.next = newNode;
        }
        return true;
    }

    public boolean deleteStudent(String name){
        if(name.equals(head.student.getName())){
            head = head.next;
            return true;
        }else {
            Node x = head;
            Node y = x.next;
            while (true){
                if(y==null || y.student.getName() == name){
                    break;
                }else{
                    x = y;
                    y = y.next;
                }
            }
            if(y!=null){
                x.next = y.next;
                return true;
            }else {
                return false;
            }
        }
    }

    public void bubbleSort(){
        Student c = null;
        Node a = head;
        while (a.next!=null){
            Node b = head;
            while (b.next!=null){
                if(b.student.getRollNo() > b.next.student.getRollNo()){
                    c = b.student;
                    b.student = b.next.student;
                    b.next.student = c;
                }
                b=b.next;
            }
            a=a.next;
        }
    }



    public void printAllStudents(){
        Node z = head;
        while (z!=null){
            System.out.println(z.student.toString());
            z = z.next;
        }
    }

    class Node {
        private Node next;
        private Student student;
        private Node prev;
    }
}
