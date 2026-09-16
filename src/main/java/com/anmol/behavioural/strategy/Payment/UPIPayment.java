package com.anmol.behavioural.strategy.Payment;

public class UPIPayment implements PaymentStrategy {

    private String upiId;
    private double amount;

    public UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Successfully paid " + amount + " using UPI");
    }

}
