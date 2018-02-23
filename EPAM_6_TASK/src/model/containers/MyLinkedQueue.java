package model.containers;

import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;

public class MyLinkedQueue<E> extends MyLinkedList {

    public MyLinkedQueue() {
    }

    public void enqueue(E element) throws EmptyCollectionException {
        add(element);
    }

    @SuppressWarnings("unchecked")
    public E peek() throws IllegalIndexException, EmptyCollectionException {
        return (E) get(0);
    }

    @SuppressWarnings("unchecked")
    public E dequeue() throws IllegalIndexException, EmptyCollectionException {
        if (getAmountOfNodes() != 0) {
            E temp = (E) get(0);
            remove(0);
            return temp;
        } else
            throw new ArrayIndexOutOfBoundsException();

    }

}
