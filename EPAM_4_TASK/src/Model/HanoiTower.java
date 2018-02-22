package Model;

import java.util.Stack;

public class HanoiTower {

    private static String answerRecursive = "";
    public static String answer = "";
    private static Stack[] stacks = new Stack[3];

    public static String calcHanoiTowerActionRecursion(int rings, char fromPosition, char toPosition, char middleBufferPosition) {
        if (rings == 1) {
            answerRecursive += "\n" + fromPosition + " -> " + toPosition;
        } else if (rings > 1) {
            calcHanoiTowerActionRecursion(rings - 1, fromPosition, middleBufferPosition, toPosition);
            answerRecursive += "\n" + fromPosition + " -> " + toPosition;
            calcHanoiTowerActionRecursion(rings - 1, middleBufferPosition, toPosition, fromPosition);
        }
        return answerRecursive;
    }

    public static void calcHanoiTowerAction(int rings, int fromPosition, int toPosition, int middlePosition) {
        stacks[0] = new Stack<Integer>();
        for (int i = rings; i > 0; i--) {
            stacks[0].add(i);
        }
        stacks[1] = new Stack<>();
        stacks[2] = new Stack<>();
        int value = 1;
        while (value < Math.pow(2, rings)) {
            fromPosition = (value & (value - 1)) % 3;
            toPosition = ((value | (value - 1)) + 1) % 3;
            Object number = stacks[fromPosition].pop();
            stacks[toPosition].add(number);
            answer += "\n" + convertNumberToLetter(fromPosition) + " -> " + convertNumberToLetter(toPosition);

            value += 1;
        }
    }


    private static char convertNumberToLetter(int number) {
        char name = '\0';
        switch (number) {
            case 0:
                name = 'A';
                break;
            case 1:
                name = 'C';
                break;
            case 2:
                name = 'B';
                break;
        }
        return name;
    }


}
