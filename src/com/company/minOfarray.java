package com.company;
import java.util.Scanner;
public class minOfarray {
    public static void main(String[] args) {
       Scanner findMin = new Scanner(System.in);
        int [] array1 = new int[100];
        for (int i : array1){
            int random = (int) Math.floor(Math.random()*100);
            array1[i] = random;
        }
        System.out.println(minValue(array1));
    }
    private static int minValue(int [] array){
        int min = array[0];
        for (int i : array){
            if (array[i] < min ){
                min = array[i];
            }
        }
        return min;
    }
}
