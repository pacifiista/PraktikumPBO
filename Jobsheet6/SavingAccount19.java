package Jobsheet6;

public class SavingAccount19 extends Account19 {
    private double interestRate;
    public SavingAccount19(String AccountNumber, Customer owner, double balance, double interestRate) {
        super(AccountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void printAccountType() {
        System.out.println("Account type: Savings, interest rate: " + interestRate);
    }
}
