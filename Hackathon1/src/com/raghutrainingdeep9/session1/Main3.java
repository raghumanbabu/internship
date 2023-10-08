package com.raghutrainingdeep9.session1;

import com.raghutrainingdeep6.session1.Student;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class Main3 {

    public static void main(String[] args) {

        System.out.println("START!!!" + java.time.LocalTime.now());

        /*
        logic1();
        logic2();
        logic3();
        */

        /*
        CompletableFuture.runAsync(Main3::logic1);
        CompletableFuture.runAsync(Main3::logic2);
        CompletableFuture.runAsync(Main3::logic3);
         */


        CompletableFuture.runAsync(Main3::logic1);
        CompletableFuture.runAsync(Main3::logic2).thenRunAsync(Main3::logic3);


        try {
            Thread.sleep(35000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("END!!!" + java.time.LocalTime.now());

    }

    private static void logic1() {
        System.out.println("Start logic 111");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End logic 111");
    }

    private static void logic2() {
        System.out.println("Start logic 222");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End logic 222");
    }

    private static void logic3() {
        System.out.println("Start logic 333");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End logic 333");
    }

}
