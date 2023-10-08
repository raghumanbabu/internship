package com.raghutraining.session3;

public class Main {
    public static void main(String[] args) {
        int a;
        long b = 1000;
        float c = 5.2f;
        double d = 10000.509;

        char f = 'x';
        boolean g = true;
        Animal h = Animal.Lion;
        String e = "Anand";
        int[] z = {10, 20, 30, 40, 50};
        Dummy y = new Dummy();

        Integer a1 = 10;
        Boolean g1 = true;
        System.out.println(a1.doubleValue());

        /*
        String x = "";
        String y = null;
        String z = " ";
        String p = "Hello";
        String q;
        String r = "null";
        */

        int x = 10;
        int[] xx = new int[10];
        //O(1)

        //Collections - List, Map, Set, Queue
        ArrayListLogic p = new ArrayListLogic();
        p.sample();

        HashSetLogic q = new HashSetLogic();
        q.sample();

        HashMapLogic r = new HashMapLogic();
        r.sample();

        Animal xxx = Animal.Tiger;

    }
}
