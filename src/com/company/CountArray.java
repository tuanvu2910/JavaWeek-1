package com.company;

public class CountArray {
    public static void main(String[] args) {
            String string = "Tuanvuc";
            char cc = 'c';
            int count = 0;

            for (int i = 0;i< string.length();i++){
                if (string.charAt(i)== cc) count++;

        }
        System.out.println(count);
    }
}
