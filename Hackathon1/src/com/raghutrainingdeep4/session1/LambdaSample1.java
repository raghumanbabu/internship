package com.raghutrainingdeep4.session1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaSample1 {

    List<Student> students;

    public void sample1() {

        List<Student> students = getStudents();

        /*
        int a = 10; //a=10
        Integer b = 10; //b=10001 10001=10+fields+methods
        ArrayList c = new ArrayList();
        String d = "Hello"; //10002=Hello d=10002

        String f = "Hello"; //f=10002
        String e = new String("Hello"); //10003=Hello e=10003
         */

        //Option 1
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //o1=1000 1000=name,rollno,etc.+methods name=1001 1001="Parthi"+methods
                //o2=2000 2000=name,rollno,etc.+methods name=2001 2001="Lokesh"+methods
                int x = o2.name.compareTo(o1.name); //1000.compareTo(1003) => -3   2000.compareTo(1000) => 1000
                return x;
            }
        };
        students.sort(comparator);

        //Option 2 - Anonymous class
/*
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.compareTo(o1.name);
            }
        });

 */

        //Functional programming - Passing method/logic instead of data/object
        //Option 3 - Lambda expressions - Anonymous method passed to a method - implements functional interface with single abstract method
        //Comparator<Student> comparator2 = (o1, o2) -> o1.name.compareTo(o2.name);
        //students.sort(comparator2);

        //Option 4
        students.sort((o1, o2) -> o2.name.compareTo(o1.name));

        for (Student s : students) {
            System.out.println(s.rollNumber + ":" + s.name + ":" + s.dateOfBirth);
        }
    }


    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student(1, "Parthi", LocalDate.of(1990, 01, 25));
        Student s2 = new Student(2, "Lokesh", LocalDate.of(1995, 03, 14));
        Student s3 = new Student(3, "Anand", LocalDate.of(1985, 04, 28));
        Student s4 = new Student(4, "Banu", LocalDate.of(1987, 04, 28));
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        return students;
    }

}
