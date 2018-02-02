import java.util.Objects;
import java.util.Scanner;

class TypeLetter {
    private static String letter;

    private static String[] vowels = {"a", "e", "y", "u", "i", "o"};

    private static boolean IsVowel1(String letter) {
        String str = letter.toLowerCase();
        for (String itVowels : vowels) {
            if (Objects.equals(str, itVowels))
                return true;
        }
        return false;
    }

    private static boolean IsVowel2(String letter) {
        String str = letter.toLowerCase();
        switch (str) {
            case "a":
            case "e":
            case "y":
            case "u":
            case "i":
            case "o":
                return true;
            default:
                return false;
        }
    }

    private static boolean IsVowel3(String letter) {
        return letter.matches("^(?i:[aeiouyAEIOUY]).*");
    }


    private static boolean IsVowel4(char letter) {
        return letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' ||
                letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U';

    }

    static void print() {
        readData();
        System.out.println("\nIs letter " + letter + " is vowel or consonant? ");
        if (IsVowel1(letter) || IsVowel2(letter) || IsVowel3(letter)) {
            System.out.println("letter " + letter + " is vowel!");
        } else {
            System.out.println("letter " + letter + " is consonant!");
        }
    }

    private static void readData() {
        System.out.println("\nEnter your letter: ");
        Scanner in = new Scanner(System.in);
        letter = in.nextLine();
    }
}

