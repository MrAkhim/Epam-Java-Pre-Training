package Model;

import java.util.Random;

public class MoodScanner {
    private static final int MOOD_VARIANTS = 10;

    public static String moodScale() {
        Random rnd = new Random();
        int value = rnd.nextInt(MOOD_VARIANTS);
        String moodAnswer = "";
        switch (value) {
            case 0:
                moodAnswer = "\t(｡╯︵╰｡)\tsadness";
                break;

            case 1:
                moodAnswer = "\t(×﹏×)\tdistress";
                break;

            case 2:
                moodAnswer = "\t┐(￣～￣)┌\tapathy";
                break;
            case 3:
                moodAnswer = "\t(o_O)!\tsurprise ";
                break;

            case 4:
                moodAnswer = "\t٩(╬ʘ益ʘ╬)۶\tangriness";
                break;

            case 5:
                moodAnswer = "\tヾ( ￣O￣)ツ\tcomplaint";
                break;

            case 6:
                moodAnswer = "\t(っ´ω`)ﾉ(╥ω╥)\tcompassion";
                break;

            case 7:
                moodAnswer = "\t(*/_＼)\tconfusion";
                break;
            case 8:
                moodAnswer = "\t( ˘⌣˘)♡(˘⌣˘ )\tlove";
                break;
            case 9:
                moodAnswer = "\tヽ(・∀・)ﾉ\tenjoyment";
                break;
        }
        return moodAnswer;
    }
}
