package Model;

public class TextNumber {

    public static String textThirdDigit(int number) {
        String str = "";

        int thirdDigit = number / 100;

        switch (thirdDigit) {
            case 0:
                str = textSecondDigit(number);
                break;
            case 1:
                str = "one hundred " + textSecondDigit(number);
                break;
            case 2:
                str = "two hundred " + textSecondDigit(number);
                break;
            case 3:
                str = "three hundred " + textSecondDigit(number);
                break;
            case 4:
                str = "four hundred " + textSecondDigit(number);
                break;
            case 5:
                str = "five hundred " + textSecondDigit(number);
                break;
            case 6:
                str = "six hundred " + textSecondDigit(number);
                break;
            case 7:
                str = "seven hundred " + textSecondDigit(number);
                break;
            case 8:
                str = "eight hundred " + textSecondDigit(number);
                break;
            case 9:
                str = "nine hundred " + textSecondDigit(number);
                break;
        }
        return str;
    }

    private static String textSecondDigit(int number) {
        String str = "";
        int secondDigit = (number / 10) % 10;
        switch (secondDigit) {
            case 0:
                str = textFirstDigit(number);
                break;
            case 1:
                str = textSecondDigitSpecial(number);
                break;
            case 2:
                str = "twenty " + textFirstDigit(number);
                break;
            case 3:
                str = "thirty " + textFirstDigit(number);
                break;
            case 4:
                str = "forty " + textFirstDigit(number);
                break;
            case 5:
                str = "fifty " + textFirstDigit(number);
                break;
            case 6:
                str = "sixty " + textFirstDigit(number);
                break;
            case 7:
                str = "seventy " + textFirstDigit(number);
                break;
            case 8:
                str = "eighty " + textFirstDigit(number);
                break;
            case 9:
                str = "ninety " + textFirstDigit(number);
                break;
        }
        return str;
    }

    private static String textSecondDigitSpecial(int number) {
        String str = "";
        int secondDigit = (number / 10) % 10;
        int firstDigit = number % 10;
        if (secondDigit == 1) {
            switch (firstDigit) {
                case 0:
                    str = "ten";
                    break;
                case 1:
                    str = "eleven";
                    break;
                case 2:
                    str = "twelve";
                    break;
                case 3:
                    str = "thirteen";
                    break;
                case 4:
                    str = "fourteen";
                    break;
                case 5:
                    str = "fifteen";
                    break;
                case 6:
                    str = "sixteen";
                    break;
                case 7:
                    str = "seventeen";
                    break;
                case 8:
                    str = "eighteen";
                    break;
                case 9:
                    str = "nineteen";
                    break;
            }
        }
        return str;
    }

    private static String textFirstDigit(int number) {
        String str = "";
        int firstDigit = number % 10;
        switch (firstDigit) {
            case 0:
                str = "null";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
        }
        return str;
    }

}
