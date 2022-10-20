package com.gamingroom;
/**
* Name: Gerardo Gonzalez
* Course: CS-230-Operating Platforms
* Date: 2022/09/18
* Institution: Southern New Hampshire University
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class GameService {      // Class Constructer 

    private static List<Game> games = new ArrayList<Game>(); // Creats a list of Games 

    private static long nextGameId = 1;     // Identifier

    private static long nextPlayerId = 1;   // Identifier


    private static long nextTeamId = 1;     // Identifier


    private static GameService service;     // Serivce call 


private GameService() {                     // Default constructor
}

public static GameService getInstance() {   // Exiting Istance check 


    if (service == null) {                      // Checks to see if the service exits 

    service = new GameService();                // If not, create a new instance

    System.out.println("New Game Service created.");
    } 
    else {
    
    System.out.println("Game Service already instantiated."); // Messages user if it already exits 
    }

    
    return service; // return only single instance
}

public Game addGame(String name) {          // Add Game Methond 

    Game game = null;

    Iterator<Game> gamesIterator = games.iterator();

    while (gamesIterator.hasNext()) {       // Iterates through list of games 

        Game gameInstance = gamesIterator.next();

        if (gameInstance.getName().equalsIgnoreCase(name)) {    // Checks to see if the game already exits 
            return gameInstance;             // Returns Game Instance 
        }
    }

    if (game == null) {                      // Checks to game instance again 
    game = new Game(nextGameId++, name);     // If not creates new game instance 
    games.add(game);                         // adds game 
    }
    return game;                             // returns game
}

public Game getGame(long id) {               // getGame id iterates and checks if it exits 

    Game game = null;

    Iterator <Game> gamesIterator = games.iterator();

    while (gamesIterator.hasNext()) {

        Game gameInstance = gamesIterator.next();
        if (gameInstance.getId() == id) {
        return gameInstance;
        }

    }
    return game;
}

public Game getGame(String name) {

    Game game = null;

    Iterator<Game> gamesIterator = games.iterator();

    while (gamesIterator.hasNext()) {

        Game gameInstance = gamesIterator.next();
        if (gameInstance.getName().equalsIgnoreCase(name)) {
        game = gameInstance;
        }

    }
    return game;
}


public int getGameCount() {         // Accessor Gets game count 
return games.size();
}

public long getNextPlayerId() {     // Accessor gets the next players id  
return nextPlayerId;
}

public long getNextTeamId() {       // Accessor gets the next team id 
return nextTeamId;
}
}