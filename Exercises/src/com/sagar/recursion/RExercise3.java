package com.sagar.recursion;

import java.util.*;

public class RExercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Enter base: ");
        int base = scan.nextInt();
        System.out.print("Enter power: ");
        int power = scan.nextInt();
        System.out.println(powerFunction(base, power));*/
    /*    System.out.print("Enter a number: ");
        int num = scan.nextInt();*/
        /*System.out.println(numberofSpeakers(num));*/
        /*System.out.println(fibonacci(num));*/
        /*System.out.println(sumofDigits(num));*/
        /*System.out.println(count(num));*/
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of elements in an array: ");
        int elements = obj.nextInt();
        int array[] = new int[elements];
        System.out.println("Enter Elements");
        for (int i=0; i<array.length; i++){
            System.out.print("Element 1: ");
            array[i] = obj.nextInt();
        }
        System.out.println("Your array: "+ Arrays.toString(array));
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        Collections.sort(list);
        Integer[] myArray = new Integer[list.size()];
        list.toArray(myArray);
        System.out.println("Sorted Array: "+Arrays.toString(myArray));
        System.out.print("Enter value from array that you want to search: ");
        int key = obj.nextInt();
        System.out.println("Binary Search index for key "+ key+ ": "+ binarySearch(myArray, key, 0, myArray.length-1));

    }

    private static Integer binarySearch(Integer[] myArray, int key, int start, int end) {
        if(start<=end) {
            int middle = (start + end) / 2;
            if (myArray[middle] > key) {
                return binarySearch(myArray, key, start, middle - 1);
            }
            if (myArray[middle] < key) {
                return binarySearch(myArray, key, middle + 1, end);
            }
            else  {
                return middle;
            }
        }else {
            return -1;
        }
    }

    private static int count(int num) {
        if(num<=9){
            if(num == 5){
                return 1;
            }else{
                return 0;
            }
        }
        else{
        if(num%10==5){
            return 1 + count(num/10);
        }
        else{
            return 0 + count(num / 10);
        }}
    }

    private static int sumofDigits(int num) {
        if(num<=9) {
            return num;
        }else{
            return num%10 + sumofDigits(num/10);
        }
    }

    private static int numberofSpeakers(int num) {
        if (num == 0) {
            return 0;
        } else {
            if (num % 2 == 0) {
                return 2 + numberofSpeakers(num - 1);
            }
            else {
                return 1 + numberofSpeakers(num - 1);
            }
        }
    }


    private static int fibonacci(int num) {
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }

    private static int fibonacci(int result, int nextNum) {

            System.out.print(nextNum+", ");

            return fibonacci(nextNum, result + nextNum);

    }

    private static int factorial(int num) {
        if(num == 0 || num == 1){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }

    private static int powerFunction(int base, int power) {
        if(power == 1){
            return base;
        }else{
            return base * powerFunction(base,power-1);
        }

    }
}
