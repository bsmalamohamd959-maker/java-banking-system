package Bank_Management_System;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("\n*************");
            System.out.println("Banking System");
            System.out.println("*************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*************");

            System.out.print("Enter your choice (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Enter a number from 1 to 4.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice.");
            }
        }

        System.out.println("Thank you, have a nice day.");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    static double deposit() {
        System.out.print("Enter an amount to deposit: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid amount.");
            scanner.next();
            return 0;
        }

        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Deposit must be greater than zero.");
            return 0;
        }

        return amount;
    }

    static double withdraw(double balance) {
        System.out.print("Enter an amount to withdraw: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid amount.");
            scanner.next();
            return 0;
        }

        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Withdrawal must be greater than zero.");
            return 0;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return 0;
        }

        return amount;
    }
}
