package org.example;

public class BankBook {
    private double balance;

    public BankBook(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    public void debit(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                throw new IllegalArgumentException("Insufficient funds");
            }
        } else {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
