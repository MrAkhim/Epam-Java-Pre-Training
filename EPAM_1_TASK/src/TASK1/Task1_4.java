package TASK1;

public class Task1_4 {

    public static boolean increasingDecreasingSequenceNumber(int number) {
        return increasingSequenceNumber(number) || decreasingSequenceNumber(number);
    }

    private static boolean increasingSequenceNumber(int number) {
        int digit1 = number % 10;
        int digit2 = number / 10 % 10;
        int digit3 = number / 100 % 10;
        int digit4 = number / 1000;
        boolean notSuitable = (digit1 <= digit2) || (digit2 <= digit3) || (digit3 <= digit4);
        return !notSuitable;
    }

    private static boolean decreasingSequenceNumber(int number) {
        return increasingSequenceNumber(reverse4(number));
    }

    public static int reverse4(int number) {
        int extra = 0;
        extra = extra * 10 + number % 10;
        extra = extra * 10 + number / 10 % 10;
        extra = extra * 10 + number / 100 % 10;
        extra = extra * 10 + number / 1000 % 10;
        return extra;
    }
}
