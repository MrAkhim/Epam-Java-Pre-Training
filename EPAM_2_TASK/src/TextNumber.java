import java.util.Scanner;

class TextNumber {

    private static int number;

    private static int firstDigit;
    private static int secondDigit;
    private static int thirdDigit;

    private static void getDigits(int number) {
        firstDigit = number % 10;
        secondDigit = (number /= 10) % 10;
        thirdDigit = (number / 10) % 10;
    }

    private static String textThirdDigit() {
        String str="";
        switch (thirdDigit) {
            case 0:
                str = textSecondDigit();break;
            case 1:
                str = "one hundred "+textSecondDigit();break;
            case 2:
                str = "two hundred "+textSecondDigit();break;
            case 3:
                str = "three hundred "+textSecondDigit();break;
            case 4:
                str = "four hundred "+textSecondDigit();break;
            case 5:
                str = "five hundred "+textSecondDigit();break;
            case 6:
                str = "six hundred "+textSecondDigit();break;
            case 7:
                str = "seven hundred "+textSecondDigit();break;
            case 8:
                str = "eight hundred "+textSecondDigit();break;
            case 9:
                str = "nine hundred "+textSecondDigit();break;
        }
        return str;
    }

    private static String textSecondDigit() {
        String str="";
        switch (secondDigit) {
            case 0:
                str = textFirstDigit();break;
            case 1:
                str = textSecondDigitSpecial();break;
            case 2:
                str = "twenty " + textFirstDigit();break;
            case 3:
                str = "thirty " + textFirstDigit();break;
            case 4:
                str = "forty " + textFirstDigit();break;
            case 5:
                str = "fifty " + textFirstDigit();break;
            case 6:
                str = "sixty " + textFirstDigit();break;
            case 7:
                str = "seventy " + textFirstDigit();break;
            case 8:
                str = "eighty " + textFirstDigit();break;
            case 9:
                str = "ninety " + textFirstDigit();break;
        }
        return str;
    }

    private static String textSecondDigitSpecial() {
        String str="";
        if (secondDigit == 1) {
            switch (firstDigit) {
                case 0:
                    str = "ten";break;
                case 1:
                    str = "eleven";break;
                case 2:
                    str = "twelve";break;
                case 3:
                    str = "thirteen";break;
                case 4:
                    str = "fourteen";break;
                case 5:
                    str = "fifteen";break;
                case 6:
                    str = "sixteen";break;
                case 7:
                    str = "seventeen";break;
                case 8:
                    str = "eighteen";break;
                case 9:
                    str = "nineteen";break;
            }
        }
        return str;
    }

    private static String textFirstDigit() {
        String str ="";
        switch (firstDigit) {
            case 0:
                str = "null";break;
            case 1:
                str = "one";break;
            case 2:
                str = "two";break;
            case 3:
                str = "three";break;
            case 4:
                str = "four";break;
            case 5:
                str = "five";break;
            case 6:
                str = "six";break;
            case 7:
                str = "seven";break;
            case 8:
                str = "eight";break;
            case 9:
                str = "nine";break;
        }
        return str;
    }

    static void print() {
        readData();
        System.out.println("\nWhat is the capital equivalent of the number "+number+" ? ");
        getDigits(number);
        System.out.println("The equivalent is: "+textThirdDigit());
    }

    private static void readData(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the number: ");
        number = in.nextInt();

    }
}
