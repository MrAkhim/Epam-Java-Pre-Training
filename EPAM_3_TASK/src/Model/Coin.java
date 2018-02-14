package Model;

import java.util.Random;

public class Coin {

    private static final int TOSSES = 1000;

    public static int countAmountHeads() {
        int countHeads = 0;
        Random rnd = new Random();
        for (int i = 0; i < TOSSES; i++) {
            if (rnd.nextBoolean()) {
                countHeads++;
            }
        }
        return countHeads;
    }
}

