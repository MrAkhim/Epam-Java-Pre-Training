package task1;

class Dino {
    private static final int GRAM_PER_KILO = 1000;
    private static final int GRAM_PER_TONNE = 1_000_000;

    static int convectGramToKilo(int weight) {
        return weight / GRAM_PER_KILO;
    }

    static int convectGramToTonne(int weight) {
        return weight / GRAM_PER_TONNE;
    }
}
