import java.util.Scanner;

class Task2_5 {

    private static int number;

    private static int firstDigit;
    private static int secondDigit;
    private static int thirdDigit;

    private static void getDigits(int number) {
        firstDigit = number % 10;
        secondDigit = number / 10 % 10;
        thirdDigit = number / 100 % 10;
    }

    private static String digit3() {
        String str="";
        switch (thirdDigit) {
            case 0:
                str = digit2();break;
            case 1:
                str = "one hundred "+digit2();break;
            case 2:
                str = "two hundred "+digit2();break;
            case 3:
                str = "three hundred "+digit2();break;
            case 4:
                str = "four hundred "+digit2();break;
            case 5:
                str = "five hundred "+digit2();break;
            case 6:
                str = "six hundred "+digit2();break;
            case 7:
                str = "seven hundred "+digit2();break;
            case 8:
                str = "eight hundred "+digit2();break;
            case 9:
                str = "nine hundred "+digit2();break;
        }
        return str;
    }

    private static String digit2() {
        String str="";
        switch (secondDigit) {
            case 0:
                str = digit1();break;
            case 1:
                str = digit2extra();break;
            case 2:
                str = "twenty " + digit1();break;
            case 3:
                str = "thirty " + digit1();break;
            case 4:
                str = "forty " + digit1();break;
            case 5:
                str = "fifty " + digit1();break;
            case 6:
                str = "sixty " + digit1();break;
            case 7:
                str = "seventy " + digit1();break;
            case 8:
                str = "eighty " + digit1();break;
            case 9:
                str = "ninety " + digit1();break;
        }
        return str;
    }

    private static String digit2extra() {
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

    private static String digit1() {
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
        System.out.println("The equivalent is: "+digit3());
    }

    private static void readData(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the number: ");
        number = in.nextInt();

    }
}
