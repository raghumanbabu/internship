package com.raghutrainingdeep7.session2;

public class Singleton {

    private static Singleton instance;

    private Object staticKey1 = new Object();
    private Object staticKey2 = new Object();

    private Singleton(){
    }

    //Static method - Key is Singleton class itself.
    public static synchronized Singleton getInstance(){
        if(instance == null){
           instance = new Singleton();
        }
        return instance;
    }

    public void printHi(){
        synchronized (staticKey1){
            System.out.println("Hi!!!");
        }
    }

    //Non-static method - Key is the instance of the class
    public synchronized String getName(){
        return "Hello";
    }

}
