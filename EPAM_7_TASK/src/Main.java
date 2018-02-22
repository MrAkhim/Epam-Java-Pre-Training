import java.io.*;
import java.util.Scanner;

class Tree {
    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    Node root;

    void insert(int x) {
        root = doInsert(root, x);
    }

    private static Node doInsert(Node node, int x) {
        if (node == null) {
            return new Node(x);
        }
        if (x < node.key) {
            node.left = doInsert(node.left, x);
        } else if (x > node.key) {
            node.right = doInsert(node.right, x);
        } else {
            if (x == node.key) {
                return node;
            }
        }
        return node;
    }

    void LeftDetour() throws IOException {
        PrintStream ps = new PrintStream("output.txt");
        doLeftDetour(root, ps);
        ps.flush();
        ps.close();
    }

    void doLeftDetour(Node node, PrintStream ps) throws IOException {
        if (node != null) {
            Integer value = node.key;
            ps.println(value.toString());
            doLeftDetour(node.left, ps);
            doLeftDetour(node.right, ps);
        }
    }

    private int minNode(Node node) {
        if (node.left == null) {
            return node.key;
        }
        return minNode(node.left);
    }

    void deleteInTree(int key) {
        root = delete(root, key);
    }

    private Node delete(Node root, int key) {
        if (root == null) return null;
        if (key < root.key) {
            root.left = delete(root.left, key);
            return root;
        } else if (key > root.key) {
            root.right = delete(root.right, key);
            return root;
        }
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            root.key = minNode(root.right);
            root.right = delete(root.right, root.key);
            return root;
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        Tree tree = new Tree();
        Scanner sc = new Scanner(new File("C:\\EPAM_7_TASK\\files\\input.txt"));
        Integer key = sc.nextInt();
        sc.nextLine();
        while (sc.hasNextInt()) {
            tree.insert(sc.nextInt());
        }
        tree.deleteInTree(key);
        tree.LeftDetour();
        sc.close();
    }
}