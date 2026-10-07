package Jobsheet6;

public class BusinessAccount19 extends Account19 {
    private double monthlyTransactionFee;

    public BusinessAccount19(String accountNumber, Customer owner, double balance, double monthlyTransactionFee ) {
        super(accountNumber, owner, balance);
        this.monthlyTransactionFee = monthlyTransactionFee;
    }

    public double getMonthlyTransactionFee() {
        return monthlyTransactionFee;
    }

    public void printAccountType() {
        System.out.println("Account type: Business, monthly fee: " + monthlyTransactionFee);
    }

}
