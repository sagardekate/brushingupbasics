package com.sagar.recursion;

import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in an array: ");
        int elements = scan1.nextInt();
        int arr[] = new int[elements];
        for (int i=0; i<arr.length; i++){
            System.out.print("Enter Element "+i+": ");
            arr[i] = scan1.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        Integer[] array = new Integer[list.size()];
        list.toArray(array);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
        System.out.print("Enter a number from the array to find its index: ");
        int key =scan1.nextInt();
        System.out.print("Binary Search for key "+key+": "+binarySearch(array, key, 0, array.length));

    }

    private static Integer binarySearch(Integer[] array, int key, int start, int end) {
        if(start<=end){
            int middle = (start+end)/2;
            if(array[middle]>key){
                return binarySearch(array, key, start, middle);
            }
            if(array[middle]<key){
                return binarySearch(array, key, middle+1, end);
            }
            else {
                return middle;
            }
        }else {
            return -1;
        }
    }

}
