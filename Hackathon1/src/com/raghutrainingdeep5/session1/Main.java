package com.raghutrainingdeep5.session1;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Class - Abstract, Concrete
        //Interface
        //null empty space
        Student a = new Student();
        Student b = new Student();
        a.name = "Sara";
        b.rollNumber = 2;
        a.printDetails();
        b.printDetails();
        Student.printSchoolName();
        Student c = new Student();
        c.sayGoodMorning();

        GenericStudentTemplate d = new Student();
        logic(d);

    }

    private static void logic(GenericStudentTemplate d) {
        int p = d.fetchRollNumber("Sara");
        if(p > 10){
            d.sayGoodMorning();
        } else{
            d.printDetails();
        }
    }

}
