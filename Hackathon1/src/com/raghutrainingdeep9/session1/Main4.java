package com.raghutrainingdeep9.session1;

public class Main4 {

    public static void main(String[] args) {
        System.out.println("Application started");
        while(true){
            System.out.println("Application is running");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
