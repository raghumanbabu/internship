package com.raghutraining.session7;

@CommandKeyword(name = "differentiate")
public class Differentiate implements  MathProcessor{
    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return leftVal + rightVal + 2;
    }
}
