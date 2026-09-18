package Jobsheet4;

public class Main {
    public static void main(String[] args) {
       Customer customer1 = new Customer("Naura", "0852-1290-2343");
        Account19 acc1 = new Account19("A001", customer1, 500000);
        acc1.withdraw(150000);
        acc1.printInfo();

        Customer customer2 = new Customer("Sari", "0851-6573-3477");
        Account19 acc2 = new Account19("A002", customer2, 200000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.printAllAccounts();

        Account19 found = bank.findAccount19("A002");
        if (found != null) {
            found.printInfo();
        }
        System.out.println();
        
        // cari berdasarkan nama pemilik
        System.out.println("Cari Nama pemilik rekening");
        Account19[] NauraAccounts = bank.findAccount19sByOwnerName("Naura");
        for (Account19 acc : NauraAccounts) {
            acc.printInfo();
        }
    }
}

 
