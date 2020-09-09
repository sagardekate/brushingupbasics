package com.sagar.recursion;

import java.util.Scanner;

public class RExercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of cats: ");
        int cats = scan.nextInt();
        System.out.println(numberOfEyesCatsHave(cats));

    }
    private static int numberOfEyesCatsHave(int cats) {
        if(cats == 0){
            return 0;
        }
        else {
            return 2 + numberOfEyesCatsHave(cats-1);
        }
    }

}
