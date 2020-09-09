package com.sagar.datastructures.doublylinkedlist;

public class main {
    public static void main(String[] args) {
        dlist list = new dlist(8);
        list.insertItem(10);
        list.insertItem(11);
        list.insertItem(12);
        list.insertItem(9);
        list.printItems();
        list.deleteItem(12);
        list.printItems();
    }
}
