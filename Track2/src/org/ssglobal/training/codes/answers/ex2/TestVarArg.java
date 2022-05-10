package org.ssglobal.training.codes.answers.ex2;

public class TestVarArg {

	public static void main(String[] args) {
		
		VarArg var = new VarArg();
		var.printNums(1, 2, 3);
		var.printNums();
		var.printNums(10, 11, 12, 13, 14);
	}
	
}
