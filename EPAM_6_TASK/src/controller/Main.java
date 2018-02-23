package controller;

import model.containers.*;
import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;
import view.View;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws EmptyCollectionException, IllegalIndexException {
        MyArrayStack<Integer> myArrayStack = new MyArrayStack<>();
        MyArrayQueue<Integer> myArrayQueue = new MyArrayQueue<>();
        MyLinkedQueue<Integer> myLinkedQueue = new MyLinkedQueue<>();
        MyLinkedStack<Integer> myLinkedStack = new MyLinkedStack<>();
        Random rnd = new Random();
        for (int i = 1; i <= 5; i++) {
            myArrayQueue.enqueue(i);
            myArrayStack.push(i);
            myLinkedStack.push(i);
            myLinkedQueue.enqueue(i);
        }
        try {
            View.print("\n---------------------------------------TEST OF myArrayStack ---------------------------------------------------------");
            View.print("\n" + myArrayStack.toString());
            View.print("\nPOP()----------> " + myArrayStack.pop().toString());
            View.print(myArrayStack.toString());
            int value = rnd.nextInt();
            myArrayStack.push(value);
            View.print("\nPUCH(" + value + ")----------> ");
            View.print(myArrayStack.toString());
            View.print("\nPEEK()----------> " + myArrayStack.peek().toString());


            View.print("\n---------------------------------------TEST OF myArrayQueue----------------------------------------------------------");
            View.print("\n" + myArrayQueue.toString());
            View.print("\nDEQUEUE()----------> " + myArrayQueue.dequeue().toString());
            View.print(myArrayQueue.toString());
            value = rnd.nextInt();
            myArrayQueue.enqueue(value);
            View.print("\nENQUEUE(" + value + ")----------> ");
            View.print(myArrayQueue.toString());
            View.print("\nPEEK()----------> " + myArrayQueue.peek().toString());

            View.print("\n---------------------------------------TEST OF myLinkedStack---------------------------------------------------------");
            View.print("\n" + myLinkedStack.toString());
            View.print("\nPOP()----------> " + myLinkedStack.pop().toString());
            View.print(myLinkedStack.toString());
            value = rnd.nextInt();
            myLinkedStack.push(value);
            View.print("\nPUCH(" + value + ")----------> ");
            View.print(myLinkedStack.toString());


            View.print("\n---------------------------------------TEST OF myLinkedQueue---------------------------------------------------------");
            View.print("\n" + myLinkedQueue.toString());
            View.print("\nDEQUEUE()----------> " + myLinkedQueue.dequeue().toString());
            View.print(myLinkedQueue.toString());
            value = rnd.nextInt();
            myLinkedQueue.enqueue(value);
            View.print("\nENQUEUE(" + value + ")----------> ");
            View.print(myLinkedQueue.toString());
            View.print("\nPEEK()----------> " + myLinkedQueue.peek().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}