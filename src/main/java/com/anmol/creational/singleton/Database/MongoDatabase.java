package com.anmol.creational.singleton.Database;

public class MongoDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("MongoDB connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MongoDB disconnected");
    }

    @Override
    public String getName() {
        return "MongoDB";
    }
}