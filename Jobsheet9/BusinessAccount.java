package Jobsheet9;

public class BusinessAccount extends Account {
    private static final double MIN_BALANCE = 1000000;
    private double monthlyTransactionFee;

    public BusinessAccount(String accountNumber, Customer owner, double balance, double monthlyTransactionFee ) {
        super(accountNumber, owner, balance);
        this.monthlyTransactionFee = monthlyTransactionFee;
    }

    @Override
    protected boolean canWithdraw(double amount) {
    return super.canWithdraw(amount) && (getBalance() - amount >= MIN_BALANCE);
   }

   @Override
   public void printInfo() {
      super.printInfo(); // baris milik Account
      System.out.println("Jenis rekening: Business Account - monthly fee: " + monthlyTransactionFee);
   }

   @Override
    public double monthlyFee() {
    return monthlyTransactionFee;
}
}
