package com.gamingroom;

/*
Name: Gerardo Gonzalez
Class: CS-230-Operating Platforms
Date: 2022/09/18
Institution: Southern New Hampshire University
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team extends Entity{

    private List<Player> players = new ArrayList<Player>();     // List of players in team

    public Team(long id, String name) {         // Constructer with paramater of ID and Name
        super(id, name);                // Access parante class 
    }

    public Player addPlayer(String name) {

        Player player = null;

        Iterator<Player> playersIterator = players.iterator();      // iterates through a list of player 

        while (playersIterator.hasNext()) {         // while loop for while ther is a player next
            Player playerInstance = playersIterator.next(); // sets intance of player to list 

            if (playerInstance.getName().equalsIgnoreCase(name)) {  // checks to see if player exists.
                player = playerInstance;        // if so returns instance of player
            } 
            else {
            players.add(player);                // If not adds player to list.
            }
        }
        return player;
    }

    @Override
    public String toString() {
    return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
    }
}