package com.anmol.creational.factory.troops;

public class Wizard implements Troop {
    public final String name = "Wizard";
    public final String type = "Ground";

    @Override
    public void attack() {
        System.out.println("Wizard throws fire balls");
    }

}
