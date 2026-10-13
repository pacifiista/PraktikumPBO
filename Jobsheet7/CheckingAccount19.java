package Jobsheet7;

public class CheckingAccount19 extends Account19 {
    private double overdraftLimit;

    public CheckingAccount19(String accountNumber, Customer owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override 
    protected boolean canWithdraw(double amount) {
        return amount > 0 && amount <= getBalance() + overdraftLimit;
    }

    @Override 
    public void printInfo() {
        System.out.println("Accoun type: Checking, overdraft limit: " + overdraftLimit);
    }
}
