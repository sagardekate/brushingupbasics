package com.sagar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        /*int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int arr3[] = new int[20];
        int index=0;
        for (int i=0;i<arr1.length;i++){
            arr3[index++]=arr1[i];
            arr3[index++]=arr2[i];
        }
        for(int j=0; j<arr3.length;j++){
            System.out.print (arr3[j]+ " ");*/


/*        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println("Second smallest Value:" + findMin(list));
        System.out.println("Second largest Value:" + findMax(list));

        }

    private static Integer findMax(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println();
        return (sortedList.get(sortedList.size()-2));
    }

    private static Integer findMin(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return (sortedList.get(1));
    */
        int arr[] = {5,5,3,3,7,44,856,23,13,124,41514};
        int small = arr[0];
        int large = arr[0];
        int secondSmall = 0;
        int secondLarge = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondSmall=small;
                small=arr[i];
            }
            if(arr[i]>large){
                secondLarge=large;
                large=arr[i];
            }
        }
        System.out.println("Second Small: " + secondSmall);
        System.out.println("Second Large: " + secondLarge);



        
    }
}


