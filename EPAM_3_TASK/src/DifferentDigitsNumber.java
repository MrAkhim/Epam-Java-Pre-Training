import java.util.Scanner;

class DifferentDigitsNumber {

    static void print() {
        System.out.println("Enter the number: ");
        int number = readData();
        System.out.println("Amount of different digits is -----> " + countDifferentDigits(number));
    }

    private static int readData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    private static int countDifferentDigits(int number) {
        int copy = number;
        number = deleteNullsDigits(number);
        int amountDigits = countAmountDigits(number);
        int extra = number / 10;
        while (number > 0) {
            for (int i = 0; i < amountDigits; i++) {
                int digit = (int) (extra / Math.pow(10, i) % 10);

                if (number % 10 == digit) {
                    amountDigits--;
                    extra = changeDigitWithNull(extra, digit, i);
                }
            }
            extra = extra / 10;
            number /= 10;
        }
        if (HasNullDigits(copy)) {
            amountDigits++;
        }
        return amountDigits;
    }

    private static int countAmountDigits(int number) {
        int count = 1;
        while (number / 10 != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    private static boolean HasNullDigits(int number) {
        while (number / 10 != 0) {
            if (number % 10 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    private static int deleteNullsDigits(int number) {
        int copyNumber = number;
        for (int i = countAmountDigits(copyNumber); i >= 0; i--) {
            int digit = (int) (copyNumber / Math.pow(10, i) % 10);
            if (digit == 0) {
                int pow10ForSecondPartDigits = (int) Math.pow(10, i);
                int pow10ForFirstPartDigit = (int) Math.pow(10, i + 1);
                copyNumber = (copyNumber / pow10ForFirstPartDigit) * pow10ForSecondPartDigits + copyNumber % pow10ForSecondPartDigits;
            }
        }
        return copyNumber;
    }


    private static int changeDigitWithNull(int number, int digit, int param) {
        return (int) (number - digit * Math.pow(10, param));
    }
}

