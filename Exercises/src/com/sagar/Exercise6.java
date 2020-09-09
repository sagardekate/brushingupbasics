package com.sagar;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.print("Enter Number of elements for both arrays: ");
        Scanner newObj = new Scanner(System.in);
        int elements = newObj.nextInt();
        int arr1[] = new int[elements];
        int arr2[] = new int[elements];
        int elem = 0;
        for (int j=1; j<=2;j++) {
            System.out.println("Enter the values in array "+j+":");
            for (int i = 0; i < elements; i++) {
                System.out.print("Elem "+i+": ");
                elem = newObj.nextInt();
                if(j==1){
                    arr1[i] = elem;
                }else {
                    arr2[i] = elem;
                }
            }
        }
        System.out.println("Your Array 1: "+Arrays.toString(arr1));
        System.out.println("Your Array 2: "+Arrays.toString(arr2));
        int newElements = arr1.length+arr2.length;
        int result[] = new int[newElements];
        int index = 0;
        for (int i:arr1){
            result[index]=i;
            index++;
        }
        for (int i:arr2){
            result[index]=i;
            index++;
        }
        System.out.print("Combined array: "+Arrays.toString(result));


    }
}
