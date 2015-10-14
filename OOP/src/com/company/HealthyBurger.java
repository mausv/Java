package com.company;

/**
 * Created by Mauricio on 10/13/2015.
 */
public class HealthyBurger extends Burger {
    private boolean optCrunchyLettuce;
    private boolean optLightCheese;

    public HealthyBurger(String breadRoll, String meat, boolean optLettuce, boolean optTomato, boolean optCarrot, boolean optPickles, boolean optCrunchyLettuce, boolean optLightCheese) {
        super(breadRoll, meat, optLettuce, optTomato, optCarrot, optPickles);
        this.optCrunchyLettuce = optCrunchyLettuce;
        this.optLightCheese = optLightCheese;

        if(this.optCrunchyLettuce) {
            this.addPrice(7);
        }

        if(this.optLightCheese) {
            this.addPrice(7);
        }
    }

}
