package Controller;

import Model.*;
import View.View;

public class Controller {
    public static void main(String[] args) {
        printEquals();
        printFibonacciNumbers();
        printHanoiTower();
        printPower();
        printSumDigits();
    }

    private static void printEquals() {
        View.print("\n Test of Recursive and Non-recursive method equals(int N, int S): ");
        int N = 1234567;
        int S = 28;
        View.print("Values -----> " + N + ", " + S);
        View.print("Recursive method -----> " + Equals.equalsRecursion(N, S));
        View.print("Non-recursive method ----->  " + Equals.equals(N, S));
        N = 1111;
        S = 7;
        View.print("Values -----> " + N + ", " + S);
        View.print("Recursive method ----->  " + Equals.equalsRecursion(N, S));
        View.print("Non-recursive method ----->  " + Equals.equals(N, S));
    }

    private static void printFibonacciNumbers() {
        View.print("\n\nTest of Recursive and Non-recursive method of identification of Fibonacci numbers:");
        int number = -1;
        View.print("Value -----> " + number);
        View.print("Recursive method -----> " + FibonacciNumber.identifyFibonacciNumberRecursion(number));
        View.print("Non-recursive method ----->  " + FibonacciNumber.identifyFibonacciNumber(number));
        number = 0;
        View.print("Value ----->  " + number);
        View.print("Recursive method -----> " + FibonacciNumber.identifyFibonacciNumberRecursion(number));
        View.print("Non-recursive method ----->  " + FibonacciNumber.identifyFibonacciNumber(number));
        number = 1;
        View.print("Value -----> " + number);
        View.print("Recursive method -----> " + FibonacciNumber.identifyFibonacciNumberRecursion(number));
        View.print("Non-recursive method ----->  " + FibonacciNumber.identifyFibonacciNumber(number));
        number = 2;
        View.print("Value -----> " + number);
        View.print("Recursive method -----> " + FibonacciNumber.identifyFibonacciNumberRecursion(number));
        View.print("Non-recursive method ----->  " + FibonacciNumber.identifyFibonacciNumber(number));
        number = 10;
        View.print("Value -----> " + number);
        View.print("Recursive method -----> " + FibonacciNumber.identifyFibonacciNumberRecursion(number));
        View.print("Non-recursive method ----->  " + FibonacciNumber.identifyFibonacciNumber(number));

    }

    private static void printHanoiTower() {
        View.print("\n\nTest of Recursive and Non-recursive method of calculation amount of action Hanoi Tower:");
        int amountRings = 3;
        View.print("Value -----> " + amountRings);
        View.print("Recursive method -----> " + HanoiTower.calcHanoiTowerActionRecursion(amountRings, 'A', 'B', 'C'));
        HanoiTower.calcHanoiTowerAction(amountRings, 'A', 'B', 'C');
        View.print("Non-recursive method ----->  " + HanoiTower.answer);
    }

    private static void printPower() {
        View.print("\n\nTest of Recursive and Non-recursive method of calculation pow(int x, int n): ");
        double x = 2;
        int n = 3;
        View.print("Value -----> " + x + "\t" + n);
        View.print("Recursive method -----> " + Power.powRecursion(x, n));
        View.print("Non-recursive method ----->  " + Power.pow(x, n));
    }

    private static void printSumDigits() {
        View.print("\n\nTest of Recursive and Non-recursive method of calculation sum of Digits of number: ");
        int number = 12345;
        View.print("Value -----> " + number);
        View.print("Recursive method -----> " + SumDigits.sumDigitsRecursion(number));
        View.print("Non-recursive method ----->  " + SumDigits.sumDigits(number));
    }
}
