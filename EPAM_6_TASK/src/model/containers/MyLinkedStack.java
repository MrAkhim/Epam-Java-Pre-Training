package model.containers;

import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;

public class MyLinkedStack<E> extends MyLinkedList {
    public MyLinkedStack() {

    }

    public void push(E t) throws EmptyCollectionException, IllegalIndexException {
        add(t);

    }

    @SuppressWarnings("unchecked")
    public E peek() throws IllegalIndexException, EmptyCollectionException {
        return (E) get(getAmountOfNodes() - 2);
    }

    @SuppressWarnings("unchecked")
    public E pop() throws IllegalIndexException, EmptyCollectionException {
        if (getAmountOfNodes() != 0) {
            E deletedElement = (E) get(getAmountOfNodes() - 1);
            remove(getAmountOfNodes() - 1);
            return deletedElement;
        } else
            throw new ArrayIndexOutOfBoundsException();
    }


}
