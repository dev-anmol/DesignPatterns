package com.anmol;

import com.anmol.behavioural.strategy.Order.Purchase;
import com.anmol.creational.singleton.Database.DBConnection;
import com.anmol.creational.singleton.Database.MongoDatabase;
import com.anmol.creational.singleton.Database.MySQLDatabase;

public class Main {
    public static void main(String[] args) {

        // Behavioural Design pattern trigger
        // Strategy Design pattern testing
//        Purchase order = new Purchase();
//        order.selectPaymentMethod();


        // Creational Design pattern
        // Singleton design pattern testing
        DBConnection.initialize(new MongoDatabase());
        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();
        DBConnection connection3 = DBConnection.getInstance();

        DBConnection.initialize(new MongoDatabase());


        System.out.println(connection1 == connection2);
        System.out.println(connection2 == connection3);


    }
}