package com.raghutrainingdeep4.session1;

import java.util.List;
import java.util.stream.Stream;

public class LambdaSample5 {

    public void sample5(){
        List<Student> students = LambdaSample1.getStudents();
        Stream<Student> xxx = students.stream();
        Stream<Integer> yyy = xxx.map(student -> student.rollNumber); //1,2,3,4
        System.out.println(yyy);
        System.out.println("-------------------");
        yyy.forEach(LambdaSample3::printValue);
    }

}
