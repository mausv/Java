package com.company;

/**
 * Created by Mauricio on 10/13/2015.
 */
public class Burger {
    private String breadRoll;
    private String meat;
    private boolean optLettuce;
    private boolean optTomato;
    private boolean optCarrot;
    private boolean optPickles;
    private double price = 0;

    public Burger(String breadRoll, String meat, boolean optLettuce, boolean optTomato, boolean optCarrot, boolean optPickles) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.optLettuce = optLettuce;
        this.optTomato = optTomato;
        this.optCarrot = optCarrot;
        this.optPickles = optPickles;
        this.price = 9;

        if(optLettuce){
            this.addPrice(5);
        }
        if(optTomato){
            this.addPrice(5);
        }
        if(optPickles){
            this.addPrice(5);
        }
        if(optCarrot){
            this.addPrice(5);
        }
    }

    public void addPrice(int price) {
        this.price += price;
    }

    public void currentPrice() {
        System.out.println(getIngredients());
        System.out.println("Total price: $" + getPrice());
    }

    public double getPrice() {
        return price;
    }

    public String getIngredients() {
        String ingredients;
        ingredients = "Bread: $4" + breadRoll + "\n" +
                        "Meat $5: " + meat + "\n" +
                        "Lettuce $5: " + optLettuce + "\n" +
                        "Tomato $5: " + optTomato + "\n" +
                        "Carrot $5: " + optCarrot + "\n" +
                        "Pickles $5: " + optPickles + "\n";
        return ingredients;
    }

}
