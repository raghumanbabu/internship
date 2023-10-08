package com.raghutrainingdeep.session1;

public class Main {

    public static void main(String[] args) {
        //conditional statement
        //single line - one block by default,  Multiple line {block}
        boolean a = false;
        if(a) {
            System.out.println("1111");
            System.out.println("Hello world!!!");
        } else {
            System.out.println("2222");
        }

        int b = 10;
        if(b > 5) {
            System.out.println("3333");
            System.out.println("Hello world3333!!!");
        } else {
            System.out.println("4444");
        }

        //&&-AND  ||-OR
        int c = 10;
        if(c > 5 && c < 8) {
            System.out.println("5555");
            System.out.println("Hello world5555!!!");
        } else if(c > 8){
            System.out.println("6666");
        } else {
            System.out.println("7777");
        }


        int d = 9;
        if(d > 5) {
            System.out.println("8888");
            System.out.println("Hello world8888!!!");
            if(d < 8){
                System.out.println("9999");
            } else {
                System.out.println("9111");
            }
        } else if(d > 8){
            System.out.println("9222");
        } else {
            System.out.println("9333");
        }

    }

}
