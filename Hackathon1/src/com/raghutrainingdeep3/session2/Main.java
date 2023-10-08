package com.raghutrainingdeep3.session2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        LocalDate a = LocalDate.now();
        System.out.println(a);

        LocalTime b = LocalTime.now();
        System.out.println(b);

        LocalDateTime c = LocalDateTime.now();
        System.out.println(c);

        ZonedDateTime d = ZonedDateTime.now();
        System.out.println(d);

        Date f = new Date();
        System.out.println(f);

        LocalDate e = LocalDate.of(2020,01,25);
        System.out.println(e);
        DateTimeFormatter g = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String h = e.format(g);
        System.out.println(h);

        long i = 24021990;
        long j = 19111998;
        String k = "24092020";
        String l = "20200924";
        String m = "2020Sep24";

    }

}
