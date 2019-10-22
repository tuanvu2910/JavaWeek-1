package com.company;


import java.util.Scanner;

public class bodyweight {
    public static void main(String[] args) {
        Scanner bodyWeight = new Scanner(System.in);
             System.out.println("Show me you Weight");
             double Weight = bodyWeight.nextDouble();
             System.out.println("Show me you Height");
             double Height = bodyWeight.nextDouble();
             double Result = Weight/Math.pow(Height,2);
             System.out.println(Result);
        };

    }

