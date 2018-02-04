import java.util.Scanner;

class PrimeDivisors {

    static void print() {
        System.out.println("Enter the number: ");
        int number = readData();
        System.out.println("Prime divisors of this number ----->" + getPrimeDivisors(number));
    }

    private static int readData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getPrimeDivisors(int number) {////////////////////////////////////////////
        String answer = "";
        if (number < 2) {
            System.out.println("This number doesn't have prime divisors");
        }
        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber(i) && number % i == 0) {
                answer += "\t" + i;
            }
        }
        return answer;
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
