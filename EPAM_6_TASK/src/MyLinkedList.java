public class MyLinkedList<E> /*implements Iterable<E>*/ {

    private Node firstNode;
    private Node lastNode;

    private int amountOfNodes;

    private class Node {

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

    public void add(E element) {
        if (element == null) {
            throw new NullPointerException("The argument is null");
        }
        if (isEmpty()) {
            firstNode = new Node(element);
            lastNode = firstNode;
        } else {
            Node previousElement = lastNode;
            lastNode = new Node(element);
            previousElement.nextNode = lastNode;
        }
        amountOfNodes++;
    }

    @SuppressWarnings("unchecked")
    public void add(E element, int index) {
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

    public void clear() {
        Node currentElement = firstNode;
        for (int i = 0; i < amountOfNodes; i++) {
            currentElement = null;
        }
        amountOfNodes = 0;
    }

    public void remove(int index) {
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException("array index out of bound exception");
        }
        Node currentElement = firstNode;
        if (firstNode == null) {
            throw new IllegalStateException("Empty list");
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

    public void remove(E item) {
        if (isEmpty()) {
            throw new IllegalStateException("Empty list");
        }
        Node previousElement = firstNode;
        Node currentElement = firstNode;
        while (currentElement.nextNode != null || currentElement == lastNode) {
            if (currentElement.elementData.equals(item)) {
                if (amountOfNodes == 1) {
                    firstNode = null;
                    lastNode = null;
                }
                else if (currentElement.equals(firstNode)) {
                    firstNode = firstNode.nextNode;
                }
                else if (currentElement.equals(lastNode)) {
                    lastNode = previousElement;
                    lastNode.nextNode = null;
                }
                else {
                    previousElement.nextNode = currentElement.nextNode;
                }
                amountOfNodes--;
                break;
            }
            previousElement = currentElement;
            currentElement = previousElement.nextNode;
        }
    }


    public Object get(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("array index out of bound exception");
        }
        Node currentNode;
        if (firstNode != null) {
            currentNode = firstNode;
            for (int i = 0; i < index; i++) {
                if (currentNode.nextNode == null) {
                    return null;
                }
                currentNode = currentNode.nextNode;
            }
            return currentNode.getData();
        }
        return null;
    }

    public boolean containsElement(E element) {
        return indexOfElement(element) >= 0;
    }

    public int indexOfElement(E element) {
        Node currentElement = firstNode;
        for (int i = 0; i < amountOfNodes; i++) {
            if (element.equals(currentElement.elementData)) {
                return i;
            }
            currentElement = currentElement.nextNode;
        }
        return -1;
    }

/*
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node current = firstNode;

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E item = current.elementData;
            current = current.nextNode;
            return item;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    */

    @Override
    public String toString() {
        String output = "";

        if (firstNode != null) {
            Node currentNode = firstNode;
            while (currentNode != null) {
                output += "[" + currentNode.getData().toString() + "]";
                currentNode = currentNode.nextNode;
            }
        }else{
            output = "null";
        }
        return output;
    }

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("str0");
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");

        System.out.println(list.toString());
        System.out.println(list.size());
        list.remove("str3");
        System.out.println(list.toString());
        System.out.println(list.get(1));
        list.add("stringAdded", 3);
        System.out.println(list.toString());
        list.remove(4);
        System.out.println(list.toString());
        System.out.println(list.containsElement("stringAdded"));
        System.out.println(list.indexOfElement("stringAdded"));
        list.clear();
        System.out.println(list.toString());
        list.add("5");
        System.out.println(list.toString());

    }
}

