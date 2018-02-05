package Model;

public class Date {

    private static boolean IsLeapYear(int year) {
        return !(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0));
    }

    public static String countNextDate(int day, int month, int year) {
        boolean flagLastMonth = false;
        if (month == 2) {
            if ((!IsLeapYear(year) && day == 28) || (IsLeapYear(year) && day == 29)) {
                flagLastMonth = true;
            }
        } else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
        } else if (day == 31) {
            flagLastMonth = true;
        }
        if (flagLastMonth) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
        return day + "." + month + "." + year;
    }
}

