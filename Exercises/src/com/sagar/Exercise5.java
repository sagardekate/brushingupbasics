package com.sagar;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add in an array: ");
        int elem = obj.nextInt();
        int arr[] = new int[elem];
        int a = 0;
        for (int i=0;i<arr.length;i++) {
            System.out.print("Enter value for index " + i+": ");
            a = obj.nextInt();
            arr[i]=a;
        }
        int index1 = 0;
        int index2 = 0;
        System.out.println("Here is your array: "+ Arrays.toString(arr));
        System.out.print("Enter Integer 1: ");
        int int1 = obj.nextInt();
        System.out.print("Enter Integer 2: ");
        int int2 = obj.nextInt();
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == int1){
                index1 = i;
                System.out.println("Number "+int1+" is at index "+i);
            }
            if (arr[i] == int2){
                index2 = i;
                System.out.println("Number "+int2+" is at index "+i);
            }
        }
        arr[index1] = int2;
        arr[index2] = int1;
        System.out.println(Arrays.toString(arr));


    }
}
