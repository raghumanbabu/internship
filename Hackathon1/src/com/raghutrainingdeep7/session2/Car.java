package com.raghutrainingdeep7.session2;

public class Car {

    public synchronized void sayHello() throws InterruptedException {
        System.out.println("Hello before sleep!!!");
        Thread.sleep(20000);
        System.out.println("Hello after sleep!!!");
    }

    public synchronized void sayHi() throws InterruptedException {
        System.out.println("Hi before sleep!!!");
        Thread.sleep(10000);
        System.out.println("Hi after sleep!!!");
    }

}
