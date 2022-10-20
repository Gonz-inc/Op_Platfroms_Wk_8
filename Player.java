package com.gamingroom;
/*
Name: Gerardo Gonzalez
Class: CS-230-Operating Platforms
Date: 2022/09/18
Institution: Southern New Hampshire University
*/

public class Player extends Entity{

    public Player(long id, String name) {       //Constructor with an identifier and name
    super(id, name);
    }

    @Override
    public String toString() {
        return "Player [id=" + super.getId() + ", name=" + super.getName() + "]";
    }
}