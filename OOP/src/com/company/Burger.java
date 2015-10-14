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

        if(optLettuce){
            this.price += 5;
        }
        if(optTomato){
            this.price += 5;
        }
        if(optPickles){
            this.price += 5;
        }
        if(optCarrot){
            this.price += 5;
        }
    }

    public void addPrice(int price) {
        this.price += price;
    }

    public double currentPrice() {
        return this.price;
    }

}
