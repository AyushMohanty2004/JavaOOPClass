package assignment1;

import java.util.Date;

class Account 
{
    private static int nextAccountNumber = 1;

    protected int accountNumber;
    protected String accountHolderName;
    protected String accountType;
    protected double balance;
    protected Date lastTransactionDate;

    public Account(String accountHolderName, String accountType) {
        this.accountNumber = nextAccountNumber++;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = 0.0;
        this.lastTransactionDate = new Date();
    }

    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: Rs " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        lastTransactionDate = new Date();
        System.out.println("Deposit of Rs " + amount + " successful. Current balance: Rs " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            lastTransactionDate = new Date();
            System.out.println("Withdrawal of Rs " + amount + " successful. Current balance: Rs " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }
}

class StandardAccount extends Account {
    private static final double MAX_WITHDRAWAL_FREE = 100000;
    private static final double MAX_WITHDRAWAL_PENALTY = 500000;
    private static final double PENALTY_RATE = 0.0005;

    public StandardAccount(String accountHolderName) {
        super(accountHolderName, "Standard");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= MAX_WITHDRAWAL_FREE) {
            super.withdraw(amount);
        } else if (amount <= MAX_WITHDRAWAL_PENALTY) {
            double penalty = amount * PENALTY_RATE;
            super.withdraw(amount + penalty);
            System.out.println("Penalty of Rs " + penalty + " applied.");
        } else {
            System.out.println("Withdrawal limit exceeded. Withdrawal unsuccessful.");
        }
    }
}

class PremiumAccount extends Account {
    private static final double MAX_WITHDRAWAL = 1000000;

    public PremiumAccount(String accountHolderName) {
        super(accountHolderName, "Premium");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= MAX_WITHDRAWAL) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded. Withdrawal unsuccessful.");
        }
    }
}

public class eval {
    public static void main(String[] args) {
        StandardAccount standardAccount = new StandardAccount("ashish");
        PremiumAccount premiumAccount = new PremiumAccount("sahil");

        standardAccount.deposit(2000);
        standardAccount.withdraw(1000);
        standardAccount.checkBalance();

        premiumAccount.deposit(2000);
        premiumAccount.withdraw(50400);
        premiumAccount.checkBalance();
    }
