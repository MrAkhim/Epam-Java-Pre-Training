import java.util.Objects;
import java.util.Scanner;

class MoodScanner {

    private static int value;

    private static void randomMood(int a, int b) {
        value = a + (int) (Math.random() * b);
    }

    private static String moodScale() {
        randomMood(1, 10);
        System.out.print("The number is " + value);
        switch (value) {
            case 1:
                return "\t(｡╯︵╰｡)\tsadness";

            case 2:
                return "\t(×﹏×)\tdistress";

            case 3:
                return "\t┐(￣～￣)┌\tapathy";

            case 4:
                return "\t(o_O)!\tsurprise ";


            case 5:
                return "\t٩(╬ʘ益ʘ╬)۶\tangriness";


            case 6:
                return "\tヾ( ￣O￣)ツ\tcomplaint";


            case 7:
                return "\t(っ´ω`)ﾉ(╥ω╥)\tcompassion";


            case 8:
                return "\t(*/_＼)\tconfusion";


            case 9:
                return "\t( ˘⌣˘)♡(˘⌣˘ )\tlove";

            case 10:
                return "\tヽ(・∀・)ﾉ\tenjoyment";

            default:
                return "";

        }
    }

    static void print() {
        if (Objects.equals(readData(), "Y")) {
            System.out.println("\nWhat is your emotional condition? ");
            System.out.println(" so your mood is " + moodScale());
        } else {
            System.out.println("Okay, GOOD LUCK!!!");
        }
    }

    private static String readData() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nDo you want to use MOOD SCANNER?");
        System.out.print("Type Y(YES) or N(NO):");
        return in.nextLine();
    }
}
