package com.raghutrainingdeep4.session1;

import java.util.Comparator;

public class Vetri implements Comparator<Student> {

    int a = 10;

    @Override
    public int compare(Student o1, Student o2) {
        System.out.println("Printing the value of variable inside lambda : " + a);
        return o1.name.compareTo(o2.name);
    }
}
