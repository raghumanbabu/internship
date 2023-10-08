package com.raghutrainingdeep4.session1;

import java.util.ArrayList;
import java.util.List;

public class LambdaSample2 {

    int x = 100;

    public void sample2() {

        List<Student> students = LambdaSample1.getStudents();
        int a = 10;
        String b = "Ram";
        students.sort((o1, o2) -> {
            //a++; //Not allowed - variables should be final or effectively final
            //b += "Lakshman"; Not allowed - variables should be final or effectively final
            //Adding a value to list or similar things are allowed
            System.out.println("Printing the value of variable inside lambda : " + a);
            return o1.name.compareTo(o2.name);
        });

        Vetri v = new Vetri(); //v=1005   1005->Vetri object
        students.sort(v);

        Vetri v2 = new Vetri(); //v=1006   1006->Vetri object
        students.sort(v2);

        int c = a + 5;


        //Choice 1 - Traditional for loop
        for (Student s : students) {
            System.out.println(s.rollNumber + "   " + s.name + "   " + s.dateOfBirth);
        }

        students.forEach(     (s)->System.out.println(s.rollNumber + "   " + s.name + "   " + s.dateOfBirth)     );
        students.forEach(     LambdaSample2::printOwn     );

        //Choice 2 - Loop using lambda expression
        students.forEach((Student t) -> { //Student type for t is optional here
            System.out.println(t.rollNumber + "   " + t.name + "   " + t.dateOfBirth);
        });

        //Choice 3 - Loop using stream
        students.stream().forEach((Student t) -> {
            System.out.println(t.rollNumber + "   " + t.name + "   " + t.dateOfBirth);
        });

        //Choice 3 - Loop using parallel stream to improve performance but, parallel thread issue
        students.parallelStream().forEach((Student t) -> {
            System.out.println(t.rollNumber + "   " + t.name + "   " + t.dateOfBirth);
        });

        //Loop using lambda expression with exception handled
        students.forEach((t) -> {
            try {
                int p = 1;
                int q = p / 0;
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
            System.out.println(t.rollNumber + "   " + t.name + "   " + t.dateOfBirth);
        });
    }

    public static void printOwn(Student s){
        System.out.println(s.rollNumber + "   " + s.name + "   " + s.dateOfBirth);
    }


    public int add(int a, int b){
        int c = a + b + x;
        return c;
    }

}
