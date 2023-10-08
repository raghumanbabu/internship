package com.raghutrainingdeep5.session2;

public class Main {

    public static void main(String[] args) {
        GenericStudentTemplate a = new InternationalStudent();
        a.sayGoodMorning();
        GenericStudentTemplate a2 = new InternationalStudent();
        a2.sayGoodMorning();

        System.out.println("Good morning in method");

        GenericStudentTemplate b = new GenericStudentTemplate() {
            @Override
            public void sayGoodMorning() {
                System.out.println("Good morning in Anonymous class");
            }
        };
        b.sayGoodMorning();

        GenericStudentTemplate b2 = new GenericStudentTemplate() {
            @Override
            public void sayGoodMorning() {
                System.out.println("Good morning folks in Anonymous class");
            }
        };
        b2.sayGoodMorning();

        GenericStudentTemplate c = () -> System.out.println("Good morning in Lambda expression");
        c.sayGoodMorning();

    }

}
