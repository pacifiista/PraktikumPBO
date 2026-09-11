package Jobsheet3;

public class Account19 {
   private String accountNumber;
   private String ownerName;
   private double balance;
   private double dailyWithdrawalLimit; 

   public Account19(String accountNumber, String ownerName, double balance, double dailyWithdrawalLimit) {
      this.accountNumber = accountNumber;
      this.ownerName = ownerName;
      this.balance = balance;
      this.dailyWithdrawalLimit = dailyWithdrawalLimit; //tugas
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
      if (amount <= 0 || amount > balance || amount > dailyWithdrawalLimit) {
         return false;
      }
      balance -= amount;
      return true;
   }
    public void printInfo () {
      System.out.println(accountNumber + " - " + ownerName + " - balance: " + balance);
   }
}