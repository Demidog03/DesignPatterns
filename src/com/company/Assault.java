package com.company;

public class Assault extends Character{

    public Assault() {
        super(new Kilo141Behavior(), new M19Behaviour());
    }

    @Override
    void display() {
        System.out.println("You are a very universal character who can prove useful in all situations. The ability to enter battles on average and in close combat makes you a much needed team member.");
    }
}
