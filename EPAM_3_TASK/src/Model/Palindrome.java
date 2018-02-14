package Model;

public class Palindrome {
    public static boolean checkPalindromeNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return number == reversedNumber;
    }
}
