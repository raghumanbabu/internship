package com.raghutrainingdeep10.session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(10, "Ram");
        Student s2 = new Student(5, "Anand");
        Student s3 = new Student(15, "Banu");
        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Student[] ss = {s1, s2, s3};

        students.stream().map(Student::getName).forEach(System.out::println);

        Comparator<Student> c = (o1, o2) -> o1.getName().compareTo(o2.getName());
        students.sort(c);
        Collections.sort(students);
        students.stream().map(Student::getName).forEach(System.out::println);
    }

}
