package com.raghutrainingdeep7.session2;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        Car c = new Car();
        Car c2 = new Car();

        Runnable a = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("AnonymousClassThread aaaaa!!!");
                System.out.println("Hello in runnable anonymous class aaaaaa");
                System.out.println("Thread name is " + Thread.currentThread().getName());
                try {
                    c.sayHello();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(a);
        t1.start();

        Thread t2 = new Thread(()->{
            Thread.currentThread().setName("AnonymousClassThread bbbb!!!");
            System.out.println("Hello in runnable anonymous class bbbb");
            System.out.println("Thread name is " + Thread.currentThread().getName());
            try {
                c.sayHi();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();

    }

}
