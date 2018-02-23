package model.containers;

import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;

public class MyArrayStack<E> extends MyArrayList {
    public MyArrayStack() {
    }

    public void push(E element) {
        add(element);
    }

    @SuppressWarnings("unchecked")
    public E peek() throws IllegalIndexException {
        return (E) get(getAmountElements() - 1);
    }

    @SuppressWarnings("unchecked")
    public E pop() throws EmptyCollectionException, IllegalIndexException {
        if (array.length != 0) {
            E deletedElement = (E) array[getAmountElements() - 1];
            remove(getAmountElements() - 1);
            return deletedElement;
        } else
            throw new EmptyCollectionException();
    }

}