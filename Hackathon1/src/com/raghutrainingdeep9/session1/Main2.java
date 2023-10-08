package com.raghutrainingdeep9.session1;

import java.util.concurrent.CompletableFuture;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello Main thread!!!");
        extracted();
        Thread.sleep(30000);
        System.out.println("End of Main thread!!!");

    }

    private static void extracted() {

        //Sub thread 1
        CompletableFuture.runAsync(()->{
            System.out.println("Start of Hi");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End of Hi");
        });

        //Sub thread 2
        CompletableFuture.runAsync(()->{
            System.out.println("Start of Hello");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End of Hello");
        });

        System.out.println("End of extracted");
    }

}
