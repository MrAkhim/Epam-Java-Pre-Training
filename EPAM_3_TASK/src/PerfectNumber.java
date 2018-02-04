import java.util.Scanner;

class PerfectNumber {
    static void print() {
        System.out.println("Enter the number: ");
        int number = readData();
        System.out.println("Is your number perfect? -----> " + isPerfectNumber(number));
    }

    private static int readData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isPerfectNumber(int number) {
        return number == countSumDivisors(number);
    }

    private static int countSumDivisors(int number) {
        int sumDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumDivisors += i;
            }
        }
        return sumDivisors;
    }
}
