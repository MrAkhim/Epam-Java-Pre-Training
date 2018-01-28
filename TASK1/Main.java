public class Main {

    public static double dinosaurWeightKilogram(int weight) {
        return weight / 1000.0;
    }

    public static double dinosaurWeightTon(int weight) {
        return weight / 1000000.0;
    }

    public static double ringSquare(double R1, double R2) {
        return Math.PI * (R1 * R1) - Math.PI * (R2 * R2);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "  " + b);
    }

    public static boolean increasingSequanceNumber(int number) {
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


    public static int sumDigits(int number) {
        int sum = 0;
        while (number % 10 != 0) {
            int m = number % 10;
            sum += m;
            number /= 10;
        }
        return sum;
    }

    public static int productDigits(int number) {
        int product = 1;
        while (number % 10 != 0) {
            int m = number % 10;
            product *= m;
            number /= 10;
        }
        return product;
    }

    public static double SrArifm(int number) {
        int answer = sumDigits(number) / amountDigits(number);
        return answer;
    }

    public static double SrGeometr(int number) {
        return Math.pow(productDigits(number), 1.0 / amountDigits(number));
    }

    public static int amountDigits(int number) {
        int count = 1;
        while (number / 10 != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int reverse(int number) {
        int extra = 0;
        while (number != 0) {
            extra = extra * 10 + number % 10;
            number /= 10;
        }
        return extra;
    }

    public static void main(String[] args) {
        System.out.println(dinosaurWeightKilogram(12345) + "  " + dinosaurWeightTon(12345));
        System.out.println(ringSquare(2, 1));
        swap(8, 12);
        System.out.println(increasingSequanceNumber(123456));
        System.out.println(increasingSequanceNumber(654321));
        System.out.println(sumDigits(123456789) + "  " + productDigits(123456789));
        System.out.println(SrArifm(123456789) + "   " + SrGeometr(123456789));
        System.out.println(reverse(123456789));
    }

}
