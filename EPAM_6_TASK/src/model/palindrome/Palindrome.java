package model.palindrome;

import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;
import model.containers.MyArrayStack;


public class Palindrome {

    public static boolean checkPalindromeUsingStack(String string) throws IllegalIndexException, EmptyCollectionException {
        String palindromeString = "";
        String answer = "";
        MyArrayStack<Character> stack = new MyArrayStack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        while (!stack.isEmpty()) {
            palindromeString = palindromeString + stack.pop();
        }
        return string.equals(palindromeString);
    }
}
