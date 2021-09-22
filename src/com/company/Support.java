package com.company;

public class Support extends Character{
    public Support() {
        super(new MG82Behavior(), new RPG7Behavior());
    }

    @Override
    void display() {
        System.out.println("The main distinguishing part of your character is a large supply of grenades and mines, as well as an RPG7 anti-tank rocket gun in your arsenal. Your actions can completely change the course of the war. ");
    }
}
