package TASK1;

public class Task1_7 {

    public static int reverse(int number) {
        int extra = Task1_4.reverse4(number);
        extra = extra * 10 + number / 10000 % 10;
        extra = extra * 10 + number / 100000 % 10;
        extra = extra * 10 + number / 1000000 % 10;
        return extra;
    }
}
