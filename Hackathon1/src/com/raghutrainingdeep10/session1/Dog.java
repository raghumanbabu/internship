package com.raghutrainingdeep10.session1;

import java.lang.annotation.Native;

public class Dog implements Animal{

    int a;

    @Override
    public void eat() {
        System.out.println("Dog eats!!!");
    }

    public void walk(){
        System.out.println("Dog walks!!!");
    }

    public static void drink(){
        System.out.println("Dog drinks!!!");
    }

}
