package com.company;

import java.util.Scanner;

public class Pushone {
    public static void main(String[] args) {
        int [] array;
        Scanner pushOne = new Scanner(System.in);
        System.out.println("Sô phần tử trong mảng");
        int numberOfArray = pushOne.nextInt();
        array = new int[numberOfArray];
        int index;
        for (int i =0;i <array.length;i++){
            array[i] = (int)Math.floor(Math.random()*100);

        }
        for (int i = 0 ; i <array.length;i++) {
            System.out.println(array[i]);
        }
        System.out.println("Nhập x cần chèn vào");
        int x = pushOne.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        index = pushOne.nextInt();
        if (index<=1 && index>= array.length) System.out.println("Khong the chen");
        array[index-1] = x;
        for (int i = 0 ; i <array.length;i++) {
            System.out.println(array[i]);
        }
        }
}
