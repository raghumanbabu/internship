package com.raghutrainingdeep5.session1;

public class Student extends GenericStudent implements GenericStudentTemplate{

    public int rollNumber;
    public String name;
    public void printDetails(){
        System.out.println(rollNumber + ":" + name + ":" + schoolName);
    }

    @Override
    public int fetchRollNumber(String studentName) {
        return rollNumber;
    }

    public void sayHi(){
        int x = 10;
        x++;
        System.out.println("Hi" + x);
    }

    public static String schoolName = "Spartan";
    public static void printSchoolName(){
        //rollNumber++; error
        System.out.println(schoolName);
    }

}