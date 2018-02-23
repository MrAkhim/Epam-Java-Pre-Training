package model.containers;

import exceptions.EmptyCollectionException;
import exceptions.IllegalCapacityException;
import exceptions.IllegalIndexException;

import java.util.Arrays;

public class MyArrayList<E> implements Functional {

    private int amountElements;
    protected Object[] array = new Object[0];

    protected MyArrayList() {
    }

    protected MyArrayList(int initialCapacity) throws IllegalCapacityException {
        if (initialCapacity < 0) {
            throw new IllegalCapacityException();
        }
        this.array = new Object[initialCapacity];
    }

    @SuppressWarnings("unchecked")
    public E get(int index) throws IllegalIndexException {
        if (array.length == 0) {
            throw new IllegalIndexException();
        }
        return (E) array[index];

    }

    public int getAmountElements() {
        return amountElements;
    }

    public int size() {
        return getAmountElements();
    }

    public boolean isEmpty() {
        return getAmountElements() == 0;
    }

    public boolean isFull() {
        return array.length == getAmountElements();
    }

    public void add(Object element) {
        increaseCapacity(amountElements + 1);
        array[amountElements++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > array.length) {
            throw new ArrayIndexOutOfBoundsException("");//////////////////////////////////////////////////////
        }
        increaseCapacity(amountElements + 1);
        System.arraycopy(array, index, array, index + 1, amountElements - index);
        amountElements++;
        array[index] = element;
    }

    private void increaseCapacity(int needCapacity) {
        if (needCapacity > array.length) {
            int newCapacity = array.length + (array.length / 2);
            if (newCapacity < needCapacity) {
                newCapacity = needCapacity;
            }
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public void remove(int index) throws IllegalIndexException {
        if (index < 0 || index > size()) {
            throw new IllegalIndexException();
        }
        int removeNumberAmount = amountElements - index - 1;
        if (removeNumberAmount > 0) {
            System.arraycopy(array, index + 1, array, index, removeNumberAmount);
        }
        array[--amountElements] = null;
    }

    public void clear() throws EmptyCollectionException {
        if (amountElements == 0) {
            throw new EmptyCollectionException();
        }
        for (int i = 0; i < amountElements; i++) {
            array[i] = null;
        }
        amountElements = 0;
    }

    @Override
    public String toString() {
        if (array == null) {
            return "null";
        }
        String stringArray = "";
        for (int i = 0; i < amountElements; i++) {
            stringArray += ("[" + array[i] + "]");
        }
        return stringArray;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        MyArrayList array1 = (MyArrayList) object;
        if (array.length != array1.array.length) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array1.array[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (Object myArrayListElement : array) {
            hash += hash * 31 + myArrayListElement.hashCode();
        }
        return hash;
    }

}