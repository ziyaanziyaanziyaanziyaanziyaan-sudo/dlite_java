package com.module1;

import java.util.Scanner;

class Bank3 {
    String accHolder;
    private double balance;
    private int pin;

    // Set PIN
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Deposit
    public void depo(double amt, int epin) {
        if (pin == epin) {
            balance += amt;
            System.out.println("DEPOSITED SUCCESSFULLY!!");
            System.out.println("Available Balance: " + balance);
        } else {
            System.out.println("INVALID PIN!!");
        }
    }

    // Withdraw
    public void withdraw(double amt, int epin) {
        if (pin == epin) {
            if (amt <= balance) {
                balance -= amt;
                System.out.println("WITHDRAWAL SUCCESSFUL!!");
                System.out.println("Available Balance: " + balance);
            } else {
                System.out.println("INSUFFICIENT BALANCE!!");
            }
        } else {
            System.out.println("INVALID PIN!!");
        }
    }

    // Check Balance
    public void checkBal(int epin) {
        if (pin == epin) {
            System.out.println("Available Balance: " + balance);
        } else {
            System.out.println("INVALID PIN!!");
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Bank3 d = new Bank3();

        // Set account PIN
        d.setPin(1234);

        System.out.println("MENU");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. CHECK BALANCE");

        System.out.print("Enter PIN: ");
        int epin = s.nextInt();

        System.out.print("Enter Choice: ");
        int ch = s.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter Deposit Amount: ");
                double damt = s.nextDouble();
                d.depo(damt, epin);
                break;

            case 2:
                System.out.print("Enter Withdrawal Amount: ");
                double wamt = s.nextDouble();
                d.withdraw(wamt, epin);
                break;

            case 3:
                d.checkBal(epin);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        s.close();
    }
}