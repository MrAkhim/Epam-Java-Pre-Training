package task1;

class OperationDigits {

    static int sumDigits(int number) {
        int sum = 0;
        sum += number % 10;
        sum += (number/=10) % 10;
        sum += (number/=10) % 10;
        sum += (number/=10) % 10;
        sum += number / 10 % 10;
        return sum;
    }

    static int productDigits(int number) {
        int product = 1;
        product *= number % 10;
        product *= (number/=10) % 10;
        product *= (number/=10) % 10;
        product *= (number/=10) % 10;
        product *= number / 10 % 10;
        return product;
    }

}
