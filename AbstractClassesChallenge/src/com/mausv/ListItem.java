package com.mausv;

/**
 * Created by mausv on 9/4/2016.
 */
public abstract class ListItem {
    protected ListItem previousItem = null;
    protected ListItem nextItem = null;
    protected Object value = null;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract int compareTo(ListItem item);
    public abstract ListItem previous();
    public abstract ListItem setPreviousItem(ListItem item);
    public abstract ListItem next();
    public abstract ListItem setNextItem(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
