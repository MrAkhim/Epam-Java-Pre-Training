package Model;

public class PrimeNumber {
    public static boolean checkPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        double conditionValue = Math.sqrt(number);
        for (int i = 2; i <= conditionValue; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
