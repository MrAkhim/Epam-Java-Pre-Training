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

            int key = 2;
            tree.remove(key);
            View.print("\n\n After removing key = " + key + ":\n");
            View.print("Pre-Order Detour: " + tree.passCLRDetour() + "\n");
            View.print("Post-Order Detour: " + tree.passLRCDetour() + "\n");
            View.print("In-Order Detour: " + tree.passLCRDetour() + "\n");
            View.print("Breadth-First Detour: " + tree.passBFSDetour() + "\n");

            int key1 = 5;
            View.print("Does Tree contain key = " + key + "?:   " + tree.contains(key));
            View.print("Does Tree contain key = " + key1 + "?:   " + tree.contains(key1));
            View.print("Size of the Tree = " + tree.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
