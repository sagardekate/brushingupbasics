package com.sagar.redatastruct;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(Student student){
        head = new Node();
        head.student = student;
        head.link = null;
    }

    public boolean insertStudent(Student student){
        Node newNode = new Node();
        newNode.student = student;
        newNode.link = null;
        Node n = head;
        while (n.link!=null){
            n=n.link;
        }
        n.link = newNode;
        return true;
    }

    public void bubbleSort(){
        Student c = null;
        Node a = head;
        while (a.link!=null){
            Node b = head;
                while (b.link!=null)   {
                    if(b.student.getRollNo() > b.link.student.getRollNo()){
                        c = b.student;
                        b.student = b.link.student;
                        b.link.student = c;
                    }
                    b = b.link;
                }
            a = a.link;
        }
    }

    public boolean deleteStudent(String name){
        if(head.student.getName() == name){
            head = head.link;
            return true;
        }else {
            Node x = head;
            Node y = x.link;
            while (true){
                if(y==null || y.student.getName() == name){
                    break;
                }else {
                    x=y;
                    y=y.link;
                }
            }
            if(y!=null) {
                x.link = y.link;
                return true;
            }else {
                return false;
            }

        }
    }

    public void printStudentList(){
        Node z = head;
        while (z!=null) {
            System.out.println(z.student);
            z = z.link;
        }
    }


    class Node{
        private Student student;
        private Node link;
    }
}
