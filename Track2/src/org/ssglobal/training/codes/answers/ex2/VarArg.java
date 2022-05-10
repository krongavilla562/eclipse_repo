package org.ssglobal.training.codes.answers.ex2;

public class VarArg {

	public void printNums(int... nums) {
		
		for(int lookup: nums) {
			System.out.println(lookup);
		}
		
	}
	
}
