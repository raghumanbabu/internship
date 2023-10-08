package com.raghutrainingdeep4.session1;

import java.util.function.Consumer;

public class VetriConsumer implements Consumer<Student> {
    @Override
    public void accept(Student student) {
        System.out.println(student.name);
    }
}
