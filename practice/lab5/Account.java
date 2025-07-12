package practice.lab5;

public abstract class Account {
    private final String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        System.out.println("You created a new account " + this.accountNumber + ".");
    }

    Account(String accountName, int deposit) {
        accountNumber = "";
    }

    public final String getAccountNumber() {
        return accountNumber;
    }

    public final double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return accountNumber + ": " + balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            System.out.println("You ");
        }
        return false;
    }

    boolean withdraw(double amount) {
        if (amount <= 0 || balance < amount)
            return false;
        balance -= amount;
        return true;
    }

    public abstract void monthEnd();
}