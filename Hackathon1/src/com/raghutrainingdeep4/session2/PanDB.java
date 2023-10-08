package com.raghutrainingdeep4.session2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class PanDB {

    HashMap<String, Person> panMap = new HashMap<String, Person>();//Key - PanNo,Value - Person

    public void storePanDetails() {
        Person p1 = new Person("Parthi", "Jayarman", LocalDate.of(1990, 01, 25), 1000000, "Vellore", 'M', true);
        panMap.put("AHYBC29", p1);
        Person p2 = new Person("Lokesh", "Raja", LocalDate.of(1995, 01, 15), 2000000, "Chennai", 'M', false);
        panMap.put("HYDG235", p2);
    }

    public void printPanDetails(String panNumber){
        Person p = panMap.get(panNumber);
        System.out.println(panNumber);
        System.out.println(p.firstName);
        System.out.println(p.lastName);
        System.out.println(p.dob);
        System.out.println(p.assetInINR);
        System.out.println(p.address);
        System.out.println(p.sex);
        System.out.println(p.maritalStatus);
    }

}
