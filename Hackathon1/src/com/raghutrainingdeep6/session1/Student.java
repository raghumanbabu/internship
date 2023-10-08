package com.raghutrainingdeep6.session1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    public int rollNumber;
    public String name;
    public LocalDate dateOfBirth;

    public Student(int a, String b, LocalDate c){
        rollNumber = a;
        name = b;
        dateOfBirth = c;
    }

    public String getName(){
        return this.name;
    }

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student(1, "Parthi", LocalDate.of(1990, 01, 25));
        Student s2 = new Student(2, "Lokesh", LocalDate.of(1995, 03, 14));
        Student s3 = new Student(3, "Raghu", LocalDate.of(1985, 04, 28));
        students.add(s1);
        students.add(s2);
        students.add(s3);
        return students;
    }

}