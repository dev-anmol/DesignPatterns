package com.anmol.creational.singleton.Database;

public interface Database {

    void connect();

    void disconnect();

    String getName();
}