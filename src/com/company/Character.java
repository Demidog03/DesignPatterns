package com.company;

public abstract class Character {
    private PrimaryWeaponBehavior primaryWeaponBehavior;
    private SecondaryWeaponBehavior secondaryWeaponBehavior;

    public PrimaryWeaponBehavior getPrimaryWeaponBehavior() {
        return primaryWeaponBehavior;
    }

    public void setPrimaryWeaponBehavior(PrimaryWeaponBehavior primaryWeaponBehavior) {
        this.primaryWeaponBehavior = primaryWeaponBehavior;
    }

    public SecondaryWeaponBehavior getSecondaryWeaponBehavior() {
        return secondaryWeaponBehavior;
    }

    public void setSecondaryWeaponBehavior(SecondaryWeaponBehavior secondaryWeaponBehavior) {
        this.secondaryWeaponBehavior = secondaryWeaponBehavior;
    }

    public Character(PrimaryWeaponBehavior primaryWeaponBehavior, SecondaryWeaponBehavior secondaryWeaponBehavior) {
        this.primaryWeaponBehavior = primaryWeaponBehavior;
        this.secondaryWeaponBehavior = secondaryWeaponBehavior;
    }

    public void equipPrimary(){
            this.primaryWeaponBehavior.equipPrimaryWeapon();
    }

    public void equipSecondary(){
        this.secondaryWeaponBehavior.equipSecondaryWeapon();
    }

    abstract void display();
}
