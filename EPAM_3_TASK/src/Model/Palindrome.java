package Model;

public class Palindrome {
    public static boolean isPalindromeNumber(int number) {
        return number == reverseNumber(number);
    }

    private static int reverseNumber(int number) {
        int extra = 0;
        while (number != 0) {
            extra = extra * 10 + number % 10;
            number /= 10;
        }
        return extra;
    }
}
