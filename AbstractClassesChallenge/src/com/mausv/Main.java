package com.mausv;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.tranverse(tree.getRoot());

        String stringData = "9 7 5 8 4 2 1 0 3 2";

        String[] data = stringData.split(" ");
        for(String s : data) {
            // Create new item with value set to the string s
            tree.addItem(new Node(s));
        }

        tree.tranverse(tree.getRoot());
        tree.removeitem(new Node("3"));
        tree.tranverse(tree.getRoot());
    }
}
