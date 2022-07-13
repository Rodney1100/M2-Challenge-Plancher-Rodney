package com.comapny.MonthConverter.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MathSolutionTest {
    MathSolution newMathSolution = new MathSolution();
    double uperand1;
    double uperand2;
    @Before
    public void setUp(){
     uperand1 = 6.0;
     uperand2 = 2.0;
        MathSolution newMathSolution = new MathSolution();
    }

    @Test
    public void shouldUseTheOperatorAndSolveANewMathProblemAdd() {
        double expectedOutput = 8.0;
        newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "add", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();
        assertEquals(expectedOutput,actualOutput,.0001);
    }
    @Test
    public void shouldUseTheOperatorAndSolveANewMathProblemSubtract() {
        double expectedOutput = 4.0;
        newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "subtract", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();
        assertEquals(expectedOutput,actualOutput,.0001);
    }
    @Test
    public void shouldUseTheOperatorAndSolveANewMathProblemMultiply() {
        double expectedOutput = 12.0;
        newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "multiply", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();
        assertEquals(expectedOutput,actualOutput,.0001);
    }
    @Test
    public void shouldUseTheOperatorAndSolveANewMathProblemDivide() {
        double expectedOutput = 3.0;
        newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "divide", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();
        assertEquals(expectedOutput,actualOutput,.0001);
    }
}
