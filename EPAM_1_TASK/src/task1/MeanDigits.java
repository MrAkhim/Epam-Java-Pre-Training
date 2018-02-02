package task1;

class MeanDigits  {

    static double ArithmeticMeanDigits(int number) {
        return sumDigits(number) / 6.0;
    }

    static double GeometricMeanDigits(int number) {
        return Math.pow(productDigits(number), 1.0 / 6);
    }

    private static int sumDigits(int number) {
        int sum = 0;
        sum += number % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += number / 10 % 10;

        return sum;
    }

    private static int productDigits(int number) {
        int product = 1;
        product *= number % 10;
        product *= (number /= 10) % 10;
        product *= (number /= 10) % 10;
        product *= (number /= 10) % 10;
        product *= (number /= 10) % 10;
        product *= number / 10 % 10;
        return product;
    }
}
