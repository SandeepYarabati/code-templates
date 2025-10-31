package test;

class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        if(accountNumber <= 0) {
            throw new IllegalArgumentException("Account Number must be positive");
        }
        this.accountNumber = accountNumber;
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountHolderName(String name) {
        if(name != null && !name.trim().isEmpty()) {
            this.accountHolderName = name;
        } else {
            System.out.println("Invalid Name!");
        }
    }

    private void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Behavior methods
    public boolean deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            return true;
        }
        System.out.println("Invalid deposit amount!");
        return false;
    }

    public boolean withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            this.balance -= amount;
            return true;
        }
        System.out.println("Insufficient balance or invalid amount!");
        return false;
    }
}
