package com.raghutrainingdeep4.session1;

import java.time.LocalDate;

public class Student extends ParentStudent{
    public int rollNumber;
    public String name;
    public LocalDate dateOfBirth;

    public Student(int rollNumber, String name, LocalDate dateOfBirth){
        this.rollNumber = rollNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName(){
        //String name = "Raj";
        return this.name;
    }

}
