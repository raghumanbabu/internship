package com.raghutraining.session3;

import java.util.HashSet;

public class HashSetLogic {

    public void sample(){
        HashSet<String> a = new HashSet<String>();
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
    }



}
