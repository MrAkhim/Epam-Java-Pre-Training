package Model;

public class DifferentDigitsNumber {

    public static int countDifferentDigits(int number) {
        int buffer = 0;
        for (int i = 0; i < countAmountDigits(number); i++) {
            int digit = (int) (number / Math.pow(10, i) % 10);
            if (getDigit(buffer, digit) == 0) {
                buffer += Math.pow(10, digit);
            }
        }

        return countUnits(buffer);
    }

    private static int countUnits(int number) {
        int count = 0;
        for (int i = 0; i < countAmountDigits(number); i++) {
            int digit = (int) (number / Math.pow(10, i) % 10);
            if (digit == 1) {
                count++;
            }
        }
        return count;
    }

    private static int getDigit(int number, int position) {
        int copyNumber = number;
        copyNumber /= Math.pow(10, position);
        return copyNumber % 10;
    }

    private static int countAmountDigits(int number) {
        int count = 1;
        while (number / 10 != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
