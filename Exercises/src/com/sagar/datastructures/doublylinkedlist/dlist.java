package com.sagar.datastructures.doublylinkedlist;

public class dlist {
    private Node head;

    public dlist(int item){
        head = new Node();
        head.prev = null;
        head.next = null;
        head.value = item;
    }

    public boolean insertItem(int item){
        Node newNode = new Node();
        newNode.value = item;
        newNode.prev = null;
        head.prev=null;
        newNode.next = head;
        head = newNode;
        return false;
    }

    public boolean deleteItem(int item){
        if(head.value == item){
            head= head.next;
            return true;
        }else {
            Node x = head;
            Node y = x.next;
            while (true){
                if(y==null || y.value==item){
                    break;
                }else {
                    x = y;
                    y = y.next;
                }
            }
            if(y!=null) {
                x.next = y.next;
                return true;
            }else {
                return false;
            }
        }
    }

    public void printItems(){
        Node z = head;
        while (z!=null){
            System.out.println(z.value);
            z=z.next;
        }
    }

    class Node{
        private Node prev;
        private int value;
        private Node next;
    }
}
