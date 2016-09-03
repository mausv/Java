package com.mausv;

/**
 * Created by mausv on 8/26/2016.
 */
public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem right() {
        return this.rightLink;
    }

    @Override
    public ListItem moveRight() {
        return this.rightLink.right();
    }

    @Override
    public ListItem left() {
        return this.rightLink;
    }

    @Override
    public ListItem moveLeft() {
        return this.leftLink.left();
    }
}
