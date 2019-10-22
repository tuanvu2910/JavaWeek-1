import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = sc.nextInt();
        System.out.println(numToString(input));
    }

    private static String numToString(int in) {
        String out = "";
        if (in >= 1000 || in < 0) {
            return "out of ability";
        } else if (in < 10) {
            out = getTextLower10(in);
        } else if (in < 20) {
            out = getTextLower20(in);
        } else if (in < 100) {
            out = getTextLower100(in);
        } else{
            int tmp = in / 100;
            out += getTextLower10(tmp);
            out += " hundred and";
            if(in%100 <20 && in%100 >=10){
                out += " " + getTextLower20(in % 100);
            }else{
                out += " " + getTextLower100(in % 100);
            }
        }
        return out;

    }

    private static String getTextLower20(int in) {
        int tmp = in % 10;
        switch (tmp) {
            case 0:
                return "ten";
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirteen";
            case 4:
                return "fourteen";
            case 5:
                return "fiffteen";
            case 6:
                return "sixteen";
            case 7:
                return "seventeen";
            case 8:
                return "eighteen";
            case 9:
                return "nineteen";
        }
        return "";
    }

    private static String getTextLower10(int in) {
        switch (in) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    private static String getTextLower100(int in) {
        String out = "";
        int tmp1 = in / 10;
        int tmp2 = in % 10;
        switch (tmp1) {
            case 2:
                out += "twenty";
                break;
            case 3:
                out += "Thirty";
                break;
            case 4:
                out += "fourty";
                break;
            case 5:
                out += "fifty";
                break;
            case 6:
                out += "sixty";
                break;
            case 7:
                out += "seventy";
                break;
            case 8:
                out += "eighty";
                break;
            case 9:
                out += "ninety";
                break;
        }
        if (tmp2 != 0) out += " " + getTextLower10(tmp2);
        return out;
    }
}
