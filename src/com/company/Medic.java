package com.company;

public class Medic extends Character{
    public Medic() {
        super(new M4A1Behavior(), new Model680Behavior());
    }

    @Override
    void display() {
        System.out.println("The life of your comrades is in your hands, as well as a lethal shotgun capable of turning enemies into mush. You are able to raise your friend, and if you need to kill the enemy. ");
    }
}
