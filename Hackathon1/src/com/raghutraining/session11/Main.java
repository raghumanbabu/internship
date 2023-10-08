package com.raghutraining.session11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        System.out.println(s.format(d));

        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 2);
        Date date = c.getTime();
        System.out.println(date);
    }
}
