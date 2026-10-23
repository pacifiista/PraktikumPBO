package Jobsheet9;

public class CheckingAccount extends Account implements Auditable{
    private static final double MONTHLY_FEE = 15000;
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit) {
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
        super.printInfo();
        System.out.println("Accoun type: Checking, overdraft limit: " + overdraftLimit);
    }

    @Override 
    public double monthlyFee() {
        return MONTHLY_FEE;
    }

    //tugas mandiri
    @Override
    public String auditLog() {
        return "AUDIT [" + getAccountNumber() + "] saldo: " + getBalance()
                + ", batas overdraft: " + overdraftLimit;
    }
}
