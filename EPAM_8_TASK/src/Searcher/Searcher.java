package Searcher;

import Model.cars.container.MyArrayList;

public class Searcher<E extends Comparable<E>> {

    public int linearSearch(MyArrayList<E> list, E key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearchIterative(MyArrayList<E> list, E key) {
        return doBinarySearchIterative(list, key, 0, list.size() - 1);
    }

    public int binarySearchRecursive(MyArrayList<E> list, E key) {
        return doBinarySearchRecursive(list, key, 0, list.size() - 1);
    }

    private int doBinarySearchIterative(MyArrayList<E> list, E key, int lowValue, int highValue) {
        int index = Integer.MAX_VALUE;
        while (lowValue <= highValue) {
            int middle = Math.round((lowValue + highValue) / 2);
            if (list.get(middle).compareTo(key) == 0) {
                index = middle;
                break;
            }else if (list.get(middle).compareTo(key) < 0) {
                lowValue = middle + 1;
            } else if (list.get(middle).compareTo(key) > 0) {
                highValue = middle - 1;
            }
        }
        return index;
    }

    private int doBinarySearchRecursive(MyArrayList<E> list, E key, int low, int high) {
        int middle = Math.round((low + high) / 2);
        if (high < low) {
            return -1;
        }
        if (key.compareTo(list.get(middle)) < 0) {
            return doBinarySearchRecursive(list, key, low, middle - 1);
        } else if (key.compareTo(list.get(middle)) == 0) {
            return middle;
        } else {
            return doBinarySearchRecursive(list, key, middle + 1, high);
        }
    }
}


