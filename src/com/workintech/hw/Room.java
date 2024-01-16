package com.workintech.hw;

public class Room {
    //Room Bedroom u kapsamasi gerek .

    private String name ;
    private Bedroom bedroom;

    public Room(String name, Bedroom bedroom) {
        this.name = name;
        this.bedroom = bedroom;
    }

    public String getName() {
        return name;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }


    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", bedroom=" + bedroom +
                '}';
    }
}
