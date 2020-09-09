package com.sagar.recursion;

import java.util.Scanner;

public class RExercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        printNumbers(num);
    }
    public static void printNumbers(int num){
        if(num == 0){
            return;
        }else{
            System.out.println(num);
            printNumbers(num-1);
        }
    }
}
