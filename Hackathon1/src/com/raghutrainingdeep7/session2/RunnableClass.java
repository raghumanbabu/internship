package com.raghutrainingdeep7.session2;

public class RunnableClass implements Runnable{

    @Override
    public void run() {

        int b = multiplyBy10(5);

        Animal c = giveMeAnimal();
        c.printInfo();

        giveMeAnimal().printInfo();

        Thread.currentThread().setName("RunnableClassThread!!!");
        System.out.println("Hello inside Runnable class");
        System.out.println("Thread name is " + Thread.currentThread().getName());
    }

    Animal a = new Animal();

    public Animal giveMeAnimal(){
        return a;
    }

    public int multiplyBy10(int num){
        int a = num*10;
        return a;
    }

}
