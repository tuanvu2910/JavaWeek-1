package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Vehinh {
    public static void main(String[] args) {
        Scanner draw = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            for (int j =0;j <7; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        the1();
        System.out.println();
        the2();
        System.out.println();
        the3();
        System.out.println();
    }
    public static void the1(){
        for(int i = 0;i<=5;i++){
            for (int j =0;j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void the2(){
        for(int i = 0;i<=5;i++){
            for (int j =5;j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void the3(){
        final int HEIGHT = 4;
        String result ="";
        String space = "";
        String sao = "";

     for (int i =1; i<=HEIGHT; i++){
         space="";
         sao="";
         for(int j =1; j<=HEIGHT-i;j++) space += "";
         for(int z =1; z<=2*i-1;z++) sao += "*";
         result +=   space + sao +"\n";
     }
        System.out.println(result);
    }


}
