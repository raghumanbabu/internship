package com.raghutraining.session7;

@CommandKeyword(name = "multiply")
public class Multiplier implements MathProcessor{

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		return leftVal * rightVal;
	}

}
