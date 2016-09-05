package com.mausv;

/**
 * Created by mausv on 9/4/2016.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeitem(ListItem item);
    void tranverse(ListItem root);
}
