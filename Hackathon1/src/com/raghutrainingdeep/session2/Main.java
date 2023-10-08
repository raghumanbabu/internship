package com.raghutrainingdeep.session2;

public class Main {
    public static void main(String[] args) {

        int p = 100;
        switch (p){
            case 10:
                System.out.println("It is 10");
            case 50:
                System.out.println("It is 50");
            case 100:
                System.out.println("It is 100");
            case 1000:
                System.out.println("It is 2000");
            default:
                System.out.println("Unknown number");
        }










        String a = "Parthi";
        switch (a) {
            case "Parthi" -> {
                System.out.println("1111");
                System.out.println("aaaa");
            }
            default -> System.out.println("3333");
            case "Lokesh" -> System.out.println("2222");
        }




/*
        String b = "Parthi";
        switch (b){
            case "Parthi":
            case "Lokesh":
                System.out.println("4444");
                break;
            default:
                System.out.println("5555");
                break;
        }
*/
/*
        if(b == "Parthi" || b == "Lokesh"){
            System.out.println("4444");
        } else {
            System.out.println("5555");
        }

 */

        int c = 1000;
        final int x = 10;
        switch (c/10){
            case x:
            case x*10:
                System.out.println("4444");
                break;
            default:
                System.out.println("5555");
                break;
        }

    }
}
