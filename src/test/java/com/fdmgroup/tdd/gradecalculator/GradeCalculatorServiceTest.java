package com.fdmgroup.tdd.gradecalculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorServiceTest {
	
	GradeCalculator gradeCalculator = new GradeCalculator();
	
	// Parameterized test for each conditions
	
	@ParameterizedTest
	@ValueSource(doubles = {-1, -35, 106})
	public void testInvalid(double mark) {
		
		assertEquals("Invalid marks, please enter a mark between 0-100", gradeCalculator.getClassification(mark));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {0, 40, 74})
	public void testFail(double mark) {
		
		assertEquals("fail", gradeCalculator.getClassification(mark));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {75, 79, 77})
	public void testPass(double mark) {
		
		assertEquals("pass", gradeCalculator.getClassification(mark));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {80, 85, 89})
	public void testMerit(double mark) {
		
		assertEquals("merit", gradeCalculator.getClassification(mark));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {90, 95, 100})
	public void testDistinction(double mark) {
		
		assertEquals("distinction", gradeCalculator.getClassification(mark));
	}
	
	
	
}
