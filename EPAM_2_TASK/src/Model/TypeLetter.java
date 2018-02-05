package Model;

import java.util.regex.Pattern;

public class TypeLetter {
    public static boolean IsVowel1(char letter) {
        letter = Character.toLowerCase(letter);
        if (letter >= 'a' && letter <= 'z') {
            return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
        }
        return false;
    }

    public static boolean IsVowel2(char letter) {
        letter = Character.toLowerCase(letter);
        if (letter >= 'a' && letter <= 'z') {
            switch (letter) {
                case 'a':
                case 'e':
                case 'y':
                case 'u':
                case 'i':
                case 'o':
                    return true;
            }
        }
        return false;
    }

    public static boolean IsVowel3(char letter) {
        letter = Character.toLowerCase(letter);
        if (letter >= 'a' && letter <= 'z') {
            return Pattern.matches("^(?i:[aeiouy]).*", Character.toString(letter));
        }
        return false;
    }

    public static boolean IsVowel4(char letter) {
        letter = Character.toLowerCase(letter);
        if (letter >= 'a' && letter <= 'z') {
            String vowels = "aeiouy";
            return vowels.indexOf(letter) != -1;
        }
        return false;
    }


}
