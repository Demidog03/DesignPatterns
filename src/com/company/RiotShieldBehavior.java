package com.company;

public class RiotShieldBehavior implements SecondaryWeaponBehavior{
    @Override
    public void equipSecondaryWeapon() {
        System.out.println("\tRiot Shield\nBallistic-proof and explosive-resistant shield with increased melee damage.");
    }
}
