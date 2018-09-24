package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private String operator;
    private double rightOperand;

    public Calculator(double leftOperand, String operator, double rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public Calculator() {
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public double calculateResult() {
        double result = 0.0;

        switch (operator) {
            case "+": result = leftOperand + rightOperand; break;
            case "-": result = leftOperand - rightOperand; break;
            case "*": result = leftOperand * rightOperand; break;
            case "/": result = leftOperand / rightOperand; break;
            default: result = 0; break;
        }

        return result;
    }
}
