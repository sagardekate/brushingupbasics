package com.sagar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
       /* int i = 1;int mulResult = 1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b = obj.nextInt();
        System.out.print("Enter exponent: ");
        int exp = obj.nextInt();
        do {
            mulResult = mulResult*b;
            i++;
        }while(i<=exp);
        System.out.println mulResult);*/
        /*int mulResult = 1;
        for(int i = 1; i<=20;i++){
            if(i%2 != 0){
                 mulResult= mulResult*i;
            }
        }
        System.out.println(mulResult);

        int sumResult = 0;
        for(int j = 1; j<=100;j++){
            if(j%2 == 0){
                sumResult=sumResult+j;
            }
        }
        System.out.println(sumResult);
    */

        /*for(int i = 1; i<=7;i++){
            for(int j = 6; j>=i; j--){
                System.out.print("  ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }
            for(int m = 6; m>=i; m--){
                System.out.print(" ");
            }
            System.out.println();
        }*/
        /*System.out.println("     #     ");
        for(int i = 1; i<=4;i++){
            for(int j = 3; j>=i; j--){
                System.out.print(" ");
             }
            for(int x=1; x<2;x++){
                System.out.print("#");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(" ");
            }
            for(int l = 1; l<=i; l++){
                System.out.print(" ");
            }
            for(int y=1; y<2;y++){
                System.out.print("#");
            }
            for(int m = 4; m>=i; m--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int h=1; h<=3;h++){
            for(int l = 1; l<=h; l++){
                System.out.print(" ");
            }
            for(int d=1; d<2;d++){
                System.out.print("#");
            }
            for(int f = 3; f>=h; f--) {
                System.out.print(" ");
            }
            for(int j = 3; j>=h; j--){
                System.out.print(" ");
            }
            for(int x=1; x<2;x++){
                System.out.print("#");
            }
            for(int k = 1; k<=h; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("     #     ");

*/
       /* Scanner obj = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int number = obj.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<=number/2;i++){
            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }*/

        /*Scanner obj = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = obj.nextInt();
        System.out.println("Number 2: ");
        int num2 = obj.nextInt();
        if (num1>num2){
            System.out.println("Number 1 should be less than Number 2");
        }
        if(num1<num2) {
            int mul = 1;
            int add = 0;
            for (int i = num1+1; i < num2; i++) {
                mul = mul * i;
                add = add + i;
            }
            System.out.println(mul);
            System.out.println(add);
        }
*/
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        boolean isPrime = true;
        int large = 0;
        int count = 0;
        int userNumber = obj.nextInt();

        for(int i = 2; i<=userNumber;i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if(i>large){
                    large=i;
                }
                count++;
            }
        }
        System.out.println("Prime number count: " + count);
        System.out.println("Largest Prime number: " + large);
    }

}
