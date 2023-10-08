package com.raghutraining.session2;

public class Main {
    public static void main(String[] args) {
        IndiaBank ib1 = new IndiaBank();
        ib1.printDetails();
        ib1.printAssets();

        AmericaBank ib2 = new AmericaBank();
        ib2.printDetails();
        ib2.printAssets();
    }
}
