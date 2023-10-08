package com.raghutraining.session9;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdas {
	
	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> "Hello world!";
		String a = supplier.get();
		System.out.println("First string is " + a);
		
		Supplier<String> supplier2 = () -> 
		{
			System.out.println("Pre Hello!");
			return "Hello world!";
		};
		String b = supplier2.get();
		System.out.println("Second string is " + b);
		
		Consumer<String> consumer = (String t) -> System.out.println("Third string is " + t);
		consumer.accept("Hello Laddu!");
		
		Consumer<String> consumer2 = (String t) -> {
			System.out.println("Pre Hello2!");
			System.out.println("Fourth string is " + t);
		};
		consumer2.accept("Hello Jangiri!");
		
	}

}