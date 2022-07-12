package com.comapny.MonthConverter.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MathSolutionTest {
    @Test
    public void shouldUseTheOperatorAndSolveANewMathProblemAdd() {
        MathSolution newMathSolution = new MathSolution();
        double uperand1 = 6.0;
        double uperand2 = 2.0;
        double expectedOutput = 8.0;
        newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "add", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();
        assertEquals(expectedOutput,actualOutput,.0001);
    }
    @Test
    public void shouldUseTheOperatorAndSolveANewMathProblemSubtract() {
        MathSolution newMathSolution = new MathSolution();
        double uperand1 = 6.0;
        double uperand2 = 2.0;
        double expectedOutput = 4.0;
        newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "subtract", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();
        assertEquals(expectedOutput,actualOutput,.0001);
    }
    @Test
    public void shouldUseTheOperatorAndSolveANewMathProblemMultiply() {
        MathSolution newMathSolution = new MathSolution();
        double uperand1 = 6.0;
        double uperand2 = 2.0;
        double expectedOutput = 12.0;
        newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "multiply", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();
        assertEquals(expectedOutput,actualOutput,.0001);
    }
    @Test
    public void shouldUseTheOperatorAndSolveANewMathProblemDivide() {
        MathSolution newMathSolution = new MathSolution();
        double uperand1 = 6.0;
        double uperand2 = 2.0;
        double expectedOutput = 3.0;
        newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "divide", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();
        assertEquals(expectedOutput,actualOutput,.0001);
    }
}
