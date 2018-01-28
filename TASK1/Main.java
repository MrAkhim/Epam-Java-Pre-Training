public class Main {

    private static int dinosaurWeightKilogram(int weight) {
        return weight / 1000;
    }

    private static int dinosaurWeightTon(int weight) {
        return weight / 1000000;
    }

    private static double ringSquare(double R1, double R2) {
        return Math.PI * (R1 * R1 - R2 * R2);
    }

    private static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " and b = " + b);
    }

    private static boolean increasingSequenceNumber(int number) {
        int copy_number = number;
        while (copy_number != 0) {
            number = copy_number;
            copy_number = copy_number / 10;
            if (number % 10 < copy_number % 10) {
                return false;
            }
        }
        return true;
    }

    private static boolean decreasingSequenceNumber(int number) {
        return increasingSequenceNumber(reverse(number));
    }

    private static boolean increasingDecreasingSequenceNumber(int number){
        return increasingSequenceNumber(number)||decreasingSequenceNumber(number);
    }

    private static int sumDigits(int number) {
        int sum = 0;
        while (number % 10 != 0) {
            int m = number % 10;
            sum += m;
            number /= 10;
        }
        return sum;
    }

    private static int productDigits(int number) {
        int product = 1;
        while (number % 10 != 0) {
            int m = number % 10;
            product *= m;
            number /= 10;
        }
        return product;
    }

    private static double ArithmeticMeanDigits(int number) {
        return sumDigits(number) / amountDigits(number);
    }

    private static double GeometricMeanDigits(int number) {
        return Math.pow(productDigits(number), 1.0 / amountDigits(number));
    }

    private static int amountDigits(int number) {
        int count = 1;
        while (number / 10 != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    private static int reverse(int number) {
        int extra = 0;
        while (number != 0) {
            extra = extra * 10 + number % 10;
            number /= 10;
        }
        return extra;
    }

    public static void main(String[] args) {
        System.out.print(123456789 + " g =>   ");
        System.out.println(dinosaurWeightKilogram(123456789) + " kg  and " + dinosaurWeightTon(123456789) + " tons");
        System.out.print("the square of the ring with radios 2 and 1 is =>   ");
        System.out.println(ringSquare(2, 1));
        System.out.print("Swap the values of a = 8 and b = 12 =>      ");
        swap(8, 12);
        System.out.println("123456 increasing/decreasing Sequence? => " + increasingDecreasingSequenceNumber(123456));
        System.out.println("658712 increasing/decreasing Sequence? => " + increasingDecreasingSequenceNumber(658712));
        System.out.println("654321 increasing/decreasing Sequence? => " + increasingDecreasingSequenceNumber(654321));
        System.out.println("Sum of the digits of 123456789  =>   " + sumDigits(123456789));
        System.out.println("Product of the digits of 123456789 =>  " + productDigits(123456789));
        System.out.println("Arithmetic mean of digits of 123456789 =>  " + ArithmeticMeanDigits(123456789));
        System.out.println("Geometric mean of digits of 123456789 =>   " + GeometricMeanDigits(123456789));
        System.out.println("Reverse of 123456789 =>  " + reverse(123456789));
    }

}

