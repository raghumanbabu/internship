package com.raghutraining.session9;

import java.util.function.Supplier;

public class SupplierClass implements Supplier<String> {
    @Override
    public String get() {
        return "Hello World!!!";
    }
}
