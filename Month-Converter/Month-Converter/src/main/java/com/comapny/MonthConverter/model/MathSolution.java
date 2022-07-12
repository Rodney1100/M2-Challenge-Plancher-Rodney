//This criterion is linked to a Learning OutcomeAdd Endpoint: MathSolution object: operand1, operand2, operation, (correct) answer

package com.comapny.MonthConverter.model;

public class MathSolution {
    //    declarations ---------------------
    private double operand1;
    private double operand2;
    private String operation;
    private double answer;

    //    generated constructor
    public MathSolution(double uperand1, double uperand2, String operation, double answer ) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation= operation;
        this.answer = answer;
    }

    //default constructor

    public MathSolution() {
    }
    //    getter and setters below
    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer() {
        if (this.operation == "add") {
            this.answer = this.operand1 + this.operand2;
            return;
        }
        if (this.operation == "subtract") {
            this.answer = this.operand1 - this.operand2;
            return;
        }
        if (this.operation == "multiply") {
            this.answer = this.operand1 * this.operand2;
            return;
        }
        if (this.operation == "divide") {
            this.answer = (this.operand1 / this.operand2);
            return;
        }
    }

    //    toString is there
    @Override
    public String toString() {
        return "MathSolution{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                ", answer=" + answer +
                '}';
    }
}
