package Jobsheet7;

public class Account19 {
   private String accountNumber;
   private Customer owner;
   private double balance;
   

   public Account19(String accountNumber, Customer owner, double balance) {
      this.accountNumber = accountNumber;
      this.owner = owner;
      this.balance = balance;
   }

   // tambahkan getter owner
   public Customer getOwner(){
      return owner;
   }

   public String getAccountNumber () {
      return accountNumber;
   }

   public double getBalance () {
      return balance;

   }

   public boolean deposit(double amount) {
      if (amount <= 0) {
         return false;
      }
      balance += amount;
      return true;
   }

   public boolean withdraw(double amount) {
      if (!canWithdraw(amount)) {
         return false;
      }
      balance -= amount;
      return true;
   }

   protected boolean canWithdraw(double amount) {
      return amount > 0 && amount <= balance;
   }
    public void printInfo () {
      System.out.println(accountNumber + " - " + owner.getName() + " - balance: " + balance);
   }
}