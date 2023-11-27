package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculator implements GradeCalculatorService{

	
	private String result;
	
	
	@Override
	public String getClassification(double mark) {
		
		// Check if marks fall within a certain range
		
		if (mark < 0 || mark > 100) {
			result = "Invalid marks, please enter a mark between 0-100";
		} else if (mark < 75) {
			result = "fail";
		} else if (mark >= 75 && mark < 80) {
			result = "pass";
		} else if (mark >= 80 && mark < 90) {
			result = "merit";
		} else if (mark >= 90 && mark <= 100) {
			result = "distinction";
		}
		return result;
	}	

}
