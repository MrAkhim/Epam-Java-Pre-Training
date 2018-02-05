package Model;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
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