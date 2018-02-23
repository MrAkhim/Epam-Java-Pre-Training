package controller;

import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;
import view.View;

import static model.palindrome.Palindrome.checkPalindromeUsingStack;

public class ControllerPalindrome {
    public static void main(String[] args) throws IllegalIndexException, EmptyCollectionException {
        View.print("asdFdsa-----------> " + checkPalindromeUsingStack("asdFdsa"));
        View.print("mama amam-----------> " + checkPalindromeUsingStack("mama amam"));
        View.print("fhgtk-----------> " + checkPalindromeUsingStack("fhgtk"));
        View.print("1234321-----------> " + checkPalindromeUsingStack("1234321"));

    }
}
