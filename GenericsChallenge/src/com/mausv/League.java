package com.mausv;

import java.util.ArrayList;

/**
 * Created by mausv on 9/6/2016.
 */
public class League<T extends Team> {
    private String name;
    public ArrayList<T> teams = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            return false;
        } else {
            teams.add(team);
            System.out.println("Added " + team.getName() + " to " + this.name + " league");
            return true;
        }
    }

    public void scoreboard() {
        for (Team team:
             teams) {
            System.out.println(team.toString());
        }
    }


}
