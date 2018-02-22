package Model;

public class Equals {

    public static boolean equalsRecursion(int N, int S) {
        if (N < 10) {
            return N == S;
        }  return equalsRecursion(N / 10, S - N % 10);
    }

    public static boolean equals(int N, int S) {
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        return S == sum;
    }
}
