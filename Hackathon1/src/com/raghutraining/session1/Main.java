package com.raghutraining.session1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Account obj1 = new Account();
        Account obj2 = new Account();
        Account obj3 = new Account();

        obj1.withdrawMoney();
        obj2.withdrawMoney();
        obj3.withdrawMoney();

        System.out.println(Account.bankTotalAsset);
        System.out.println(obj3.balanceAmount);

        int a = 100;
        boolean b = true;
    }
}