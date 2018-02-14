package Model;

public class FibonacciNumber {

    private static int checkWellness(int number) {
        if (number <= 0) {
            return -1;
        } else if (number == 1) {
            return 0;
        } else if (number == 2) {
            return 1;
        }
        return 2;
    }

    public static int identifyFibonacciNumberRecursion(int number) {
        if (checkWellness(number) == 2) {
            return identifyFibonacciNumberRecursion(number - 1) + identifyFibonacciNumberRecursion(number - 2);
        } else
            return checkWellness(number);
    }

    public static int identifyFibonacciNumber(int number) {
        if (checkWellness(number) == 2) {
            int tempFibonacci1 = 0;
            int tempFibonacci2 = 1;

            for (int i = 2; i < number; i++) {
                tempFibonacci2 = tempFibonacci1 + tempFibonacci2;
                tempFibonacci1 = tempFibonacci2 - tempFibonacci1;
            }
            return tempFibonacci2;
        } else {
            return checkWellness(number);
        }
    }

}
