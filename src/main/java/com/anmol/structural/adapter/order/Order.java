package com.anmol.structural.adapter.order;

import com.anmol.structural.adapter.Payments.Payment;

public class Order {

    public String name;
    public double priceInUSD;
    Payment payment = null;

    public Order(String name, double priceInUSD, Payment payment) {
        this.name = name;
        this.priceInUSD = priceInUSD;
        this.payment = payment;
    }

    public void placeOrder() {
        this.payment.pay(priceInUSD);
    }


}
