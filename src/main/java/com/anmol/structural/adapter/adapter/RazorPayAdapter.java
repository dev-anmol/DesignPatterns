package com.anmol.structural.adapter.adapter;
import com.anmol.structural.adapter.Payments.Payment;
import com.anmol.structural.adapter.Payments.RazorPayGateway;

public class RazorPayAdapter implements Payment {

    private final RazorPayGateway razorPayGateway;
    private final String cardNumber;

    public RazorPayAdapter(
            RazorPayGateway razorPayGateway,
            String cardNumber
    ) {
        this.razorPayGateway = razorPayGateway;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amountInUSD) {

        double amountInINR = amountInUSD * 83;

        razorPayGateway.makePayment(
                amountInINR,
                cardNumber
        );
    }
}