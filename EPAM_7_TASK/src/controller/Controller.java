package controller;

import model.Tree;
import view.View;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import model.exceptions.*;

public class Controller {


    public static void main(String[] args) throws IOException, EmptyCollectionException {
        try {
            Tree<Integer> tree = new Tree<Integer>();
            Scanner sc = new Scanner(new File("C:\\EPAM_7_TASK\\files\\input.txt"));
            while (sc.hasNextInt()) {
                tree.add(sc.nextInt());
            }
            View.print("Pre-Order Detour: " + tree.passCLRDetour() + "\n");
            View.print("Post-Order Detour: " + tree.passLRCDetour() + "\n");
            View.print("In-Order Detour: " + tree.passLCRDetour() + "\n");
            View.print("Breadth-First Detour: " + tree.passBFSDetour() + "\n");

            int key = 3;
            tree.remove(key);
            View.print("\n\n After removing key without children = " + key + ":\n");
            View.print("Pre-Order Detour: " + tree.passCLRDetour() + "\n");
            View.print("Post-Order Detour: " + tree.passLRCDetour() + "\n");
            View.print("In-Order Detour: " + tree.passLCRDetour() + "\n");
            View.print("Breadth-First Detour: " + tree.passBFSDetour() + "\n");

            int key1 = 15;
            tree.remove(key1);
            View.print("\n\n After removing key with 2 children = " + key1 + ":\n");
            View.print("Pre-Order Detour: " + tree.passCLRDetour() + "\n");
            View.print("Post-Order Detour: " + tree.passLRCDetour() + "\n");
            View.print("In-Order Detour: " + tree.passLCRDetour() + "\n");
            View.print("Breadth-First Detour: " + tree.passBFSDetour() + "\n");

            int key2 = 4;
            tree.remove(key2);
            View.print("\n\n After removing key with 1 child = " + key2 + ":\n");
            View.print("Pre-Order Detour: " + tree.passCLRDetour() + "\n");
            View.print("Post-Order Detour: " + tree.passLRCDetour() + "\n");
            View.print("In-Order Detour: " + tree.passLCRDetour() + "\n");
            View.print("Breadth-First Detour: " + tree.passBFSDetour() + "\n");

            int key3 = 5;
            View.print("Does Tree contain key = " + key + "?:   " + tree.contains(key));
            View.print("Does Tree contain key = " + key3 + "?:   " + tree.contains(key3));
            View.print("Size of the Tree = " + tree.size());

            View.print("Clear the Tree  ");
            tree.clear();
            View.print("Size of the Tree = " + tree.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
