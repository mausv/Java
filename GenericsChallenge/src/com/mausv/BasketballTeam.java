package com.mausv;

/**
 * Created by mausv on 9/6/2016.
 */
public class BasketballTeam extends Team {
    public BasketballTeam(String name) {
        super(name);
    }

    @Override
    public void score() {
        score = (won * 7) - lost - tied;
    }
}
