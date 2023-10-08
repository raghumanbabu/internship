package com.raghutrainingdeep8.session2;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        System.out.println("Hello Multithreading in Java");

        //Java 1
        Runnable r1 = () -> System.out.println("Hello Raghu");
        Thread t1 = new Thread(r1);
        t1.start();

        System.out.println("Another thread is created through an old way!!!");

        //Java 5
        Runnable r2 = () -> System.out.println("Hello Parthi");
        ExecutorService e1 = Executors.newSingleThreadExecutor();
        e1.submit(r2);

        System.out.println("Another thread is created through a newer way!!!");

        //Java 5
        Callable<String> c1 = () -> {
            System.out.println("Thread name is " + Thread.currentThread().getName());
            Thread.sleep(30000);
            return "Hello Sara";
        };
        ExecutorService e2 = Executors.newSingleThreadExecutor();
        Future<String> f = e2.submit(c1);
        String value = f.get();
        System.out.println("Callableeeeeeeee -> " + value);

        Callable<String> c8 = () -> {
            System.out.println("Thread name is " + Thread.currentThread().getName());
            Thread.sleep(30000);
            return "Hello Lokesh";
        };

        Callable<String> c9 = () -> {
            System.out.println("Thread name is " + Thread.currentThread().getName());
            //Thread.sleep(30000);
            return "Hello Vetri";
        };

        ExecutorService a = Executors.newFixedThreadPool(2);
        Future<String> f1 = a.submit(c8);
        Future<String> f2 = a.submit(c9);
        System.out.println(f1.get(10, TimeUnit.SECONDS));
        System.out.println(f1.get(2, TimeUnit.SECONDS));

        //Java 8
        Runnable r3 = () -> System.out.println("Hello Anand1");
        //r3.run();
        CompletableFuture.runAsync(r3);

        CompletableFuture.runAsync(() -> {
            System.out.println("Hello Anand1");
            //
            //
            //
            //
            //
        });
        Supplier<String> s1 = () -> "Hello Anand2";
        CompletableFuture<String> c4 = CompletableFuture.supplyAsync(s1);

    }

}
