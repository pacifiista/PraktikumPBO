package jobsheet2;

public class main {
    public static void main(String[] args) {
        account19 [] acc = new account19[3];
        acc[0] = new account19("Nadia", 500000);
        acc[0].withdraw(150000);

        acc[1] = new account19("Budi", 1000000);

        acc[2] = new account19("Siti", 750000);
        acc[2].withdraw(200000);

        for (account19 account19 : acc) {
            account19.printInfo();
        }



        // account19 original = new account19("Nadia", 500000);
        // account19 copy = original;
        // copy.deposit(100000);

        // System.out.println("Via original: " +original.balance);
        // System.out.println("Via copy: " +copy.balance);


        // account19 acc = new account19("Nadia", 500000);
        // acc.withdraw(150000);
        // acc.printInfo();
        // System.out.println("Formatted: " + acc.formatBalance());
        // acc.withdraw(1000000);
        // acc.printInfo();


        // acc.balance = 500000;
        // System.out.println(acc.Ownername +  " - balance: " + acc.balance);
        // account19 acc = new account19("Nadia", 0);
        
    }
}
