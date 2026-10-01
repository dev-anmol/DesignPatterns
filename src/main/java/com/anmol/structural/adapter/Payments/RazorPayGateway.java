package com.anmol.structural.adapter.Payments;

public class RazorPayGateway {

    public void makePayment(double amountInINR, String cardNumber) {
        System.out.println(
                "Paid ₹" + amountInINR + " using RazorPay"
        );
    }
}