package java_tutorial;

import java.util.Scanner;
import java.util.ArrayList;

public class SimpleBankingApp {

    static class Account {
        int accountId;
        double balance;

        public Account(int accountId) {
            this.accountId = accountId;
            this.balance = 0.0; // Accounts start with zero balance
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount + " to account ID: " + accountId);
            } else {
                System.out.println("Invalid deposit amount. Please enter a positive value.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " from account ID: " + accountId);
            } else if (amount > balance) {
                System.out.println("Insufficient balance. Withdrawal failed.");
            } else {
                System.out.println("Invalid withdrawal amount. Please enter a positive value.");
            }
        }

        public void checkBalance() {
            System.out.println("Account ID: " + accountId + " has a balance of $" + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        int nextAccountId = 1001; // Starting account ID

        while (true) {
            System.out.println("\nSimple Banking Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    // Create a new account
                    Account newAccount = new Account(nextAccountId);
                    accounts.add(newAccount);
                    System.out.println("Account created successfully with ID: " + nextAccountId);
                    nextAccountId++; // Increment to the next ID for future accounts
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter your account ID: ");
                    int depositId = scanner.nextInt();
                    boolean depositFound = false;
                    for (Account acc : accounts) {
                        if (acc.accountId == depositId) {
                            depositFound = true;
                            System.out.print("Enter deposit amount: ");
                            double depositAmount = scanner.nextDouble();
                            acc.deposit(depositAmount);
                            break;
                        }
                    }
                    if (!depositFound) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter your account ID: ");
                    int withdrawId = scanner.nextInt();
                    boolean withdrawFound = false;
                    for (Account acc : accounts) {
                        if (acc.accountId == withdrawId) {
                            withdrawFound = true;
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawAmount = scanner.nextDouble();
                            acc.withdraw(withdrawAmount);
                            break;
                        }
                    }
                    if (!withdrawFound) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    // Check balance
                    System.out.print("Enter your account ID: ");
                    int balanceId = scanner.nextInt();
                    boolean balanceFound = false;
                    for (Account acc : accounts) {
                        if (acc.accountId == balanceId) {
                            balanceFound = true;
                            acc.checkBalance();
                            break;
                        }
                    }
                    if (!balanceFound) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting the application...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
