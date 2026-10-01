package com.anmol.creational.factory.baracks;

import com.anmol.creational.factory.troops.*;

import java.util.Scanner;

public class Factory {

    public Troop createTroop(Troops type) {
        switch (type) {
            case ARCHER:
                return new Archer();
            case WIZARD:
                return new Wizard();
            case GAINT:
                return new Gaint();
            default:
                throw new IllegalStateException("Please Select from the mentioned Options");
        }
    }
}
