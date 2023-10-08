package com.raghutrainingdeep2.session1;

public class Main {

    public static void main(String[] args) {

        //Suresh 10000110001100011010111111000111
        //Ammundi
        //20-01-1980
        //40
        //true
        //m
        //10,00,000.50

        //boolean
        //byte, short, int, long
        //float, double
        //char, String
        //enum

        boolean a = false; // true or false = 0 or 1

        byte b = 127; // -128 to +127 1111111
        byte c = 0b1111111;
        System.out.println(b);
        System.out.println(c);
        if(b == c){
            System.out.println("Hey they are equal!!!");
        }
        short d = 250; //-32768 to +32767
        int e = 1000000; //-2147483648
        long f = 100000000;
        float g = -10.354f;
        double h = 10.56777865437;

        char i = 'a'; //101110101

        String x = null;
        String j = "Hello"; // j = 100   100 = Hello
        String k = "Hi"; // k = 100
        String l = "Thanks"; // l = 100
        j = l;

        //var n = "Thanks";

        //Typecasting
        f = e;
        e = (int)f;

        //,._
        int m = 10_000_000; //10,000,000
        System.out.println(m);

        //Scientific notation
        double n = 3.2e14; //32*10^14 320000000000000
        double o = 3.2e-14;
    }


}
