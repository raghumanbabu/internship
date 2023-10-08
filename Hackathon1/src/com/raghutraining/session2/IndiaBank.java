package com.raghutraining.session2;

public class IndiaBank extends WorldBank implements Bank{

    @Override
    public void printDetails() {
        System.out.println("Hello from India Bank");
    }

}
