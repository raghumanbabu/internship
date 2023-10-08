package com.raghutrainingdeep4.session1;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaSample3 {

    public LambdaSample3(){
        System.out.println("Hello from Constructor!!!");
    }

    interface StudentFactory{
        Student create(int a, String b, LocalDate c);
    }

    public void sample3() {
        //Method references - using existing methods in lambda expressions

        //Static method - ClassName :: methodName
        //Instance method of a specific object - objectRef :: methodName
        //Instance method not of a spec object - ClassName :: methodName
        //Constructor - ClassName :: new

        List<Student> students = LambdaSample1.getStudents();



        /*
        students.removeIf((Student t) -> {
            if (t.rollNumber > 2) {
                return true;
            }
            return false;
        });
         */
        //Predicate<Student> filter = this::checkRollNumber;
        //students.removeIf(this::checkRollNumber);

        //students.forEach((Student t) -> System.out.println(t));

        VetriConsumer vC1 = new VetriConsumer();
        students.forEach(vC1);

        students.forEach(t -> System.out.println(t.name));

        students.forEach(System.out::println);



        students.forEach(System.out::println);
        students.stream().forEach(System.out::println);

        Stream<Student> xxx = students.stream();
        Stream<Integer> yyy = xxx.map(student -> student.rollNumber); //1,2,3,4
        yyy.forEach(LambdaSample3::printValue);

        students.stream().map(student -> student.dateOfBirth).forEach(System.out::println);
        students.stream().map(Student::getName).forEach(System.out::println);








        Vetri v1 = new Vetri();
        v1.create(4, "Sara", LocalDate.of(2000,07,22));


        StudentFactory sf = Student::new;
        Student s = sf.create(4, "Sara", LocalDate.of(2000,07,22));















    }

    public boolean checkRollNumber(Student t){
        if (t.rollNumber > 2) {
            return true;
        }
        return false;
    }

    public static void printValue(Integer r){
        System.out.println("Value is " + r);
    }



    public class Vetri implements StudentFactory{
        @Override
        public Student create(int a, String b, LocalDate c) {
            //return null;
            return new Student(a,b,c);
        }
    }



}
