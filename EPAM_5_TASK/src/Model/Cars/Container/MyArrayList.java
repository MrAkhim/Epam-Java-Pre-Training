package Model.Cars.Container;

import Model.Cars.Automobile.Automobile;

import java.util.Arrays;

public class MyArrayList<X> {
    private static final int INITIAL_CAPACITY = 10;
    private static final Object[] EMPTY_ARRAY = {};

    private int amountElements;
    private Object[] myArrayListElements = new Object[INITIAL_CAPACITY];

    public MyArrayList() {
        this.myArrayListElements = EMPTY_ARRAY;
    }

    @SafeVarargs
    protected  MyArrayList(X... elements) {
        this.myArrayListElements = new Object[elements.length];
        System.arraycopy(elements, 0, myArrayListElements, 0, elements.length);
        amountElements = myArrayListElements.length;
    }

    protected MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.myArrayListElements = new Object[initialCapacity];
    }

    public int size() {
        return amountElements;
    }

    protected boolean isEmpty() {
        return amountElements == 0;
    }

    public void add(X element) {
        increaseCapacity(amountElements + 1);
        myArrayListElements[amountElements++] = element;
    }

    @SafeVarargs
    protected final void add(Automobile... elements) {
        for (int i = 0; i < elements.length; i++) {
            increaseCapacity(amountElements + 1);
            myArrayListElements[amountElements + i] = elements[i];
        }
    }

    public void add(int index, X element) {
        if (index < 0 || index > myArrayListElements.length) {
            throw new ArrayIndexOutOfBoundsException("");//////////////////////////////////////////////////////
        }
        increaseCapacity(amountElements + 1);
        System.arraycopy(myArrayListElements, index, myArrayListElements, index + 1, amountElements - index);
        amountElements++;
        myArrayListElements[index] = element;
    }

    private void increaseCapacity(int needCapacity) {
        if (needCapacity > myArrayListElements.length) {
            int newCapacity = myArrayListElements.length + (myArrayListElements.length / 2);
            if (newCapacity < needCapacity) {
                newCapacity = needCapacity;
            }
            myArrayListElements = Arrays.copyOf(myArrayListElements, newCapacity);
        }
    }

   public void clear() {
        for (int i = 0; i < amountElements; i++) {
            myArrayListElements[i] = null;
        }
        amountElements = 0;
    }

    @SuppressWarnings("unchecked")
    public X get(int index) {
        if (index >= amountElements || index < 0) {
            throw new ArrayIndexOutOfBoundsException("array index out of bound exception");
        }
        return (X) myArrayListElements[index];
    }

    @SuppressWarnings("unchecked")
    public void remove(int index) {

        int removeNumberAmount = amountElements - index - 1;
        if (removeNumberAmount > 0) {
            System.arraycopy(myArrayListElements, index + 1, myArrayListElements, index, removeNumberAmount);
        }
        myArrayListElements[--amountElements] = null;
    }

    public boolean containsElement(X element) {
        return indexOfElement(element) >= 0;
    }

    protected  int indexOfElement(X element) {
        for (int i = 0; i < amountElements; i++) {
            if (element.equals(myArrayListElements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if (myArrayListElements == null) {
            return "null";
        }
        String stringArray = "";
        for (int i = 0; i < amountElements; i++) {
            stringArray += ("{" + myArrayListElements[i] + "} \n");
        }
        return stringArray;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        MyArrayList array1 = (MyArrayList) object;
        if (myArrayListElements.length != array1.myArrayListElements.length) {
            return false;
        }
        for (int i = 0; i < myArrayListElements.length; i++) {
            if (myArrayListElements[i] != array1.myArrayListElements[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (Object myArrayListElement : myArrayListElements) {
            hash += hash * 31 + myArrayListElement.hashCode();
        }
        return hash;
    }


}