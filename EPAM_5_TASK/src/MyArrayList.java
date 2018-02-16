import java.util.Arrays;

public class MyArrayList<X> {
    private static final int INITIAL_CAPACITY = 10;
    private int amountElements;
    private static final Object[] EMPTY_ARRAY = {};


    private Object[] myArrayListElements = new Object[INITIAL_CAPACITY];

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.myArrayListElements = new Object[initialCapacity];
    }

    public MyArrayList() {
        this.myArrayListElements = EMPTY_ARRAY;
    }

    public int size() {
        return amountElements;
    }

    public boolean isEmpty() {
        return amountElements == 0;
    }

    public void add(X element) {
        increaseCapacity(amountElements + 1);
        myArrayListElements[amountElements++] = element;
    }

    public void add(int index, X element) {
        increaseCapacity(amountElements + 1);
        System.arraycopy(myArrayListElements, index, myArrayListElements, index + 1, amountElements - index);
        amountElements++;
        myArrayListElements[index] = element;
    }

    private void increaseCapacity(int needCapacity) {
        if (needCapacity - myArrayListElements.length > 0) {
            int newCapacity = myArrayListElements.length + (myArrayListElements.length / 2);
            if (newCapacity - needCapacity < 0) {
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
        if (index >= amountElements) {
            throw new ArrayIndexOutOfBoundsException("array index out of bound exception with index at" + index);
        }
        return (X) myArrayListElements[index];
    }

    @SuppressWarnings("unchecked")
    public void remove(int index) {
        X deletedElement = (X) myArrayListElements[index];
        int removeNumber = amountElements - index - 1;
        if (removeNumber > 0) {
            System.arraycopy(myArrayListElements, index + 1, myArrayListElements, index, removeNumber);
        }
        myArrayListElements[--amountElements] = null;
    }

    public boolean containsElement(X element) {
        return indexOfElement(element) >= 0;
    }

    public int indexOfElement(X element) {
            for (int i = 0; i < amountElements; i++) {
                if (element.equals(myArrayListElements[i])) {
                    return i;
                }
            }
        return -1;
    }

    public void print() {
        for (int i = 0; i < amountElements; i++) {
            System.out.println(myArrayListElements[i]);
        }
    }

    public static void main(String[] args) {
        MyArrayList<String> strList = new MyArrayList<>();
        strList.add("str0");
        strList.add("str1");
        strList.add("str2");
        strList.add("str3");
        strList.add("str4");
        strList.add("str5");
        strList.add("str6");
        strList.add("str7");
        System.out.println("\n"+ strList.size());
        strList.print();
        System.out.println("");
        strList.remove(5);
        strList.print();
        strList.add(4, "str111111111111");
        strList.add(0, "str0000");
        System.out.println("");
        strList.print();
        System.out.println("    " + strList.get(6));
        System.out.println("-----> " + strList.containsElement("str1") );
        System.out.println("-----> " + strList.containsElement("str14253525") );

    }
}