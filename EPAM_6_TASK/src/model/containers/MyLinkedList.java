package model.containers;

import exceptions.EmptyCollectionException;
import exceptions.IllegalIndexException;

public class MyLinkedList<E> implements Functional {

    private Node firstNode;
    private Node lastNode;

    private int amountOfNodes;

    class Node {

        private E elementData;
        private Node nextNode;

        public Node(E elementData) {
            this.elementData = elementData;
            this.nextNode = null;
        }

        public Object getData() {
            return elementData;
        }
    }

    public MyLinkedList() {
        firstNode = null;
        lastNode = null;
        amountOfNodes = 0;
    }

    public int getAmountOfNodes() {
        return amountOfNodes;
    }

    @SuppressWarnings("unchecked")
    public void add(Object element) throws EmptyCollectionException {
        if (element == null) {
            throw new EmptyCollectionException();
        }
        if (isEmpty()) {
            firstNode = new Node((E) element);
            lastNode = firstNode;
        } else {
            Node previousElement = lastNode;
            lastNode = new Node((E) element);
            previousElement.nextNode = lastNode;
        }
        amountOfNodes++;
    }

    @SuppressWarnings("unchecked")
    public void add(E element, int index) throws IllegalIndexException, EmptyCollectionException {
        if (element == null) {
            throw new EmptyCollectionException();
        }
        if (index < 0 || index > size()) {
            throw new IllegalIndexException();
        }
        Node currentElement = firstNode;
        Node addedElement = new Node(element);
        if (currentElement != null) {
            for (int i = 0; i < index - 1 && currentElement.nextNode != null; i++) {
                currentElement = currentElement.nextNode;
            }
        }
        assert currentElement != null;
        addedElement.nextNode = currentElement.nextNode;
        currentElement.nextNode = addedElement;
        amountOfNodes++;
    }

    public int size() {
        return amountOfNodes;
    }

    public boolean isEmpty() {
        return amountOfNodes == 0;
    }

    public void clear() throws EmptyCollectionException {
        if (amountOfNodes == 0) {
            throw new EmptyCollectionException();
        }
        Node currentElement = firstNode;
        for (int i = 0; i < amountOfNodes; i++) {
            currentElement = null;
        }
        amountOfNodes = 0;
    }

    public void remove(int index) throws EmptyCollectionException, IllegalIndexException {
        if (index < 0 || index > size()) {
            throw new IllegalIndexException();
        }
        if (index == 0) {
            firstNode = firstNode.nextNode;
            amountOfNodes--;
            return;
        }
        if (index == amountOfNodes - 1) {
            lastNode = getNode(getAmountOfNodes() - 2);
        }
        Node currentElement = firstNode;
        if (firstNode == null) {
            throw new EmptyCollectionException();
        } else {
            for (int i = 0; i < index - 1; i++) {
                if (currentElement.nextNode == null) {
                    throw new ArrayIndexOutOfBoundsException("array index out of bound exception");
                }
                currentElement = currentElement.nextNode;
            }
            currentElement.nextNode = currentElement.nextNode.nextNode;
            amountOfNodes--;

        }
    }

    public Object get(int index) throws IllegalIndexException, EmptyCollectionException {
        return getNode(index).getData();
    }

    public Node getNode(int index) throws IllegalIndexException, EmptyCollectionException {
        Node currentNode;
        if (index < 0 || index > size()) {
            throw new IllegalIndexException();
        }
        if (firstNode == null) {
            throw new EmptyCollectionException();
        } else {
            if (index == 0) {
                return firstNode;
            }
            currentNode = firstNode;
            for (int i = 0; i < index; i++) {
                if (currentNode.nextNode == null) {
                    return null;
                }
                currentNode = currentNode.nextNode;
            }

            return currentNode;
        }

    }

    public void allElements() throws IllegalIndexException, EmptyCollectionException {
        System.out.println();
        for (int i = 0; i < amountOfNodes; i++) {
            System.out.println(get(i));
        }
    }

    @Override
    public String toString() {
        String output = "";
        if (firstNode != null) {
            Node currentNode = firstNode;
            while (currentNode != null) {
                output += "[" + currentNode.getData().toString() + "]";
                currentNode = currentNode.nextNode;
            }
        } else {
            output = "null";
        }
        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyLinkedList other = (MyLinkedList) obj;
        if (this.getAmountOfNodes() != other.getAmountOfNodes()) {
            return false;
        }
        for (int i = 0; i < amountOfNodes; i++) {
            try {
                if (this.get(i) != other.get(i)) {
                    return false;
                }
            } catch (IllegalIndexException e) {
                e.printStackTrace();
            } catch (EmptyCollectionException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (int i = 0; i < amountOfNodes; i++) {
            try {
                hash += hash * 31 + this.get(i).hashCode();
            } catch (IllegalIndexException e) {
                e.printStackTrace();
            } catch (EmptyCollectionException e) {
                e.printStackTrace();
            }
        }
        return hash;
    }
}