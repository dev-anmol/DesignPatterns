package com.anmol.structural.facade.facade;

import com.anmol.structural.facade.account.Account;
import com.anmol.structural.facade.funds.Funds;
import com.anmol.structural.facade.notification.Notification;
import com.anmol.structural.facade.security.Security;

public class BankFacade {
    private Account account;
    private Notification notification;
    private Security security;
    private Funds funds;

    public BankFacade() {
        this.account = new Account();
        this.notification = new Notification();
        this.security = new Security();
        this.funds = new Funds();
    }

    public void withdraw(String accountNumber, String pin, double amount) {
        System.out.println("Starting Withdrawal process...");
        if (account.verifyAccount(accountNumber) && security.verifyPIN(pin) && funds.hasSufficientFunds(amount)) {
            funds.debit(amount);
            notification.sendNotification("Widthdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Withdrawal failed");
        }
    }
}
