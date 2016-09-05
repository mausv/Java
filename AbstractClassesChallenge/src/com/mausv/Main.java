package com.mausv;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.tranverse(list.getRoot());

        String stringData = "9 7 5 8 4 2 1 0 3 2";

        String[] data = stringData.split(" ");
        for(String s : data) {
            // Create new item with value set to the string s
            list.addItem(new Node(s));
        }

        list.tranverse(list.getRoot());
        list.removeitem(new Node("3"));
        list.tranverse(list.getRoot());
    }
}
