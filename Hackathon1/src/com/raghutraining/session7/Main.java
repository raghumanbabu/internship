package com.raghutraining.session7;

public class Main {

	public static void main(String[] args) {
		process("differentiate", 100, 20);
	}

	private static void process(String keyword, double leftVal, double rightVal) {
		MathProcessor processor = retrieveProcessor(keyword);
		double result = processor.doCalculation(leftVal, rightVal);
		System.out.println("result = " + result);
	}

	private static MathProcessor retrieveProcessor(String keyword) {
		switch (keyword) {
		case "add":
			Adder a = new Adder();
			return a;
		case "subtract":
			return new Subtracter();
		case "multiply":
			return new Multiplier();
		case "divide":
			return new Divider();
		case "differentiate":
			Differentiate p = new Differentiate();
			return p;
		}
		return null;
	}

}
