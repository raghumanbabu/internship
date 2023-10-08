package com.raghutrainingdeep8.session2;

import java.util.List;

public class Student {

    private String name;
    private int rollNumber;

    private List<Subject> subjects;

    public List<Subject> getSubjects(){
        return subjects;
    }

    public Student(int a, String b, List<Subject> c){
        name = b;
        rollNumber = a;
        subjects = c;
    }
}
