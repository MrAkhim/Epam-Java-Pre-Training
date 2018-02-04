import java.util.Random;

class Coin {

    private static final int TOSSES = 1000;
    private static final int HEADS = 0;


    private static int getRandomNumber() {
        Random rnd = new Random();
        return rnd.nextInt(2);

    }

    private static int countAmountHeads() {
        int countHeads = 0;
        for (int i = 0; i < TOSSES; i++) {
            if (getRandomNumber() == HEADS) {
                countHeads++;
            }
        }
        return countHeads;
    }

    private static int countAmountTails(int amountHeads) {
        return TOSSES - amountHeads;
    }

    static void print() {
        int amountHeads = countAmountHeads();
        int amountTails = countAmountTails(amountHeads);
        System.out.println("if there are 1000 tosses -----> " + amountHeads + " are heads, and " + amountTails + " are tails");
    }


}
