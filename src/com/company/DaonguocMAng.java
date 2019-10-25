package com.company;

import java.util.Scanner;

public class DaonguocMAng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x ;

     do{
         System.out.println("your array at least 0 and max 20");
         x = scanner.nextInt();
         if (x >20 && x <0){
             System.out.println("your array at least 0 and max 20 ");
         }
     } while (x >20 && x <0);
        int [] array1 = new int[x];
        for (int i = 0 ; i < array1.length;i++){
            array1[i] = (int)Math.floor(Math.random()*100);
        }
        for (int i : array1){
            if (i !=0) {
                System.out.println(i);
            }
        }
        System.out.println("-------------------");
       int [] array2 = DaonguocMAng(array1);
        for (int value : array2) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
    public  static int[] DaonguocMAng(int array2[]){
        int j = array2.length-1;
        for (int i =0;i<array2.length;i++){
            array2[i] = array2[j];
            j--;
        }
        return array2;

    }
}
