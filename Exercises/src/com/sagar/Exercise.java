package com.sagar;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
/*        for (int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int k=6;k>i; k--){
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i=6; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print(j);
            }
            for (int k=6;k>=i; k--){
                System.out.print("&");
            }
            System.out.println();

        }
        System.out.println("@");
        for(int i=5;i>1;i--){
            System.out.print("@");
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            System.out.println("@");

        }
        for (int j=6; j>0;j--){
            System.out.print("@");
        }

        System.out.println();

        for (int a=1,b=10,c=11,d=20,e=21,f=30;a<=10;a++,b--,c++,d--,e++,f--){
            System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
        }

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = obj.nextInt();
        System.out.print("Enter the height: ");
        int height = obj.nextInt();
        if (height<=0 || width<=0){
            System.out.println("You entered a non-positive integer...");
        }else{
        for (int i=1; i<=height; i++){
            for (int j=1; j<=width; j++) {
                System.out.print("B");
            }
            System.out.println();
        }}*/
        /*int i = 2; int small = 0; int large=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Number 1: ");
        int a= obj.nextInt();
        small = a;
        large = a;
        while(i <= 10) {
            System.out.print("Number " + i +": ");
            i++;
            int b = obj.nextInt();
            if(b<small){
                small = b;
            }
            if(b>large){
                large = b;
            }
        }
        System.out.println("Highest number is: " + large);
        System.out.println("Lowest number is: " + small);
*/
        int i = 1;
        Scanner obj = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (i <= 10) {
            System.out.print("Number " + i + ": ");
            int a = obj.nextInt();
            list.add(a);
            i++;
        }
        System.out.println("Min :" + findMin(list));
        System.out.println("Max :" + findMax(list));

    }

    private static Integer findMax(List<Integer> list) {

        //check if list is empty or not
        if (list.isEmpty() || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        //create a new list so that the original list is not disturbed
        List<Integer> sortedList = new ArrayList<>(list);
        //Sort list
        Collections.sort(sortedList);
        //return index 0 value/ min value
        return sortedList.get(sortedList.size() - 1);
    }

    private static Integer findMin(List<Integer> list) {

        if (list.isEmpty() || list.size() == 0) {
            return Integer.MIN_VALUE;
        }

        List<Integer> sortedList = new ArrayList<>(list);

        Collections.sort(sortedList);

        return sortedList.get(0);
    }
}
