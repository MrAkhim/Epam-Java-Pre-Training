package task1;

class ReverseNumber {

    public static int reverse(int number) {
        int extra = 0;
        extra = extra * 10 + number % 10;
        extra = extra * 10 + (number /= 10) % 10;
        extra = extra * 10 + (number /= 10) % 10;
        extra = extra * 10 + (number /= 10)% 10;
        extra = extra * 10 + (number /= 10) % 10;
        extra = extra * 10 + (number /= 10) % 10;
        extra = extra * 10 + number / 10 % 10;
        return extra;
    }
}
