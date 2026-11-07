package Jobsheet11;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rian", "0812-0000-0003");
        SavingsAccount saving = new SavingsAccount("A003", customer, 100000, 0.02);

        try {
            saving.withdraw(70000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        try {
            saving.withdraw(30000);
            System.out.println("Withdrawal succeeded, new balance: " + saving.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        SavingsAccount acc1 = new SavingsAccount("A001", customer1, 500000, 0.01);

        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        CheckingAccount acc2 = new CheckingAccount("A002", customer2, 200000, 50000);

        // --- TAMBAHAN TUGAS MANDIRI (BusinessAccount) ---
        Customer customer4 = new Customer("Budi", "0812-0000-0004");
        BusinessAccount business = new BusinessAccount("A004", customer4, 2000000, 25000);

        Bank bank = new Bank(new InMemoryAccountRepository());
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(saving);
        bank.addAccount(business); // Mendaftarkan BusinessAccount

        bank.processMonthEnd();
        bank.printHistory("A003");

        System.out.println("\n--- Daftar Seluruh Rekening ---");
        bank.printAllAccounts();
    }
}