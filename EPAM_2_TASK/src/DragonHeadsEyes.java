import java.util.Scanner;

class DragonHeadsEyes {
    private static final int CHILD_DRAGON = 200;
    private static final int YOUNG_DRAGON = 300;
    private static final int HEADS_CHILDHOOD = 3;
    private static final int HEADS_MIDDLE_AGE = 2;


    private static int age;

    private static int amountOfHeads(int age) {
        if (age < CHILD_DRAGON) {
            return (age + 1) * HEADS_CHILDHOOD;
        } else if (age < YOUNG_DRAGON) {
            return CHILD_DRAGON * HEADS_CHILDHOOD + (age - (CHILD_DRAGON - 1)) * HEADS_MIDDLE_AGE;
        } else
            return CHILD_DRAGON * HEADS_CHILDHOOD + (YOUNG_DRAGON - CHILD_DRAGON) * HEADS_MIDDLE_AGE + (age - (YOUNG_DRAGON - 1));
    }

    private static int amountOfEyes(int age) {
        return amountOfHeads(age) * 2;
    }

    static void print() {
        readData();
        System.out.println("\nHow much heads and eyes has a dragon, whose age is " + age + "?");
        System.out.println("The amount of heads of " + age + "-aged dragon is " + amountOfHeads(age));
        System.out.println("The amount of eyes of " + age + "-aged dragon is " + amountOfEyes(age));
    }

    private static void readData() {
        System.out.println("\nEnter the age of your dragon: ");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
    }
}
