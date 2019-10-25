package com.company;

public class GopMAng {
    public static void main(String[] args) {
        double [] array1 = new double[8];
        double [] array2 = new double[8];
        for (int i =0;i<array1.length;i++) {
            array1[i] = (double) Math.floor(Math.random() * 100);

        }for (int i =0;i<array2.length;i++) {
            array2[i] = (double) Math.floor(Math.random() * 100);

       }
//        for (double i : array1){
//            System.out.println(i);
//
//        }for (double i : array2){
//            System.out.println(i);
//
//        }
        double[] array12 = new double[16];
        int j =0;
        for (int i =0; i<array12.length/2;i++){
            array12[i] = array1[i];
        }for (int i =array12.length/2; i < array12.length;i++){
            array12[i] = array1[j];
            j++;
        }
        for (double i : array12){
            System.out.println(i);
        }




    }

}
