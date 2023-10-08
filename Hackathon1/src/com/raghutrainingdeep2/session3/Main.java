package com.raghutrainingdeep2.session3;

public class Main {

    public static void main(String[] args) {
        // + - * / %

        // ++ --
        double a = 10;
        //a++; // a= a+1;
        //a = a + 2;
        System.out.println(a++); //11

        System.out.println(a); //11


        System.out.println("--------------------------------------------------");

        int b = 10;
        //++b; // b = b + 10;
        System.out.println(++b);
        System.out.println(b);

        //= < > <= >= += -= *= /= %=
        //=
        //>  10>2


        //& | ^ && ||
        //true || false = true
        //false || false = false
        //true && false = false
        //true && true = true
        //true ^ true = false
        //false ^ false = false
        //true ^ false = true
        //false ^ true = true
        if(true || false){
            System.out.println("Hello world");
        }
        if(true && true){
            System.out.println("Hello world222");
        }

        // ?:
        int c = 5;
        int d = c > 10 ? ++c : --c;
        System.out.println(d);

        //instanceof
        Integer e = 100;
        System.out.println(e instanceof Integer);

        boolean f = (a * (b + c)  > 1000) && true;
        System.out.println(f);

        //Math
        int g = Math.max(100,200);
        System.out.println(g);

        var h = "Parthi";

        helper(10,20,30,40);
        helper2(10,20,30,40);
        helper3("Hi",true,10,20,30,40);
    }

    public static void helper(int a, int b, int c, int d){
    }

    public static void helper2(int... a){
    }

    public static void helper3(String b, Boolean c, int... a){
    }

}
