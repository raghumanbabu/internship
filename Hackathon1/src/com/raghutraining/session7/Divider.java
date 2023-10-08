package com.raghutraining.session7;

@CommandKeyword(name = "divide")
public class Divider implements MathProcessor{

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		return leftVal/rightVal;
	}

}
