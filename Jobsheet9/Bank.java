package Jobsheet9;

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

    public Account findAccount19(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (account19s[i].getAccountNumber().equals(accountNumber)) {
                return account19s[i];
            }
        }
        return null;
    }

    // Menambahkan method findAccounntsByOwnerName
    public Account[] findAccount19sByOwnerName(String name) {
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
}