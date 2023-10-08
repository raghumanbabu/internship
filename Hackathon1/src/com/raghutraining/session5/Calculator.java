package com.raghutraining.session5;

public class Calculator {

    public Calculator(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }

    int x;
    int y;
    int z;

    public void calculate(){
        try{
            int p = (x + y) / z;
            System.out.println(p);
        } catch(Exception aexcp){
            //aexcp.printStackTrace();
            System.out.println("Error happened during the calculation : " + aexcp.getMessage());
        } finally {
            System.out.println("Calculation is completed!!!");
        }
    }

}
