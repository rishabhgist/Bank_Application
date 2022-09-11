package com.bank;

import lombok.Data;

@Data
public class Account {
    private boolean validateUser;
    private double accountBalance;

    public Account(boolean validateUser, double accountBalance) {
        this.validateUser = validateUser;
        this.accountBalance = accountBalance;
    }

    public void displayInfo() {
        if (this.validateUser) {
            System.out.println(getAccountBalance());
        }
    }
}
