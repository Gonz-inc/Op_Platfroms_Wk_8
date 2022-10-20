package com.gamingroom;
/*
Name: Gerardo Gonzalez
Class: CS-230-Operating Platforms
Date: 2022/09/18
Institution: Southern New Hampshire University
*/

public class SingletonTester {      // Class to test Singleton pattern

public void testSingleton() {

System.out.println("\nAbout to test the singleton...");


GameService service = GameService.getInstance(); // Set a local reference to the singleton GameService instance

for (int i = 1; i <= service.getGameCount(); i++) { // For loop to print game count 
System.out.println(service.getGame(i));
}

}

}