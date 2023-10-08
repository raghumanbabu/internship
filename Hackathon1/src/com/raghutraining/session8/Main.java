package com.raghutraining.session8;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello main thread!!!");//1
        Thread t1 = new Thread();//1
        t1.start();//2
        t1.run();//2
        run();//1

    }

    public static void run(){
        System.out.println("Hello run!!!");//1
    }

}
