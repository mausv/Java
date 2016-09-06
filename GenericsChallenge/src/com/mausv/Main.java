package com.mausv;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        BasketballTeam broncos = new BasketballTeam("Broncos");
        BasketballTeam polo = new BasketballTeam("Polo");
        BasketballTeam anotherTeam = new BasketballTeam("Another Basket");
        FootballTeam lier = new FootballTeam("Lier");
        FootballTeam kill = new FootballTeam("Kill");
        FootballTeam rayados = new FootballTeam("Rayados");

        League<FootballTeam> bbva = new League<>("BBVA Bancomer");
        League<BasketballTeam> nba = new League<>("NBA");

        bbva.addTeam(lier);
        bbva.addTeam(kill);
        bbva.addTeam(rayados);
        nba.addTeam(broncos);
        nba.addTeam(polo);
        nba.addTeam(anotherTeam);

        polo.won = 1;
        polo.lost = 2;
        polo.score();
        System.out.println(polo.toString());
        anotherTeam.won = 3;
        anotherTeam.lost = 1;
        anotherTeam.score();
        System.out.println(anotherTeam.toString());
        broncos.won = 3;
        broncos.lost = 2;
        broncos.score();
        System.out.println(broncos.toString());

        System.out.println(polo.compareTo(anotherTeam));

        Collections.sort(nba.teams);

        nba.scoreboard();

    }
}
