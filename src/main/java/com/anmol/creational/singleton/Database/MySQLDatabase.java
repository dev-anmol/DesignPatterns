package com.anmol.creational.singleton.Database;

public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("MySQL connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL disconnected");
    }

    @Override
    public String getName() {
        return "MySQL";
    }
}