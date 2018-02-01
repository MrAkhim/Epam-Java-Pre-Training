import java.util.Scanner;

class Task2_4 {
    private static int[] month31 = {1, 3, 5, 7, 8, 10, 12};
    private static int[] month30 = {4, 6, 9, 11};
    private static int day;
    private static int month;
    private static int year;

    private static boolean IsEndFebruary() {
        if (day == 28 && month == 2) {
            day = 1;
            month = 3;
            return true;
        }
        return false;
    }

    private static boolean NewYear() {
        if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
            return true;
        }
        return false;
    }

    private static boolean EndOfMonth() {
        if ((day == 31 && IsDay30_31(month, month31)) || (day == 30 && IsDay30_31(month, month30))) {
            day = 1;
            month++;
            return true;
        }
        return false;
    }

    private static boolean IsDay30_31(int month, int[] character) {
        for (int it : character) {
            if (month == it) {
                return true;
            }
        }
        return false;
    }

    private static void solution() {
        if (!IsEndFebruary() && !NewYear() && !EndOfMonth()) {
            day++;
        } else {
            IsEndFebruary();
            NewYear();
            EndOfMonth();
        }
    }

    static void print() {
        readData();
        System.out.println("\nWhat is the next day after " + day + "." + month + "." + year + " ?");
        solution();
        System.out.println("The next day is " + day + "." + month + "." + year);
    }

    private static void readData() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter your today's day: ");
        day = in.nextInt();
        System.out.println("\nEnter your today's month: ");
        month = in.nextInt();
        System.out.println("\nEnter your today's year: ");
        year = in.nextInt();
    }
}
