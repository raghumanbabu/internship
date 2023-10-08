package com.raghutrainingdeep7.session1;

public class Dog<T,S> implements Animal<T,S>{

    public static String name = "Dog";

    @Override
    public void walk() {

    }
    @Override
    public S legs(T name) {
        return null;
    }
}
