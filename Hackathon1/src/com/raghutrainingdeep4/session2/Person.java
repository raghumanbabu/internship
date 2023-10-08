package com.raghutrainingdeep4.session2;

import java.time.LocalDate;

public class Person {

    String firstName;
    String lastName;
    LocalDate dob;
    double assetInINR;
    String address;
    Character sex;
    boolean maritalStatus;

    public Person(String a, String b, LocalDate c, double d, String e, Character f, boolean g){
        firstName = a;
        lastName = b;
        dob = c;
        assetInINR = d;
        address = e;
        sex = f;
        maritalStatus = g;
    }

}
