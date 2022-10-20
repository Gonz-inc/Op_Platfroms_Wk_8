package com.gamingroom;
/**
* Name: Gerardo Gonzalez
* Course: CS-230-Operating Platforms
* Date: 2022/09/18
* Institution: Southern New Hampshire University
*/

public class Entity {

    private long id;        // Private Attribute 
    private String name;    // Private Attribute

    private Entity() {          // Creates Default Constructor
    }

        public Entity(long id, String name) {
        this();                     // Calls the default constructor
        this.id = id;               
        this.name = name;
    }

    public long getId() {       // Accessors 
        return id;
    }

    public String getName() {   // Accessors 
        return name;
    }

    public String toString() {  
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}