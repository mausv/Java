package com.mausv;

/**
 * Created by mausv on 9/4/2016.
 */
public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            // List was empty, this item is the head of the list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                // New item is greater, move right
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // No next, insert at end
                    currentItem.setNextItem(newItem).setPreviousItem(currentItem);
                    //newItem.setPreviousItem(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                // New item is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNextItem(newItem).setPreviousItem(currentItem.previous());
                    //newItem.setPreviousItem(currentItem.previous());
                    newItem.setNextItem(currentItem).setPreviousItem(newItem);
                    //currentItem.setPreviousItem(newItem);
                } else {
                    // The node with a previous is the root
                    newItem.setNextItem(this.root).setPreviousItem(newItem);
                    //this.root.setPreviousItem(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeitem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                // Found record to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNextItem(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPreviousItem(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0){
                currentItem = currentItem.next();
            } else {
                // We are at an item greater than the one to be deleted, item's not in the list
                return false;
            }
        }
        return false;
    }

    @Override
    public void tranverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
