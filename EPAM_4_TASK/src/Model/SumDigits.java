package Model;

public class SumDigits {

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int sumDigitsRecursion(int number) {
        if (number > 10) {
            return (number % 10) + sumDigitsRecursion(number / 10);
        }
        return number;
    }

}
