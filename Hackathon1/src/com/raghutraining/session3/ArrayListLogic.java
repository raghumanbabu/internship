package com.raghutraining.session3;

import java.util.ArrayList;

public class ArrayListLogic {

    public void sample(){
        ArrayList<String> a = new ArrayList<String>();
        a.add("Chennai");
        a.add("NewDelhi");
        a.add("Mumbai");
        a.add("Ahmedabad");
        a.add("Chennai");
        System.out.println(a.size());
        if(a.contains("Madurai")){
            System.out.println("Madurai is present in the list");
        } else {
            System.out.println("Madurai is not present in the list");
        }

        ArrayList<Dummy> b = new ArrayList<Dummy>();
        b.add(new Dummy());


        ArrayList<Animal> c = new ArrayList<Animal>();

        ArrayList<Integer> d = new ArrayList<Integer>();
        d.add(10);
        d.add(20);
        d.add(30);

        ArrayList e = new ArrayList();
        e.add(10);
        e.add("Hello");
    }

}
