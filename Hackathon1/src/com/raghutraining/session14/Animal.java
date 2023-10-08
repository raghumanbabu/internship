package com.raghutraining.session14;

public class Animal {

    public int legs = 2;

    public void walk(){
        System.out.println("Animal is walking!!!");

        Dog d = new Dog();
        System.out.println("Dogs has " + d.eyesCount + " number of eyes");
        d.run();

        Dog d2 = new Dog();
        System.out.println("Dogs has " + d2.eyesCount + " number of eyes");
        d2.run();
    }

    public class Dog {
        public int eyesCount = 2;

        public void run(){
            System.out.println("Dog is running!!!");
        }
    }
}
