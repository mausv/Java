package com.mausv;

/**
 * Created by mausv on 8/26/2016.
 */
public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value = null;

    public ListItem(Object value) {
        this.value = value;
    }

    public ListItem getRightLink() {
        return rightLink;
    }

    public abstract ListItem right();
    public abstract ListItem moveRight();
    public abstract ListItem left();
    public abstract ListItem moveLeft();

    public void setRightLink(ListItem rightLink) {
        this.rightLink = rightLink;
    }

    public ListItem getLeftLink() {
        return leftLink;
    }

    public void setLeftLink(ListItem leftLink) {
        this.leftLink = leftLink;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
