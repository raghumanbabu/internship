package com.raghutraining.session6;

public class Account<T> {

    /*
    public Account(double a){
        balanceAmount = a;
    }
    */
    public Account(T a){
        balanceAmount = a;
    }

    //public double balanceAmount;
    public T balanceAmount;

    public void withdrawMoney(){
        System.out.println(balanceAmount);
    }

}
