package com.sagar.datastructures.tree;

import java.util.Hashtable;

public class main {
    public static void main(String[] args) {

        Student student1 = new Student("Zoya",65);
        Student student2 = new Student("Mirza",13);
        Student student3 = new Student("Adarsh",1);
        Student student4 = new Student("Sagar",14);
        Student student5 = new Student("Liala",12);
        Student student6 = new Student("Wraith",60);
        Student student7 = new Student("Banglore",3);

        BST bst = new BST();
        bst.insertStudent(student1);
        bst.insertStudent(student2);
        bst.insertStudent(student3);
        bst.insertStudent(student4);
        bst.insertStudent(student5);
        bst.insertStudent(student6);
        bst.insertStudent(student7);

        bst.showAll(bst.findNode("Zoya"));

        System.out.println(bst.getData(bst.findParentNode("Zoya")).toString());
    }
}
