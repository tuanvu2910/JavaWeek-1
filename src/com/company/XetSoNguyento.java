package com.company;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class XetSoNguyento {
    public static void main(String[] args) {
        Scanner Check1 = new Scanner(System.in);
        System.out.println("Nhap so nguyen to");
        int yourNumber = Check1.nextInt();

        if (yourNumber < 2) {
            System.out.println("Khong phai");
        } else {
            checkOut(yourNumber);
        }
        check100();
    }

    private static void checkOut(int yourNumber) {
        int i = 2;
        boolean check = false;
        while (i <= Math.sqrt(yourNumber)) {
            if (yourNumber % i == 0) {
                check = true;
                break;
            }
            i++;
        }
        if (check) {
            System.out.println("Khong phai");
        } else {
            System.out.println("phai");
        }
    }

    private static void check100() {
        for (int i = 2; i <= 100; i++) {
            if(!checkOut100(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkOut100(int yourNumber) {
        int i = 2;
        while (i <= Math.sqrt(yourNumber)) {
            if (yourNumber % i == 0) {
                return true;
            }
            i++;
        }
        return false;

    }
}
