package com.gamingroom;

/*
Name: Gerardo Gonzalez
Class: CS-230-Operating Platforms
Date: 2022/09/18
Institution: Southern New Hampshire University
*/

public class ProgramDriver { // Application start-up program

    public static void main(String[] args) {    // Only Main Method

        GameService service = GameService.getInstance();    // Singleton GameService call 

        System.out.println("\nAbout to test initializing game data...");

        Game game1 = service.addGame("Game #1");
        System.out.println(game1);
        Game game2 = service.addGame("Game #2");
        System.out.println(game2);

        // use another class to prove there is only one instance
        SingletonTester tester = new SingletonTester();
        tester.testSingleton();
    }
}