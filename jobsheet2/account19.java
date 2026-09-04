package jobsheet2;

public class account19 {
    // atribut
    public String Ownername;
    public double balance;

    // constructor
    public account19(String Ownername, double balance) {
        this.Ownername = Ownername;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
        if (balance < 0) { // Cek apakah saldo negatif
            balance += amount; // batalkan penarikan
            System.out.println("Insufficient balance. Withdrawal canceled.");
        }
    }
    
    public void printInfo() {
        System.out.println("Owner Name: " + Ownername + " - balance: " + balance);
    }

    public String formatBalance() {
        return String.format("%.2f", balance); // Format saldo dengan 2 desimal
    }

    public boolean isBalanceNegative() {
        return balance < 0; // Mengembalikan true jika saldo negatif, false jika tidak
    }
}


