package TASK1;


public class Task1_5 {

    public static int sumDigits5(int number) {
        int sum = 0;
        sum += number % 10;
        sum += number / 10 % 10;
        sum += number / 100 % 10;
        sum += number / 1000 % 10;
        sum += number / 10000 % 10;
        return sum;
    }

    public static int productDigits5(int number) {
        int product = 1;
        product *= number % 10;
        product *= number / 10 % 10;
        product *= number / 100 % 10;
        product *= number / 1000 % 10;
        product *= number / 10000 % 10;
        return product;
    }

}
