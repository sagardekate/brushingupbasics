package com.sagar.datastructures.tree;

public class BST {
    private Node root;

    public boolean insertStudent(Student student){
        Node newNode = new Node();
        newNode.lc = null;
        newNode.rc = null;
        newNode.student = student;
        if(root == null){
            root = newNode;
            return true;
        }
        Node p = root;
        Node c = root;
        while (c != null) {
            p = c;
            if (student.getName().compareTo(c.student.getName())<0){
                c=c.lc;
            }else {
                c=c.rc;
            }
        }
        if (student.getName().compareTo(p.student.getName())<0){
            p.lc = newNode;
        }else {
            p.rc=newNode;
        }
        return true;
    }

    public Node findNode(String key){
        Node c = root;
        while (c!=null){
            if(key.compareTo(c.student.getName())==0){
                break;
            }else {
                if (key.compareTo(c.student.getName())<0){
                    c=c.lc;
                }else {
                    c=c.rc;
                }
            }
        }
        return c;
    }

    public Node findParentNode(String key){
        Node p = root;
        Node c = root;
        while (c!=null){
            if(key.compareTo(c.student.getName())==0){
                break;
            }
            p=c;
            if(key.compareTo(c.student.getName())<0){
                c=c.lc;
            }else {
                c=c.rc;
            }
        }
        System.out.println(p.student.getName());
        if(c!=null){
            return p;
        }else{
            return null;
        }
    }

    public Student getData(Node node){
        return node.student;
    }

    public void showAll(Node node){
        Node p = node;
        if(p!=null){
            System.out.println(p.student);
            showAll(p.lc);
            showAll(p.rc);
        }
    }

    class Node{
        private Node lc;
        private Student student;
        private Node rc;
    }
}
