package Model;

public class PrimeDivisors {
    public static String getPrimeDivisors(int number) {////////////////////////////////////////////
        String answer = "";
        if (number < 2) {
            answer = "This number doesn't have prime divisors";
        }
        int conditionValue = number / 2;
        for (int i = 2; i <= conditionValue; i++) {
            if (checkPrimeNumber(i) && number % i == 0) {
                answer += "\t" + i;
            }
        }
        return answer;
    }

    private static boolean checkPrimeNumber(int number) {
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
