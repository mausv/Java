package com.company;

/**
 * Created by Mauricio on 10/14/2015.
 */
public class DeluxeBurger extends Burger {
    private boolean chips;
    private boolean drink;

    public DeluxeBurger(String breadRoll, String meat) {
        super(breadRoll, meat, false, false, false, false);
        this.chips = true;
        this.drink = true;
        this.addPrice(8);
    }

    public String getIngredients() {
        return super.getIngredients() +
                "Chips $4: " + chips + "\n" +
                "Drink $4: " + drink;
    }
}
