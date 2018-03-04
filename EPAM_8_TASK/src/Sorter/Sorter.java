package Sorter;

import Model.cars.container.MyArrayList;

public class Sorter<E extends Comparable<E>> {
    public MyArrayList bubbleSort(MyArrayList<E> list) {
        E temp;
        if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }
        return list;
    }

    public MyArrayList<E> insertionSort(MyArrayList<E> list) {
        for (int i = 1; i < list.size(); i++) {
            E key = list.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (key.compareTo(list.get(j)) < 0) {
                    list.set(j + 1, list.get(j));
                    if (j == 0) {
                        list.set(0, key);
                    }
                } else {
                    list.set(j + 1, key);
                    break;
                }
            }
        }
        return list;
    }

    public MyArrayList<E> selectionSort(MyArrayList<E> list) {
        for (int i = 1; i < list.size(); i++) {
            E smallElem = list.get(i - 1);
            int smallIntIndex = i - 1;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j).compareTo(smallElem) < 0) {
                    smallElem = list.get(j);
                    smallIntIndex = j;
                }
            }
            E temp = list.get(i - 1);
            list.set(i - 1, list.get(smallIntIndex));
            list.set(smallIntIndex, temp);
        }
        return list;
    }

    public MyArrayList mergeSort(MyArrayList<E> whole) {
        MyArrayList<E> left = new MyArrayList<E>();
        MyArrayList<E> right = new MyArrayList<E>();
        if (whole.size() == 1) {
            return whole;
        } else {
            int middle = whole.size() / 2;
            for (int i = 0; i < middle; i++) {
                left.add(whole.get(i));
            }
            for (int i = middle; i < whole.size(); i++) {
                right.add(whole.get(i));
            }
            left = mergeSort(left);
            right = mergeSort(right);
            merge(left, right, whole);
        }
        return whole;
    }

    private void merge(MyArrayList<E> left, MyArrayList<E> right, MyArrayList<E> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ((left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }
        MyArrayList<E> otherList;
        int restIndex;
        if (leftIndex >= left.size()) {
            otherList = right;
            restIndex = rightIndex;
        } else {
            otherList = left;
            restIndex = leftIndex;
        }
        for (int i = restIndex; i < otherList.size(); i++) {
            whole.set(wholeIndex, otherList.get(i));
            wholeIndex++;
        }
    }

    public MyArrayList<E> quickSort(MyArrayList<E> list) {
        if (list.size() <= 1) {
            return list;
        }
        int middle = (int) Math.ceil((double) list.size() / 2);
        E middleValue = list.get(middle);
        MyArrayList<E> less = new MyArrayList<E>();
        MyArrayList<E> greater = new MyArrayList<E>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(middleValue) <= 0) {
                if (i == middle) {
                    continue;
                }
                less.add(list.get(i));
            } else {
                greater.add(list.get(i));
            }
        }

        return concatenate(quickSort(less), middleValue, quickSort(greater));
    }

    public MyArrayList concatenate(MyArrayList<E> less, E pivot, MyArrayList<E> greater) {

        MyArrayList<E> list = new MyArrayList<E>();

        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }

        list.add(pivot);

        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }

        return list;
    }
}
