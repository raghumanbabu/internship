package com.raghutrainingdeep10.exam;

public class Main3 {

    public static void main(String[] args) {
        int a = 10;
        if((a > 5 && a < 10) || (a > 5 && a > 10)) {
            System.out.println("Hello");
        } else if(a < 10){
            System.out.println("Hi");
        } else if((a > 5 && a > 10) || (a > 5 || a > 10)){
            System.out.println("Thanks");
        } else {
            System.out.println("Bye");
        }
    }

}
