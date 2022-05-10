package org.ssglobal.training.codes.answers.ex2;

public class SampleArrays {

	public void createSingleArrays() {
		
		char[] letters = new char[5]; 
		letters[0] = 64;
		letters[1] = 'a';
		letters[2] = '\u20B1';
		letters[3] = 'C';
		letters[4] = '\t';
		
		String names[] = new String[10];
		names[names.length - 1] = "ABBA";
		int lenArray = letters.length;
		
		double[] grades = {78.5, 90.6, 100.5};
	}
	
	public void createMatrix() {
		int[][] matrix = new int[3][3];
		
		matrix[0][0] = 2;
		matrix[0][1] = 5;
		matrix[0][2] = 10;
		
		matrix[1][0] = 1;
		matrix[1][1] = 1;
		matrix[1][2] = 1;
		
		matrix[2][0] = 2;
		matrix[2][1] = 2;
		matrix[2][2] = 2;
		
		double[][] prices = new double[][] {{2.2, 1.1, 0.1},
									 		{3.6, 2.1, 9.6},
									 		{5.1, 1.4, 1.9}};
		
		for(double[] rowLookup: prices) {
			for(double colLookup: rowLookup) {
				System.out.println(colLookup);
			}
		}
	}
	
}
