package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        System.out.println("Enter the balance to mention in the account");

        Scanner scanner = new Scanner(System.in);
        Account account = new Account(scanner.nextDouble());
        account.debit(account.balance);
    }
}
