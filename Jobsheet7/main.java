package Jobsheet7;

public class main {
    public static void main(String[] args) {
       Customer customer = new Customer("Rian", "0812-0000-0003");
       SavingAccount19 savings = new SavingAccount19("A003", customer, 100000, 0.02);

       savings.deposit(50000, "Initial top-up");
       savings.printInfo();
    }

}
