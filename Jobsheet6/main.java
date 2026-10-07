package Jobsheet6;

public class main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        SavingAccount19 acc1 = new SavingAccount19("A001", customer1, 500000, 0.01);
        acc1.withdraw(150000);
        acc1.printInfo();
        acc1.printAccountType();

        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        SavingAccount19 acc2 = new SavingAccount19("A002", customer2, 200000, 50000);
        acc2.withdraw(230000);
        
        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.printAllAccounts();

        Customer customer3 = new Customer("PT Maju Jaya", "0812-0000-0003");
        BusinessAccount19 acc3 = new BusinessAccount19("A003", customer3, 1000000, 5000);
        bank.addAccount(acc3);
        bank.printAllAccounts();
        acc3.printAccountType();
    }

}
