package TASK1;

public class Task1_6 {

    public static double ArithmeticMeanDigits6(int number) {
        return sumDigits6(number) / 6.0;
    }

    public static double GeometricMeanDigits6(int number) {
        return Math.pow(productDigits6(number), 1.0 / 6);
    }

    private static int productDigits6(int number) {
        int product = Task1_5.productDigits5(number);
        product *= number / 100000 % 10;
        return product;
    }

    private static int sumDigits6(int number) {
        int sum = Task1_5.sumDigits5(number);
        sum += number / 100000 % 10;
        return sum;
    }
}
