package com.company;

import java.util.Scanner;

public class maxOfArray2 {
    public static void main(String[] args) {
        int x , y;
        Scanner yourArray = new Scanner(System.in);
        System.out.println("your x");
        x = yourArray.nextInt();
        System.out.println("your y");
        y = yourArray.nextInt();

        int[][] array = new int[x][y];
        numberToArray(array);
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }

        }
        System.out.println();
        System.out.println("And max of array is "+maxToArray(array));
    }

    private static void numberToArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random() * 100);
            }

        }
    }
    private static int maxToArray(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j =0;j <array[i].length;j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
