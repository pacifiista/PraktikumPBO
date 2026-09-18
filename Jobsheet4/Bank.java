package Jobsheet4;

public class Bank {
    private Account19[] account19s;
    private int count;

    public Bank(int capacity) {
        account19s = new Account19[capacity];
    }

    public boolean addAccount(Account19 account19) {
        if (count >= this.account19s.length) {
            return false;
        }
        this.account19s[count] = account19;
        count++;
        return true;
    }

    public Account19 findAccount19(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (account19s[i].getAccountNumber().equals(accountNumber)) {
                return account19s[i];
            }
        }
        return null;
    }

    // Menambahkan method findAccounntsByOwnerName
    public Account19[] findAccount19sByOwnerName(String name) {
        int matchCount = 0;
        for (int i = 0; i < count; i++) {
            if (account19s[i].getOwner().getName().equals(name)) {
                matchCount++;
            }
        }
        Account19[] matches = new Account19[matchCount];
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
}
