package com.raghutrainingdeep4.session1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class Main {

    //Data structures - Stack, Queue, LinkedList, Tree

    //JAVA implementations - Interface, Abstract Class, Class

    //Collection - List, Queue, Set
    //List - ArrayList, LinkedList
    //Queue - PriorityQueue
    //Set - HashSet, TreeSet
    //Map - HashMap, TreeMap

    public static void main3(String[] args) {
        LambdaSample3 ls1 = new LambdaSample3();
        ls1.sample3();
    }

    public static void main(String[] args) {
        LambdaSample5 ls5 = new LambdaSample5();
        ls5.sample5();
    }

    public static void main2(String[] args) {
        //ArrayList
        ArrayList<String> fruits = new ArrayList<String>(); //  duplicate,  ordered
        fruits.add("Pineapple"); // 0, Pineapple
        fruits.add("Apple"); // 1, Apple
        fruits.add("Orange"); // 2, Orange
        fruits.add("Banana");
        System.out.println("Third value is " + fruits.get(2));
        for(String a : fruits){
            System.out.println(a);
        }
        if(fruits.contains("Apple")){
            System.out.println("Apple is present in the list, Hahaha!!!");
        }
        fruits.sort((x,y) -> y.compareTo(x));
        for(String a : fruits){
            System.out.println(a);
        }

        int w = method1("r", "P");
        System.out.println(w);

        ArrayList<Student> ssss = new ArrayList<Student>();
        Student s1 = new Student(1, "Parthi", LocalDate.of(1990,01,25));
        Student s2 = new Student(2, "Lokesh", LocalDate.of(1995,03,14));
        Student s3 = new Student(3, "Raghu", LocalDate.of(1985,04,28));
        ssss.add(s1);
        ssss.add(s2);
        ssss.add(s3);
        Comparator<Student> c = (o1, o2)->o2.name.compareTo(o1.name);
        ssss.sort(c);
        for(Student s : ssss){
            System.out.println(s.rollNumber + s.name + s.dateOfBirth);
        }

        LambdaSample1 ls1 = new LambdaSample1();
        ls1.sample1();

        LambdaSample1 aaa = new LambdaSample1();
        aaa.sample1();

        LambdaSample2 ls2 = new LambdaSample2();
        ls2.sample2();

        LambdaSample3 ls3 = new LambdaSample3();
        ls3.sample3();

        LinkedList<String> x = new LinkedList<String>();
        x.add("Ram");
        x.add("Abu");
        x.add("Abu");
        System.out.println(x.pollLast());
        for(String s : x){
            System.out.println(s);
        }

        HashSet<String> y = new HashSet<String>(); // No duplicate, Not ordered
        y.add("Apple");
        y.add("Apple");
        y.add("Apple");
        y.add("Orange");
        for(String s : y){
            System.out.println(s);
        }

        // Tree Set - No duplicates, ordered

        //HashMap - KeyValuePairs
        HashMap<Integer,String> z = new HashMap<Integer,String>(); // Not ordered, No duplicate keys
        z.put(1000001, "Parthiban Jayaraman");
        z.put(1000002, "Lokesh Kanagaraj");
        z.put(1000003, "Parthiban Jayaraman");
        z.put(1000003, "Raghu Jayaraman");
        System.out.println(z.get(1000003));

        /*
        HashMap a = new HashMap();
        a.put(10, 1000);
        a.put("Raghu",200);
        */

    }

    public static int method1(String x, String y){
        int z = x.compareTo(y);
        return z;
    }


}
