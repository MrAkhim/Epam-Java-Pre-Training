package TASK1;

public class Task1_3 {
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " and b = " + b);
    }

}
