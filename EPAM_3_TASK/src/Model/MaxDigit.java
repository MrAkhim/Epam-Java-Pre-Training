package Model;

public class MaxDigit {

    public static int getMaxDigitNumber(int number) {
        int absNumber = Math.abs(number);
        int maxDigit = number % 10;
        absNumber /= 10;
        while (absNumber > 0) {
            if (maxDigit < absNumber % 10) {
                maxDigit = absNumber % 10;
            }
            absNumber /= 10;
        }
        return maxDigit;
    }
}
