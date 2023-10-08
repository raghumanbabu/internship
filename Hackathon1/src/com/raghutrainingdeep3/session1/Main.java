package com.raghutrainingdeep3.session1;

public class Main {

    public static void main(String[] args) {
        //Garbage collection - automatic
        //String - immutable
        String a = "Hello"; // String a = new String("Hello");
        String b = "Hello";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String c = new String("Hey");
        String d = new String("Hey");
        System.out.println(c==d);
        System.out.println(c.equals(d));

        String e = "Vellore";
        if(e.equalsIgnoreCase("vellore")){
            System.out.println("Matches!!!");
        } else {
            System.out.println("Do not match!!!");
        }
        System.out.println(e.substring(3));
        System.out.println(e.replace('V','N'));
        System.out.println(e.length());


    }

}
