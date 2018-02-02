package task1;

class SequenceDigits {

    static boolean IsIncreasingDecreasingSequenceDigits(int number) {
        return IsIncreasingSequenceDigits(number) || IsDecreasingSequenceDigits(number);
    }

    private static boolean IsIncreasingSequenceDigits(int number) {
        int digit1 = number % 10;
        int digit2 = (number/=10) % 10;
        int digit3 = (number/=10) % 10;
        int digit4 = number / 10;
        boolean notSuitable = (digit1 <= digit2) || (digit2 <= digit3) || (digit3 <= digit4);
        return !notSuitable;
    }

    private static boolean IsDecreasingSequenceDigits(int number) {
        return IsIncreasingSequenceDigits(reverse4Digits(number));
    }

    private static int reverse4Digits(int number) {
        int extra = 0;
        extra = extra * 10 + number % 10;
        extra = extra * 10 + (number/=10) % 10;
        extra = extra * 10 + (number/=10) % 10;
        extra = extra * 10 + number / 10 % 10;
        return extra;
    }
}
