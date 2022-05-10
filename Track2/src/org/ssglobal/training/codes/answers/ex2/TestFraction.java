package org.ssglobal.training.codes.answers.ex2;

public class TestFraction {

	public static long id = 90;
	
	public static void main(String[] args) {
		
		Fraction f1 = new Fraction();
		f1.numerator = 1;
		f1.denominator = 2;
		
		Fraction f2 = new Fraction();
		f2.numerator = 3;
		f2.denominator =4;
		
		f1.add(f2).toFractionString();

	}

}
