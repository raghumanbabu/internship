package com.raghutrainingdeep7.session2;

public class Animal {

    public static String group = "PetAnimal";
    public String name;

    public static String getGroup(){
        return group;
    }

    public void printInfo(){
        System.out.println(name);
    }

    public static void createAnimalObj(){
        Animal p = new Animal();
        Animal q = new Animal();
    }

}
