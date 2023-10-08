package com.raghutrainingdeep6.session1;

import java.util.List;
import java.util.Optional;

public class StreamSample2 {

    public void logic2(){
        List<Student> studentList = Student.getStudents();
        Optional<String> o = studentList.stream().filter((t) -> t.rollNumber >= 0)
                .map(Student::getName)
                .reduce(String::concat);
        System.out.println(o);
        o.ifPresentOrElse(a->System.out.println(a), ()-> System.out.println("Nothing"));

        String o2 = studentList.stream().filter((t) -> t.rollNumber >= 0)
                .map(Student::getName)
                .reduce("---", String::concat);
        System.out.println(o2);

    }

}
