package com.sagar;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.print("Enter Number of elements for both arrays: ");
        Scanner newObj = new Scanner(System.in);
        int elements = newObj.nextInt();
        char arr1[] = new char[elements];
        char arr2[] = new char[elements];
        char elem = 0;
        for (int j=1; j<=2;j++) {
            System.out.println("Enter the Characters in array "+j+":");
            for (int i = 0; i < elements; i++) {
                System.out.print("Char "+i+": ");
                elem = newObj.next().charAt(0);
                if(j==1){
                    arr1[i] = elem;
                }else {
                    arr2[i] = elem;
                }
            }
        }
        System.out.println("Your Array 1: "+ Arrays.toString(arr1));
        System.out.println("Your Array 2: "+Arrays.toString(arr2));
        char dummyArray[] = new char[arr1.length];
        int j=0;
        int k=0;
        int f=0;
        for (char i: arr1){
            dummyArray[j] = i;
            j++;
        }
        for (char i: arr2){
            arr1[k] = i;
            k++;
        }
        for (char i: dummyArray){
            arr2[f] = i;
            f++;
        }
        System.out.println("New Array 1: "+ Arrays.toString(arr1));
        System.out.println("New Array 2: "+ Arrays.toString(arr2));
    }
}
