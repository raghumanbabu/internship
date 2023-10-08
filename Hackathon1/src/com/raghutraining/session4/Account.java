package com.raghutraining.session4;

public class Account {

    public Account(double a){
        balanceAmount = a;
    }

    public double balanceAmount;

    public void withdrawMoney(){
        balanceAmount = balanceAmount - 1000;
        System.out.println(balanceAmount);
    }

}
