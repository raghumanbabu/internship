package com.raghutrainingdeep10.exam;

public class Main12 {

    public static void main(String[] args) {
        logic(200);
        logic(2000);
        logic(20);
    }

    private static void logic(int a) {
        final int x = 2;
        switch (a /10){
            case x:
            case x*10:
                System.out.println("Hello");
                break;
            case x *100:
                System.out.println("Hi");
                break;
            default:
                System.out.println("Thanks");
                break;
        }
    }

}
