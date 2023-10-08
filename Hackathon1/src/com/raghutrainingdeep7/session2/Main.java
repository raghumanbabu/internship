package com.raghutrainingdeep7.session2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Thread - flow - set of instructions
        //Thread Scheduler - It will talk to CPU for sharing the threads equally with the CPU cores

        //Race condition - Two diff threads try to read and write the same var at the same time
        //Synchronization - Prevents block of code executed by one thread at a time
        //Synchronization - Achieve using lock the code block using a key. Key is a tech object.
        //Key is also called monitor.

        Object key1 = new Object();

        System.out.println("Main thread!!!");

        RunnableClass a = new RunnableClass();
        Thread b = new Thread(a);
        b.start();

        //Thread.currentThread().wait(10000);

        Runnable c = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("AnonymousClassThread!!!");
                System.out.println("Hello in runnable anonymous class");
                System.out.println("Thread name is " + Thread.currentThread().getName());
            }
        };
        Thread d = new Thread(c);
        d.start();

        Thread e = new Thread(()->{
            Thread.currentThread().setName("LambdaExpressionThread!!!");
            System.out.println("Hello in lambda expression");
            System.out.println("Thread name is " + Thread.currentThread().getName());
        });
        e.start();

        Animal.createAnimalObj();

        //Singleton s = new Singleton();


    }

}
