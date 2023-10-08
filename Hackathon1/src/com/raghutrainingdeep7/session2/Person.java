package com.raghutrainingdeep7.session2;

public class Person {

    private final Object key = new Object();
    private final Object key2 = new Object();

    public String init() throws InterruptedException{
        System.out.println("Hello outside lock");
        synchronized (key){
            System.out.println("Hello world!");
            key.wait();
            printHi();
            return "Hello";
        }
    }

    public String init2(){
        synchronized (key2){
            System.out.println("Hello world2!");
            printHi();
            key.notifyAll();
            return "Hello2";
        }
    }

    //Reentrant - The sync method with key calls another sync method which is locked with
    // the same key will be invoked and executed successfully.
    public void printHi(){
        synchronized (key2){
            System.out.println("Hi!!!");
            init2();
        }
    }

    //Deadline - T1 holds a key needed for T2 to finish.
    //T2 holds a key needed for T3 to finish.
    //T3 holds a key needed for T1 to finish.
    //JVM detects deadlock and restart JVM to fix it

}
