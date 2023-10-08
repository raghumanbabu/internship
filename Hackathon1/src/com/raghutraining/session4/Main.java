package com.raghutraining.session4;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(10000);
        account1.withdrawMoney();

        Account account2 = new Account(20000);
        account2.withdrawMoney();
        account2.withdrawMoney();
    }
}
