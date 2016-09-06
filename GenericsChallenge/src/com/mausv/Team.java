package com.mausv;

/**
 * Created by mausv on 9/6/2016.
 */
public abstract class Team implements Comparable<Team>{
    private String name;
    public int score = 0;
    public int won = 0;
    public int lost = 0;
    public int tied = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void score();

    @Override
    public int compareTo(Team team) {
        if(this.score > team.score) {
            return -1;
        } else if(this.score < team.score) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.name + " W: " + this.won + " L:" + this.lost + " T:" + this.tied + " Score:" + this.score;
    }
}
