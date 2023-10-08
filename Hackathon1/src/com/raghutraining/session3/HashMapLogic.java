package com.raghutraining.session3;


import java.util.HashMap;

public class HashMapLogic {

    public void sample(){
        //HashSet<String> a = new HashSet<String>();
        HashMap<String,String> a = new HashMap<String, String>();
        a.put("Parthi","Vellore");
        a.put("Lokesh","Chennai");
        a.put("Raghu","Utrecht");
        System.out.println(a.get("Lokesh"));//O(1)

        HashMap<String,Dummy> b = new HashMap<String, Dummy>();

        Dummy dummy1 = new Dummy();
        dummy1.aaa = 10;
        dummy1.bbb = 20;
        dummy1.name = "Parthiban";
        b.put("Parthi", dummy1);

        Dummy dummy2 = new Dummy();
        dummy2.aaa = 100;
        dummy2.bbb = 200;
        dummy2.name = "Lokeshwaran";
        b.put("Lokesh", dummy2);

        System.out.println(b.get("Parthi"));
        System.out.println(b.get("Parthi").name);

        Dummy x = b.get("Lokesh");
        System.out.println(x.aaa);
        System.out.println(x.bbb);
        System.out.println(x.name);
    }

}
