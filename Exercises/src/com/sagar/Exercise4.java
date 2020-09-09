package com.sagar;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
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
        System.out.println("Here is your array: "+Arrays.toString(arr));

        System.out.print("Now enter the integer from above array to get its index: ");
        int num = obj.nextInt();
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                index = i;
                System.out.println("The corresponding index is: " + index);
            }
        }
    }
}
