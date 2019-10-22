package com.company;
import java.util.Scanner;
public class Tim20songuyento {
    public static void main(String[] args) {
        Scanner songuyen20 = new Scanner(System.in);
        int number;
        int count =0;
        for (number = 2;number <100;number++){
            if (ttt(number) == true && count<20){
                System.out.println(number);
                count++;
            }


        }
    }
    private static boolean ttt(int number){
        for (int i =2;i < Math.sqrt(number);i++){
            if (number % i ==0){
                return false;
            }

        }
        return true;
    }
}
