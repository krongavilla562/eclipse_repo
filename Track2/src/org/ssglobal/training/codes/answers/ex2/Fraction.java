package org.ssglobal.training.codes.answers.ex2;

public class Fraction {

	public int numerator;
	public int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void toFractionString() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public Fraction add(Fraction summand) {
		
		numerator = numerator * summand.denominator + summand.numerator * denominator;
		denominator = denominator * summand.denominator;
		
		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f;
	}
	
	public Fraction multiply(Fraction factor) {
		
		numerator = numerator * factor.numerator;
		denominator = denominator * factor.denominator;
		
		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f;
	}
	
	public boolean greaterEqual(Fraction comp) {
		
		return true;
	}
	
}
