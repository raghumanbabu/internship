package com.raghutraining.session7;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        process("differentiate", 100, 20);
    }

    private static void process(String keyword, double leftVal, double rightVal) {
        MathProcessor processor = retrieveProcessor(keyword);
        double result = processor.doCalculation(leftVal, rightVal);
        System.out.println("result = " + result);
    }

    private static MathProcessor retrieveProcessor(String keyword) {
		MathProcessor[] processors = {new Adder(), new Subtracter(), new Multiplier(), new Divider(), new Differentiate()};
		for(MathProcessor processor : processors) {
			CommandKeyword commandKeyword = processor.getClass().getAnnotation(CommandKeyword.class);
			String name = commandKeyword.name();
			if(keyword.equalsIgnoreCase(name)) {
				return processor;
			}
		}

        return null;
    }

}
