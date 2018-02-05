package Controller;

import View.View;

public class Controller {
    public static void main(String[] args) {
        printDragonHeadsEyes();
        printDate();
        printMoodScanner();
        printTextNumber();
        printTypeLetter();
    }

    private static void printDragonHeadsEyes() {
        int age0 = 14;
        int age1 = 201;
        int age2 = 301;
        View.print("\nThe amount of eyes of " + age0 + "-aged dragon -----> " + Model.DragonHeadsEyes.amountOfHeads(age0));
        View.print("The amount of heads of " + age1 + "-aged dragon ----->" + Model.DragonHeadsEyes.amountOfHeads(age1));
        View.print("The amount of eyes of " + age2 + "-aged dragon -----> " + Model.DragonHeadsEyes.amountOfHeads(age2));
    }

    private static void printDate() {
        int day = 29;
        int month = 2;
        int year = 2016;
        String str = day + "." + month + "." + year;
        View.print("\nThe next day after " + str + " -----> " + Model.Date.countNextDate(day, month, year));
    }

    private static void printMoodScanner() {
        View.print("\nMOOD SCANNER");
        View.print("Your mood -----> " + Model.MoodScanner.moodScale());
    }

    private static void printTextNumber() {
        int number = 111;
        View.print("\nThe text equivalent of " + number + " -----> " + Model.TextNumber.textThirdDigit(number));
    }

    private static void printTypeLetter() {
        char letter1 = 'A';
        char letter2 = '0';
        char letter3 = 'u';
        char letter4 = 'H';
        char letter5 = 'f';
        View.print("\nIs letter " + letter1 + " is vowel? -----> " + Model.TypeLetter.IsVowel1(letter1));
        View.print("Is letter " + letter2 + " is vowel? -----> " + Model.TypeLetter.IsVowel1(letter2));
        View.print("Is letter " + letter3 + " is vowel? -----> " + Model.TypeLetter.IsVowel1(letter3));
        View.print("Is letter " + letter4 + " is vowel? -----> " + Model.TypeLetter.IsVowel1(letter4));
        View.print("Is letter " + letter5 + " is vowel? -----> " + Model.TypeLetter.IsVowel1(letter5));
    }


}

