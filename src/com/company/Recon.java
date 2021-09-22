package com.company;

public class Recon extends Character{
    public Recon() {
        super(new Kar98KBehavior(), new MP5Behavior());
    }

    @Override
    void display() {
        System.out.println("You are operating from afar. Your main goal is to mark all possible techniques and spot the location of the enemy squad. Try to stay away, and for long-range combat you have a sniper rifle available in your arsenal.");
    }
}
