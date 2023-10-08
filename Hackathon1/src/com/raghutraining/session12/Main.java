package com.raghutraining.session12;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        boolean a = Pattern.matches("[a-c]+", "aaaaab");
        System.out.println(a);
    }

}
