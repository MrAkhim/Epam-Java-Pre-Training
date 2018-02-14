package Model;

public class Power {

    public static double powRecursion(double x, int n) {
        if (n != 0) {
            return x * powRecursion(x, n - 1);
        }
        return 1;
    }

    public static double pow(double x, int n) {
        double answer = 1;
        for (int i = 0; i < n; i++) {
            answer *= x;
        }
        return answer;
    }
}
