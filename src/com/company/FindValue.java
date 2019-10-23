package com.company;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner findValue = new Scanner(System.in);
        System.out.println("Enter your name");
        String input = findValue.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(input)) {
                System.out.println("Position of the students in the list " + input + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + input + " in the list.");

    }
}
