package model.containers;

import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;
import exceptions.NotEqualIndexException;

interface Functional<E> {
    void add(E element) throws EmptyCollectionException;

    void remove(int index) throws IllegalIndexException, EmptyCollectionException;

    E get(int index) throws NotEqualIndexException, IllegalIndexException, EmptyCollectionException;

    int size();

    boolean isEmpty();

}