package com.programiz.list;

import com.resources.Game;

import java.util.ArrayList;

public class Games {
    public static void main(String[] args) {

        Game personaRoyal = new Game("PERSONA 5 ROYAL", "PlayStation 4", "Mar 31,2020", "Atlus");
        Game theLastOfUs = new Game("The Last of Us Part II", "PlayStation 4", "June 19, 2020", "Naughty Dog");
        Game hades = new Game("Hades", "Switch", "Sep 17, 2020", "Supergiant Games");
        Game halfLifeAlyx = new Game("HALF-LIFE: ALYX", "PC", "Mar 23, 2020", "Valve Software");

        ArrayList<Game> games = new ArrayList<>();
        games.add(personaRoyal);
        games.add(theLastOfUs);
        games.add(hades);
        games.add(halfLifeAlyx);
        for (Game obj : games)
        {
            System.out.println(obj.toString());
        }
    }
}
