package com.raghutraining.session9;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        SupplierClass s = new SupplierClass();
        String a = s.get();
        System.out.println(a);

        Supplier<String> s2 = () -> "Hello world2!!!";
        String b = s2.get();
        System.out.println(b);

        Supplier<String> s3 = () -> {
            String p = "Hello Parthi!!!";
            return p;
        };
        String c = s3.get();
        System.out.println(c);

        Consumer<String> c1 = (String t) -> {
            System.out.println("Hello Lokesh " + t);
        };
        c1.accept("Anand");


    }
}
