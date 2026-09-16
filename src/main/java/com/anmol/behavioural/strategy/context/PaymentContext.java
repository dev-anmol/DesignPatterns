package com.anmol.behavioural.strategy.context;

import com.anmol.behavioural.strategy.Payment.PaymentStrategy;

public class PaymentContext {
    PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        this.strategy.pay(amount);
    }
}
