package com.raghutrainingdeep5.session2;

public class InternationalStudent implements GenericStudentTemplate {
    @Override
    public void sayGoodMorning() {
        System.out.println("Good morning in the class");
    }
    public int fetchRollNumber(String studentName) {
        return 0;
    }
}
