package StopWatch;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        aWatch watch = new aWatch();

        for (int i = 0; i < 100000; i++) {
            array[i] = (int) Math.random() * 100;
        }
        watch.start();
        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}


