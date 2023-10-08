package com.raghutrainingdeep8.session3;

public class Main {

    public static void main(String[] args) {
        try {
            logic();
        } catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        int x = 10;
        x++;
        int y = 20;
        y--;
        System.out.println(x);
        System.out.println(y);
    }

    private static void logic() throws ArithmeticException{
            int a = 3;
            while (a > 0) {
                if (a == 2) {
                    int b = a / 0;
                    System.out.println("Listen to the input and print output!!!");

                } else {
                    System.out.println("Listen to the input and print output!!!");
                }
                a--;
            }
    }

}
