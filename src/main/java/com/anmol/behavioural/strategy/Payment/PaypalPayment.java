package com.anmol.behavioural.strategy.Payment;


public class PaypalPayment implements PaymentStrategy {
    private String email;
    private double amount;

    public PaypalPayment(String email, double amount) {
        this.email = email;
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Successfully paid " + amount + " using PayPal");
    }

}
