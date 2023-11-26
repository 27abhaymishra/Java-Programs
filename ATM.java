import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    String type;
    double amount;
    String timestamp;

    Transaction(String type, double amount, String timestamp) {
        this.type = type;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Amount: " + amount + ", Timestamp: " + timestamp;
    }
}

class Account {
    double balance;
    ArrayList<Transaction> transactions;

    Account(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, java.time.LocalDateTime.now().toString()));
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", -amount, java.time.LocalDateTime.now().toString()));
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void transfer(Account recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.balance += amount;
            transactions.add(new Transaction("Transfer to " + recipient.hashCode(), -amount, java.time.LocalDateTime.now().toString()));
            recipient.transactions.add(new Transaction("Transfer from " + this.hashCode(), amount, java.time.LocalDateTime.now().toString()));
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void showTransactions() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(initialBalance);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Transactions History");
            System.out.println("5. Quit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter recipient's initial balance: ");
                    double recipientInitialBalance = scanner.nextDouble();
                    Account recipient = new Account(recipientInitialBalance);

                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    account.transfer(recipient, transferAmount);
                    break;
                case 4:
                    account.showTransactions();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}
