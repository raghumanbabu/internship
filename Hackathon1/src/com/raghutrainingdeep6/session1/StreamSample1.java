package com.raghutrainingdeep6.session1;

import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamSample1 {

    public void logic1() {
        List<Student> studentList = Student.getStudents();

        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
        for(Student s : studentList){
            System.out.println(s.getName());
        }
        studentList.stream().map(Student::getName).filter((a) -> a.equalsIgnoreCase("Lokesh")).forEach(System.out::println);

        studentList.stream().filter((a) -> a.rollNumber > 1)//Intermediate operation - Returns stream
                .map(Student::getName)//Intermediate operation
                .forEach(System.out::println);//Terminal operation - Returns anything other than stream

        studentList.stream()
                .filter((t) -> t.rollNumber > 1)
                .map(Student::getName);//Intermediate operation - Lazy - does not run without terminal operation

        List<String> studentNames = studentList.stream().filter((t) -> t.rollNumber > 1)
                .map(Student::getName)
                .collect(Collectors.toList());
        studentNames.forEach(System.out::println);

        String studentNamesString = studentList.stream().filter((t) -> t.rollNumber > 1)
                .map(Student::getName)
                .filter(Objects::nonNull)
                .collect(Collectors.joining("===>"));
        System.out.println(studentNamesString);

        String y="";
        StreamSample1.nonNull(y);
        List<String> z = null;
        StreamSample1.nonNull(z);

        int[] x = new int[10];
        String[] xx = new String[10];

    }

    public static boolean nonNull(Object obj) {
        boolean a = (obj != null);
        return a;
    }

}
