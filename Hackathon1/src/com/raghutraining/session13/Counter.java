package com.raghutraining.session13;

public class Counter {

    private int count = 100;

    public synchronized void increment(){
        count = count + 1;
    }

    public synchronized int getCount(){
        return count;
    }

}
