package com.raghutraining.session6;

public class Animal<T> {

    public T id;

    public void printDetails(){
        System.out.println("Id of the animal is " + id);
    }
}
