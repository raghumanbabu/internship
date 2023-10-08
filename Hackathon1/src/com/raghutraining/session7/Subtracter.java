package com.raghutraining.session7;

@CommandKeyword(name = "subtract")
public class Subtracter implements MathProcessor{

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		return leftVal - rightVal;
	}

}
