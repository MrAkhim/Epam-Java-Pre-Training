package Model;

import java.util.Random;

public class Coin {

    public static int countAmountHeads(int tosses) {
        int countHeads = 0;
        Random rnd = new Random();
        for (int i = 0; i < tosses; i++) {
            if (rnd.nextBoolean()) {
                countHeads++;
            }
        }
        return countHeads;
    }
}

