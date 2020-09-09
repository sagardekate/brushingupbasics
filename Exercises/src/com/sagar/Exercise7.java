package com.sagar;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of characters you want to add in an array: ");
        int elem = obj.nextInt();
        char arr[] = new char[elem];
        char a = 0;
        int vowels = 0;
        for (int i=0;i<arr.length;i++) {
            System.out.print("Enter value for index " + i+": ");
            a = obj.next().charAt(0);
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
                vowels++;
            }
            arr[i]=a;
        }
        System.out.println("Character Array: " + Arrays.toString(arr));
        System.out.println("Total number of vowels: "+vowels);
    }
}
