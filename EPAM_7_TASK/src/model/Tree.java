package model;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import model.exceptions.*;

public class Tree<E extends Comparable> {


    private static class Node<E extends Comparable> implements Comparable<E> {
        E key;
        Node left;
        Node right;

        Node(E key) {
            this.key = key;
        }

        @Override
        public int compareTo(E element) {
            return key.compareTo(element);
        }

        @Override
        public String toString() {
            return key.toString();
        }

        @Override
        public boolean equals(Object element) {
            if (element == null || getClass() != element.getClass()) {
                return false;
            }
            if (this == element) {
                return true;
            }
            Node<E> other = (Node<E>) element;
            return key == other.key;
        }

        @Override
        public int hashCode() {
            int hash = 1;
            hash += hash * 31 + key.hashCode();
            return hash;
        }
    }

    Node root;

    public void add(E element) {
        root = insertNode(root, element);
    }

    private Node insertNode(Node node, E element) {
        if (node == null) {
            return new Node(element);
        }
        if (element.compareTo(node.key) < 0) {
            node.left = insertNode(node.left, element);
        } else if (element.compareTo(node.key) > 0) {
            node.right = insertNode(node.right, element);
        } else {
            if (element.compareTo(node.key) == 0) {
                return node;
            }
        }
        return node;
    }

    public void clear() {
        root = null;
    }

    boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return sizeSubTree(root);
    }

    private int sizeSubTree(Node node) {
        return node == null ? 0 : 1 + sizeSubTree(node.left) + sizeSubTree(node.right);
    }

    public boolean contains(E element) throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException();
        }
        return containsNode(root, element);
    }

    private boolean containsNode(Node current, E element) {
        if (current == null) {
            return false;
        }
        if (element.compareTo(current.key) == 0) {
            return true;
        }
        return (element.compareTo(current.key) > 0) ? containsNode(current.right, element) : containsNode(current.left, element);
    }

    public StringBuffer passCLRDetour() throws IOException {
        return doCLRDetour(root, new StringBuffer(""));
    }

    public StringBuffer passLRCDetour() throws IOException {
       return doLRCDetour(root, new StringBuffer(""));
    }

    public StringBuffer passLCRDetour() throws IOException {
        return doLCRDetour(root, new StringBuffer(""));
    }

    public StringBuffer passBFSDetour() throws IOException {
       return doBFS(root,new StringBuffer(""));
    }


    //CLR(pre-order)
    StringBuffer doCLRDetour(Node node, StringBuffer treeString) {
        if (node != null) {
            treeString.append(node.key.toString()).append("   ");
            doCLRDetour(node.left, treeString);
            doCLRDetour(node.right, treeString);
        }

        return treeString;
    }

    //LRC(post-order)
    StringBuffer doLRCDetour(Node node, StringBuffer treeString) {
        if (node != null) {
            doLRCDetour(node.left, treeString);
            doLRCDetour(node.right, treeString);
            treeString.append(node.key.toString()).append("   ");
        }
        return treeString;
    }

    //RCL(in-order)
    StringBuffer doLCRDetour(Node node, StringBuffer treeString) {
        if (node != null) {
            doLCRDetour(node.left, treeString);
            treeString.append(node.key.toString()).append("   ");
            doLCRDetour(node.right, treeString);
        }
        return treeString;
    }

    StringBuffer doBFS(Node node, StringBuffer treeString) {
        Queue<Node> queue = new LinkedList<>();
        int count = size();
        do {
            treeString.append(node.key.toString()).append("   ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            if (!queue.isEmpty()) node = queue.poll();
            count--;
        } while (!queue.isEmpty() || count!=0);
    return treeString;
    }


    private E minNode(Node node) {
        if (node.left == null) {
            return (E) node.key;
        }
        return minNode(node.left);
    }

    private E maxNode(Node node) {
        if (node.left == null) {
            return (E) node.key;
        }
        return maxNode(node.right);
    }

    public void remove(E key) {
        root = deleteNode(root, key);
    }

    private Node deleteNode(Node root, E element) {
        if (root == null) {
            return null;
        }
        if (element.compareTo(root.key) < 0) {
            root.left = deleteNode(root.left, element);
            return root;
        } else if (element.compareTo(root.key) > 0) {
            root.right = deleteNode(root.right, element);
            return root;
        }
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            root.key = minNode(root.right);
            root.right = deleteNode(root.right, (E) root.key);
            return root;
        }
    }

    private ArrayList<E> transformNodesToList(){
        return transformNodesToList(root, new ArrayList<E>());
    }

    private ArrayList<E> transformNodesToList(Node node, ArrayList<E> arrayList) {
        if (node != null) {
            transformNodesToList(node.left, arrayList);
            arrayList.add((E)node.key);
            transformNodesToList(node.right, arrayList);
        }
        return arrayList;
    }

    @Override
    public String toString() {
        return transformNodesToList().toString();
    }

    @Override
    public boolean equals(Object element) {
        if (element == null || getClass() != element.getClass()){
            return false;
        }
        if (this == element){
            return true;
        }
        Tree<E> otherTree = (Tree<E>)element;
        ArrayList<E> arrayList = transformNodesToList();
        ArrayList<E> otherArrayList = otherTree.transformNodesToList();
        if (arrayList.size() != otherArrayList.size()){
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++){
            if (otherArrayList.get(i) != arrayList.get(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        ArrayList<E> arrayList = transformNodesToList();
        for (E element : arrayList){
            hash += hash * 31 + arrayList.hashCode();
        }
        return hash;
    }
}
