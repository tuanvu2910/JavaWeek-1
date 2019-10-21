package com.company;

import java.util.Scanner;

public class FindDayinMouth {
    public static void main(String[]ads){
        Scanner scl = new Scanner(System.in);
        System.out.println("What the mouth you choise");
        int yourMouth = scl.nextInt();
        String dayInMouth = "";
        switch (yourMouth){
            case 2:
                 dayInMouth = "28 or 29 day";
                break;
            case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                   dayInMouth = "31";
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
               dayInMouth = "30";
                break;
            default:
                dayInMouth = "Invalid input!";
                break;
        }

        if (dayInMouth !="") System.out.printf("The Mouth is %d has %s days",yourMouth,dayInMouth);
     else System.out.print("Invalid input!");
    }
}
