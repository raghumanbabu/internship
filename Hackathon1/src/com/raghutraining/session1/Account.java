package com.raghutraining.session1;

public class Account {

    public double balanceAmount = 10000;
    public static double bankTotalAsset = 10000000;

    public void withdrawMoney() {
        bankTotalAsset = bankTotalAsset - 1000;
        balanceAmount = balanceAmount - 1000;
        System.out.println(balanceAmount);
    }

}
