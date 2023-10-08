package com.raghutrainingdeep.session5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        whileBasic();
        //whileLogic();
        //forLogic();
        System.out.println("End");
    }

    private static void whileBasic() {


        int a =1;
        while(a<=5){


            System.out.println("Hello While!!!");
            a++;


            int b =101;
            while(b<=105){

                System.out.println("Hello inner While!!!");
                if(b==102){
                    return;
                }
                b++;

            }


        }




/*
        do{
            System.out.println("Hi While!!!");
            a++;
        } while(a<110);

*/







        int x = 1;
        while(x<5){
            System.out.println("Hello Ammundi" + x);
            x++;
            int y = 1;
            while(y<5){
                System.out.println("Hello Kuppathomottur" + y);
                y++;
            }
        }
    }

    private static void whileLogic() {

        int a = 1;
        while(a<=5){
            System.out.println(a);
            a++;
            int p = 100;
            while(p<=105){
                System.out.println(p);
                p++;
                if(p%2==0){
                    //break; //= stop and exit the loop;
                    //continue; //= skip and start the next loop;
                    //return; // return from the method without anything value
                }
                System.out.println("Test!!!");
            }
        }

        int b = 10;
        do{
            System.out.println(b);
            b++;
        }while(b<=5);

        //break
        //continue
        //return
    }

    private static void forLogic(){
        /*
        for(;;){
            System.out.println("Hiiii");
        }
         */






















        int[] d = {10,20,30,40,50};
        /*
        for(int a = 0; a<d.length; a++){
            System.out.println(d[a]);
        }
         */
        for(int a : d){
            System.out.println(a);
        }







        int[] m = {1,2,3};
        int[] q = {10,20,30};
        for (int n:m){

            System.out.println(n);
            for(int r:q){
                System.out.println(r);
            }

        }










        for(int a = 1; a<5; a++){
            System.out.println(a);
            for(int b = 1; b<5; b++){
                System.out.println(b);
            }
        }

        int[][] x = {{1,2,3},{10,20,30}};
        for(int a = 0; a<x.length; a++){
            for(int b = 0; b<x[a].length; b++){
                System.out.println(x[a][b]);
            }
        }
        for(int[] a : x){
            for(int b : a){
                System.out.println(b);
            }
        }

    }


}
