class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.printf(accountHolder + " current balance: $%.2f\n", balance);
    }
}

class SavingsAccount extends BankAccount {
    private int freeWithdrawals = 3;
    private int withdrawalCount = 0;
    private final double withdrawalFee = 2.0;

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount;
        if (withdrawalCount >= freeWithdrawals) {
            totalAmount += withdrawalFee;
            System.out.println("Withdrawal fee of $" + withdrawalFee + " applied.");
        }
        if (totalAmount <= balance) {
            withdrawalCount++;
            super.withdraw(totalAmount);
        } else {
            System.out.println("Insufficient balance to withdraw $" + amount + " with fee.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private final double withdrawalFee = 1.5;

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + withdrawalFee;
        if (totalAmount <= balance) {
            System.out.println("Withdrawal fee of $" + withdrawalFee + " applied.");
            super.withdraw(totalAmount);
        } else {
            System.out.println("Insufficient balance to withdraw $" + amount + " with fee.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", 500);
        CheckingAccount checking = new CheckingAccount("Bob", 1000);

        savings.deposit(100);
        savings.withdraw(50);
        savings.withdraw(30);
        savings.withdraw(20);
        savings.withdraw(10);

        checking.deposit(200);
        checking.withdraw(100);
        checking.withdraw(50);

        savings.displayBalance();
        checking.displayBalance();
    }
}
