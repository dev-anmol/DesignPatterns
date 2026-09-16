package com.anmol.behavioural.strategy.Order;

import com.anmol.behavioural.strategy.Payment.*;
import com.anmol.behavioural.strategy.context.PaymentContext;

import java.util.Scanner;

public class Purchase {

    PaymentStrategy strategy = null;
    private double amount;

    public void selectPaymentMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the amount to be Paid");
        amount = scanner.nextDouble();

        System.out.println("Please select the Payment Payment to proceed!!!");
        System.out.println("Enter 1 for Card Payment");
        System.out.println("Enter 2 for PayPal Payment");
        System.out.println("Enter 3 for UPI Payment");

        int type = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline
        switch (type) {
            case 1:
                System.out.println("Paying through Credit Card");
                System.out.println("Enter the Card Number");
                String cardNumber = scanner.nextLine();
                System.out.println("Enter the CSV Number");
                String csv = scanner.nextLine();
                System.out.println("Enter the Name");
                String name = scanner.nextLine();
                System.out.println("Enter the Expiry Date");
                String expiryDate = scanner.nextLine();
                strategy = new CardPayment(name, cardNumber, expiryDate, csv, amount);
                break;
            case 2:
                System.out.println("Paying through PayPal");
                System.out.println("Enter the email");
                String email = scanner.nextLine();
                strategy = new PaypalPayment(email, amount);
                break;
            case 3:
                System.out.println("Paying through UPI Payment");
                System.out.println("Enter the UPI Id");
                String upiId = scanner.nextLine();
                strategy = new UPIPayment(upiId, amount);
                break;
            default:
                System.out.println("Please select the available payment types");

        }

        PaymentContext context = new PaymentContext(strategy);
        context.processPayment(amount);

    }
}
