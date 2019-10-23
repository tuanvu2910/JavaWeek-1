package com.company;

import java.util.Scanner;

public class numberOfPassingStudent {
    public static void main(String[] args) {
        int size;
        int [] array ;
        int count = 0;
        Scanner passingStr = new Scanner(System.in);
       do {
           System.out.println("Enter your size");
           size = passingStr.nextInt();
           if (size>30) System.out.println("Size should be exceed 30 ");
       }while (size>30);
       array = new int[size];
       for (int i =0;i<array.length;i++){
           System.out.println("Enter your math of student " + (i+1)+":");
           array[i] = passingStr.nextInt();
       }
       for (int i =0; i<array.length;i++){
           System.out.println(array[i]);
           if(array[i]>5&&array[i]<10){
               count++;
           }

       }
        System.out.println("Number of passing student is " + count);
    }
}
