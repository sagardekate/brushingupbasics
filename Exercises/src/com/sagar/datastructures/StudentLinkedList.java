package com.sagar.datastructures;

import java.util.LinkedList;
import java.util.List;

public class StudentLinkedList {
    private Node head;

    public StudentLinkedList(Student student){
        head = new Node();
        head.student = student;
        head.link = null;
    }

    public boolean insertStudent(Student student){
        Node m = new Node();
        m.student = student;
        m.link = null;
        Node newStudent = head;
        while (newStudent.link!=null){
            newStudent = newStudent.link;
        }
        newStudent.link = m;
        return true;
    }


    public boolean deleteStudent(String name){
        if(name.equals(head.student.getName())){
            head = head.link;
            return true;
        }else {
            Node x = head;
            Node y = x.link;
            while (true){
                if(y==null || y.student.getName()==name){
                    break;
                }else {
                    x = y;
                    y = y.link;
                }
            }
            if(y!=null){
                x.link = y.link;
                return true;
            }else {
                return false;
            }
        }
    }

    public void bubbleSort(){
        int c=0;
        Node a = head.link;
        while (a.link!=null){
            Node b = head.link;
                while (b.link!=null){
                    if(b.student.getRollNo()>b.link.student.getRollNo()){
                        c = b.student.getRollNo();
                        b.student.setRollNo(b.link.student.getRollNo());
                        b.link.student.setRollNo(c);
                    }
                    b = b.link;
                }
            a=a.link;
        }

    }

    public void printStudentList(){
        Node z = head.link;
        while (z!=null){
            System.out.println(z.student.toString());
            z = z.link;
        }
    }

    class Node{
        private Student student;
        private Node link;
    }
}
