package Controller;
import View.View;
import Model.*;

public class Controller {
    public static void main(String[] args) {
        printCoins();
        printAmountDifferentDigits();
        printGCDLCM();
        printMaxDigit();
        printPalindrome();
        printPerfectNumber();
        printPrimeDivisors();
        printPrimeNumber();
    }

    private static void printCoins() {
        View.print("\nif there are 1000 tosses -----> " +Model.Coin.countAmountHeads() + " are heads");
    }

    private static void printAmountDifferentDigits() {
        int number = 100557294;
        View.print("\nif number is 100557294, amount of different digits is " +Model.DifferentDigitsNumber.countDifferentDigits(number) + " are heads");
    }

    private static void printGCDLCM() {
        int number1 = 36;
        int number2 = 24;
        View.print("\nThe Greatest Common Divisor of numbers 36 and 24 -----> " +Model.GCDLCM.GreatestCommonDivisor(number1,number2));
        View.print("The Least Common Multiple of numbers 36 and 24 -----> " +Model.GCDLCM.LeastCommonMultiple(number1,number2));
    }

    private static void printMaxDigit() {
        int number = 1254680;
        View.print("\nMax Digit of your number 1254680 -----> " + Model.MaxDigit.getMaxDigitNumber(number));
    }

    private static void printPalindrome() {
        int number1 = 1230321;
        int number2 = 31254;
        View.print("\nNumber 1230321 is Palindrome? -----> " + Model.Palindrome.isPalindromeNumber(number1));
        View.print("Number 31254 is Palindrome? -----> " + Model.Palindrome.isPalindromeNumber(number2));
    }

    private static void printPerfectNumber() {
        int number1 = 122;
        int number2 = 28;
        View.print("\nNumber 122 is Perfect? -----> " + Model.PerfectNumber.isPerfectNumber(number1));
        View.print("Number 28 is Perfect? -----> " + Model.PerfectNumber.isPerfectNumber(number2));
    }
    private static void printPrimeDivisors() {
        int number1 = 1122;
        View.print("\nPrime divisors of number 1122  ----->" + Model.PrimeDivisors.getPrimeDivisors(number1));
    }

    private static void printPrimeNumber() {
        int number1 = 1122;
        int number2 = 11;
        View.print("\nIs number 1122 Prime?  ----->" + Model.PrimeNumber.isPrimeNumber(number1));
        View.print("Is number 11 Prime?  ----->" + Model.PrimeNumber.isPrimeNumber(number2));
    }



}
