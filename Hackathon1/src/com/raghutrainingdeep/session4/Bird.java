package com.raghutrainingdeep.session4;

public interface Bird {

    void fly();

    static void printHello(){
        System.out.println("Hello!");
    }

    default void printHi(){
        System.out.println("Hi!");
    }

}
