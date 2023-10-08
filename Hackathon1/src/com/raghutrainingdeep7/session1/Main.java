package com.raghutrainingdeep7.session1;

public class Main {

    public static void main(String[] args) {
        Animal<String,Integer> a = new Dog<String,Integer>();
        Animal<String,Integer> b = new Dog<String,Integer>();

        Animal<String,Integer> c = new Animal<String,Integer>() {
            @Override
            public void walk() {

            }
            @Override
            public Integer legs(String animal) {
                return 0;
            }
        };

        Animal<String, Integer> d = new Animal<String, Integer>() {
            @Override
            public void walk() {

            }
            @Override
            public Integer legs(String animal) {
                return 0;
            }
        };

    }

}
