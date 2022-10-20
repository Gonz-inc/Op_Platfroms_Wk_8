package com.gamingroom;
/**
* Name: Gerardo Gonzalez
* Course: CS-230-Operating Platforms
* Date: 2022/09/18
* Institution: Southern New Hampshire University
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game extends Entity { // Class "Game" extention of Entity

    private List<Team> teams = new ArrayList<Team>();      // Creates a List of Teams 

    public Game(long id, String name) {      // Constructor with 
    super(id, name);                         // Refrences Parant Class(Entity) to get ID and Name 
    }

    public Team addTeam(String name) {

        Team team = null;

        Iterator<Team> teamsIterator = teams.iterator();  // Iterates through the set of teams 

        while (teamsIterator.hasNext()) {        // goes to the next iteration. 

            Team teamInstance = teamsIterator.next();         // Sets the team Instance to next Iteration.

            if (teamInstance.getName().equalsIgnoreCase(name)) {  // Check to see if the team already exists 

            team = teamInstance;                    // if so returns the Instance 
                         
            } 
            else {

            teams.add(team);                        //  If no adds the team

            }
        }

        return team;                                    // Returns the team. 
    }

    @Override
    public String toString() {
        return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
    }

}