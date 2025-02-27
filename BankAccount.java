import java.util.Scanner;

class BankAccount {
    private float existing; // Class-level variable to store balance
    private Scanner input;  // Single Scanner instance for input

    // Constructor
    public BankAccount() {
        input = new Scanner(System.in);
        System.out.print("Enter existing amount in bank account: ");
        this.existing = input.nextFloat();
    }

    // Deposit method
    public void deposit() {
        System.out.print("Enter amount to be deposited: ");
        float deposit = input.nextFloat();
        existing += deposit;
        System.out.println("Existing amount now is: " + existing);
    }

    // Withdrawal method
    public void withdrawal() {
        System.out.print("Enter amount to be withdrawn: ");
        float withdrawal = input.nextFloat();
        if (existing < withdrawal) {
            System.out.println("Not sufficient balance.");
        } else {
            existing -= withdrawal;
            System.out.println("Remaining balance: " + existing);
        }
    }

    // Main method
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount();
        customer1.deposit();
        customer1.withdrawal();
    }
}