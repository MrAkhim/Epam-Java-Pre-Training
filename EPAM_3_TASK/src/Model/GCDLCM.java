package Model;

public class GCDLCM {
    public static int GreatestCommonDivisor(int number1, int number2) {
        if (number1 != 0) {
            return GreatestCommonDivisor(number2 % number1, number1);
        } else {
            return number2;
        }
    }

    public static int LeastCommonMultiple(int number1, int number2) {
        return ((number1 / GreatestCommonDivisor(number1, number2)) * number2);
    }
}
