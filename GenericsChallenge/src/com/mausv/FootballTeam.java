package com.mausv;

/**
 * Created by mausv on 9/6/2016.
 */
public class FootballTeam extends Team {
    public FootballTeam(String name) {
        super(name);
    }

    @Override
    public void score() {
        score = (won * 2) - lost + (tied * 2);
    }
}
