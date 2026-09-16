package com.anmol.behavioural.strategy.Payment;

public class CardPayment implements PaymentStrategy {

    private String cardNumber;
    private String name;
    private String csv;
    private String expiry;
    private double amount;

    public CardPayment(String cardNumber, String name, String csv, String expiry, double amount) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.csv = csv;
        this.expiry = expiry;
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Successfully paid " + amount + " using Credit Card");
    }
}
