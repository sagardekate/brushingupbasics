package com.sagar.datastructures;

public class IntLinkedList {
    private Node head;

    public IntLinkedList(){
        head = new Node();
        head.value = 0 ;
        head.link = null;
    }

    public boolean insertValueTail(int item){
        Node n = new Node();
        n.value = item;
        n.link = head.link;
        head.link = n;
        return true;
    }

    public boolean insertValueFront(int item){
        Node j = new Node();
        j.value = item;
        j.link = null;
        Node k = head;
        while (k.link!=null){
                k=k.link;
        }
        k.link = j;

        return true;

    }

    public boolean deleteItem(int item){
        if(head.link.value == item){
            head= head.link;
            return true;
        }else {
            Node x = head;
            Node y = x.link;
            while (true){
                if(y==null || y.value==item){
                    break;
                }else {
                    x = y;
                    y = y.link;
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

    public void bubbleSort(){
        int c = 0;
        Node a = head.link;
        while (a.link!=null){
            Node b = head.link;
            while (b.link!=null){
                if(b.value > b.link.value){
                    c = b.value;
                    b.value = b.link.value;
                    b.link.value = c;
                }
                b=b.link;
            }
            a=a.link;
        }

    }

    public void printList(){
        Node z = head.link;
        while (z!=null){
            System.out.println(z.value);
            z = z.link;
        }
    }

    class Node{
        private int value;
        private Node link;
    }
}
