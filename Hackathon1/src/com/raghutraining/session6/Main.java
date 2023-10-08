package com.raghutraining.session6;

public class Main {
    public static void main(String[] args) {
        int a;
        boolean b;
        String c;
        //var d;

        Account account1 = new Account(10000);
        account1.withdrawMoney();

        Account<Double> account2 = new Account<Double>(10.25);
        account2.withdrawMoney();

        Account account3 = new Account("Nil balance");
        account3.withdrawMoney();

        Animal<Integer> animal1 = new Animal<Integer>();
        animal1.id = 10;
        animal1.printDetails();

        Animal<String> animal2 = new Animal<String>();
        animal2.id = "A10";
        animal2.printDetails();
    }
}
