package Model;

public class DragonHeadsEyes {
    private static final int CHILD_DRAGON = 200;
    private static final int YOUNG_DRAGON = 300;
    private static final int HEADS_CHILDHOOD = 3;
    private static final int HEADS_MIDDLE_AGE = 2;

    public static int amountOfHeads(int age) {
        int heads = 0;
        if (age < CHILD_DRAGON) {
            heads = age * HEADS_CHILDHOOD + HEADS_CHILDHOOD;
        } else if (age < YOUNG_DRAGON) {
            heads = CHILD_DRAGON * HEADS_CHILDHOOD - (CHILD_DRAGON - 1) * HEADS_MIDDLE_AGE + age * HEADS_MIDDLE_AGE;
        } else
            heads = CHILD_DRAGON * HEADS_CHILDHOOD + (YOUNG_DRAGON - CHILD_DRAGON) * HEADS_MIDDLE_AGE - YOUNG_DRAGON + 1 + age;
        return heads;
    }

    private static int amountOfEyes(int age) {
        return amountOfHeads(age) * 2;
    }

}
