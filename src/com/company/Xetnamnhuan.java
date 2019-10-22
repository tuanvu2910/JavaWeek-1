package com.company;

import java.util.Scanner;

public class Xetnamnhuan {
    public static void main(String[] args) {
        Scanner Xetnam = new Scanner(System.in);
        System.out.println("Nhap so nam");
        int soNam = Xetnam.nextInt();
        if(soNam % 4 == 0){
            if(soNam % 100 == 0){
                if(soNam % 400 == 0){
                    System.out.printf("%d is a leap year", soNam);
                } else {
                    System.out.printf("%d is NOT a leap year", soNam);
                }
            } else {
                System.out.printf("%d is a leap year", soNam);
            }
        } else {
            System.out.printf("%d is NOT a leap year", soNam);
        }
    }
}
