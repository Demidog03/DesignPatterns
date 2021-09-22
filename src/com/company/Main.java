package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Medic medic = new Medic();
        System.out.println("Choose you Character!");
        System.out.println("*********************");
        System.out.println("1. Assault");
        System.out.println("2. Medic");
        System.out.println("3. Recon");
        System.out.println("4. Support");
        Scanner scanner = new Scanner(System.in);


        Integer characterChoice;
        characterChoice = scanner.nextInt( );


        if(characterChoice==1){
            Character character = new Assault();
            character.display();
            System.out.println();
            System.out.println("Your primary weapon is: ");
            character.equipPrimary();
            System.out.println();
            System.out.println("Your secondary weapon is: ");
            character.equipSecondary();

            character.setPrimaryWeaponBehavior(new RAM7Behaviour());


        }

        else if(characterChoice==2){
            Character character = new Medic();
            character.display();
            System.out.println();
            System.out.println("Your primary weapon is: ");
            character.equipPrimary();
            System.out.println();
            System.out.println("Your secondary weapon is: ");
            character.equipSecondary();
        }

        else if(characterChoice==3){
            Character character = new Recon();
            character.display();
            System.out.println();
            System.out.println("Your primary weapon is: ");
            character.equipPrimary();
            System.out.println();
            System.out.println("Your secondary weapon is: ");
            character.equipSecondary();
        }

        else if(characterChoice==4){
            Character character = new Support();
            character.display();
            System.out.println();
            System.out.println("Your primary weapon is: ");
            character.equipPrimary();
            System.out.println();
            System.out.println("Your secondary weapon is: ");
            character.equipSecondary();
        }

        else{
            System.out.println("Invalid input. Please try again.");
            return;
        }






    }
}
