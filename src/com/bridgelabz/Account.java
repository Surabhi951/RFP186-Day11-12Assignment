package com.bridgelabz;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    double balance;

    public Account() {

    }

    public Account(double balance) {
        super();
        this.balance = balance;
    }

    public void debit(double balance) {
        System.out.println("Enter amount to withdraw");
        double withdraw = sc.nextDouble();
        if (withdraw > balance)
            System.out.println("Withdraw exceeds the balance please enter correct amount");
        else
            balance = balance - withdraw;
        System.out.println("Remaining balance is " + balance);

    }
}
