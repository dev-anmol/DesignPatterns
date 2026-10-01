package com.anmol.creational.factory.troops;

public class Archer implements Troop {
    public final String name = "Archer";
    public final String type = "Ground";


    @Override
    public void attack() {
        System.out.println("Archer shots the target with arrow");
    }

}
