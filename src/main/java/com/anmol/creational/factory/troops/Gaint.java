package com.anmol.creational.factory.troops;

public class Gaint implements Troop {
    public final String name = "Gaint";
    public final String type = "Ground";

    @Override
    public void attack() {
        System.out.println("Giant punches the defence");
    }

}
