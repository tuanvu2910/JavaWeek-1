package com.company;

import java.util.Scanner;

public class TraSoNguyenTo {
    public static void main(String[] ads) {
        Scanner kiemTra = new Scanner(System.in);
        System.out.print("Show me your number");
        int number = kiemTra.nextInt();
        String alert = "";
        if (number < 2) {
            alert = "It's not a prime";
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                i++;
                alert = number + " is a prime";
            } else {
                alert = number + " is not a prime";
            }
            System.out.print(alert);

        }
    }
}
