package com.company;
import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        Scanner Change = new Scanner(System.in);
        int USA , VietNamese;
        System.out.println("Your USA money");
        USA = Change.nextInt();
        VietNamese = 23000*USA;
        System.out.println(VietNamese);
    }
}
