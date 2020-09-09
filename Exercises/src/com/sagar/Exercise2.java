package com.sagar;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner obj = new Scanner(System.in);
        System.out.print("Number of prime numbers you want to print: ");
        int number = obj.nextInt();
        if(number<0){
            System.out.println("Enter a positive number");
        }else{
        int count = 0;
        for(int i = 2; i>1;i++){
            isPrime=true;
            for(int j = 2; j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
                count++;
            }
            if(count==number){
                break;
            }
        }}
    }
}
