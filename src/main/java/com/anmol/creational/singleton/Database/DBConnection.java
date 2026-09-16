package com.anmol.creational.singleton.Database;

public class DBConnection {

    private static volatile DBConnection instance;
    private final Database database;


    private DBConnection(Database database) {
        this.database = database;
        this.database.connect();
    }

    public static DBConnection initialize(Database database) {

        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection(database);
                }
            }
        }
        return instance;

    }

    public static DBConnection getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Database connection has not been initialized");
        }
        return instance;
    }

    public Database getDatabase() {
        return database;
    }
}