package com.mausv;

/**
 * Created by mausv on 9/4/2016.
 */
public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public int compareTo(ListItem objectToCompare) {
        if(objectToCompare != null) {
            return ((String) super.getValue()).compareTo((String) objectToCompare.getValue());
        } else {
            return -1;
        }
    }

    @Override
    public ListItem previous() {
        return this.previousItem;
    }

    @Override
    public ListItem next() {
        return this.nextItem;
    }

    @Override
    public ListItem setPreviousItem(ListItem item) {
        this.previousItem = item;
        return this.previousItem;
    }

    @Override
    public ListItem setNextItem(ListItem item) {
        this.nextItem = item;
        return this.nextItem;
    }
}
