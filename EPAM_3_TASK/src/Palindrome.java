import java.util.Scanner;

class Palindrome {
    static void print() {
        System.out.println("Enter the number: ");
        int number = readData();
        System.out.println("Is your number is palindrome? ----->  " + isPalindromeNumber(number));
    }

    private static int readData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isPalindromeNumber(int number) {
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
