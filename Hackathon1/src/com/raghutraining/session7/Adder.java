package com.raghutraining.session7;

@CommandKeyword(name = "add")
public class Adder implements MathProcessor{

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		return leftVal + rightVal;
	}

}
