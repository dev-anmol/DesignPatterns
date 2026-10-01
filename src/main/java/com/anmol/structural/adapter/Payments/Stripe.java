package com.anmol.structural.adapter.Payments;

public class Stripe implements Payment{

    private String phoneNumber;

    public Stripe(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amountInUSD) {
        System.out.println("Paid " + " $ " + amountInUSD + " using Stripe ");
    }
}
