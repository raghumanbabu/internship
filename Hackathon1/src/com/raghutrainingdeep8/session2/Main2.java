package com.raghutrainingdeep8.session2;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        //Stream<Double> ds = s.getSubjects().stream().map((Subject :: getMark));
        CompletableFuture.runAsync(()->System.out.println("Hello")).
                thenRunAsync(()->System.out.println("Hi"));

        CompletableFuture.runAsync(()->System.out.println("Vannakkam")).
                thenRunAsync(()->System.out.println("Nanri"));
        
        System.out.println("Parthi Lokesh!!!!");

    }

}
