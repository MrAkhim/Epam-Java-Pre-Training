package Model;

import java.util.Random;

public class Coin {

    private static final int TOSSES = 1000;


    private static boolean getRandomNumber() {
        Random rnd = new Random();
        return rnd.nextBoolean();

    }

    public static int countAmountHeads() {
        int countHeads = 0;
        for (int i = 0; i < TOSSES; i++) {
            if (!getRandomNumber()) {
                countHeads++;
            }
        }
        return countHeads;
    }

    private static int countAmountTails(int amountHeads) {
        return TOSSES - amountHeads;
    }

}

