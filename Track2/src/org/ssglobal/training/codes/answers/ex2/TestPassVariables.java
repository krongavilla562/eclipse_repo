package org.ssglobal.training.codes.answers.ex2;

public class TestPassVariables {

	public static void main(String[] args) {
		PassVariables cv = new PassVariables();
		
		// Primitive Var
		int testX = 10;
		System.out.format("This is the original num is %d. \n", testX);
		cv.passPrimitive(testX);
		System.out.format("This new num is %d. \n", testX);
		
		// Reference Var
		StringBuilder testSb = new StringBuilder("Manila");
		System.out.format("This is the original sb is %s. \n", testSb);
		cv.passRefVar(testSb);
		System.out.format("This is the new sb is %s. \n", testSb);

		
		String testStr = new String("Manila");
		System.out.format("This is the original testStr is %s. \n", testStr);
		cv.passStrVal(testStr);
		System.out.format("This is the new testStr is %s. \n", testStr);
	}

}
