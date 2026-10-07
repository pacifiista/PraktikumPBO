package Jobsheet6;

import jobsheet2.account19;

public class CheckingAccount19 extends Account19 {
    private double overdraftLimit;

    public CheckingAccount19(String accountNumber, Customer owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void printAccountType() {
        System.out.println("Accoun type: Checking, overdraft limit: " + overdraftLimit);
    }
}
