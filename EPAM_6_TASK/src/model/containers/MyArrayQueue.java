package model.containers;

//import model.exceptions.MyQueueIsEmptyException;

import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;

public class MyArrayQueue<E> extends MyArrayList {

    public MyArrayQueue() {
    }

    public void enqueue(E t) {
        add(t);
    }

    @SuppressWarnings("unchecked")
    public E peek() throws IllegalIndexException {
        return (E) get(0);
    }

    @SuppressWarnings("unchecked")
    public E dequeue() throws EmptyCollectionException, IllegalIndexException {
        if (array.length == 0) {
            throw new EmptyCollectionException();
        } else {
            E temp = (E) array[0];
            remove(0);
            return temp;
        }
    }

}