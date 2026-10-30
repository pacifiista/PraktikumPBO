package Jobsheet10;

public class Bank {
    private Account[] account19s;
    private int count;

    public Bank(int capacity) {
        account19s = new Account[capacity];
    }

    public boolean addAccount(Account account) {
         if (count >= this.account19s.length) {
            return false;
        }
        this.account19s[count] = account;
        count++;
        return true;
    }

    //tugas mandiri update menjadi throws
    public Account findAccount(String accountNumber) throws AccountNotFoundException {
        for (int i = 0; i < count; i++) {
            if (account19s[i].getAccountNumber().equals(accountNumber)) {
                return account19s[i];
            }
        }
        throw new AccountNotFoundException("Account with number " + accountNumber + " not found.");
    }

    // Menambahkan method findAccounntsByOwnerName
    public Account[] findAccountsByOwnerName(String name) {
        int matchCount = 0;
        for (int i = 0; i < count; i++) {
            if (account19s[i].getOwner().getName().equals(name)) {
                matchCount++;
            }
        }
        Account[] matches = new Account[matchCount];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (account19s[i].getOwner().getName().equals(name)) {
                matches[index] = account19s[i];
                index++;
            }
        }
        return matches;
    }
    public void printAllAccounts(){
        for (int i = 0; i < count; i++) {
            account19s[i].printInfo();
        }
    }

    public void printMonthlyFees() {
    for (int i = 0; i < count; i++) {
        System.out.println(account19s[i].getAccountNumber() + " fee: " + account19s[i].monthlyFee());
    }
}

    //langkah 2 menambahkan method processMonthEnd
    public void processMonthEnd() {
        for (int i = 0; i < count; i++) {
            Account acc = account19s[i];
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + "interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    // tugas mandiri
    // method printAuditLog()
    public void printAuditLog() {
    for (int i = 0; i < count; i++) {
        Account acc = account19s[i];
        // Memeriksa apakah akun tersebut memiliki kemampuan Auditable menggunakan instanceof
        if (acc instanceof Auditable auditable) {
            System.out.println(auditable.auditLog());
        }
    }
}
}