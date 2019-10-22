package com.company;
import java.util.Scanner;
public class maxOfArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner maxOfArray = new Scanner(System.in);
        do {
            System.out.println("Enter Your Size");
            size = maxOfArray.nextInt();
            if(size > 20) System.out.println("Size should not exceed");
        } while (size >20);
        array = new int[size];
        int i =0;
        while(i<array.length){
            System.out.print("Enter element" + (i +1) +":");
            array[i]= maxOfArray.nextInt();
            i++;
        }
        System.out.println(kk(array));

    }
    private static int kk (int[] array){
        int max = array[0];
        for (int i : array){
            if (i>max) {
                max = i;
            }
        }
        return max;
    }

}
