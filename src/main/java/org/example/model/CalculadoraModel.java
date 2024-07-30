package org.example.model;

public class CalculadoraModel {
    private double result;


    public double add(double num1, double num2){
        result = num1 + num2;
        return result;
    }

    public double subtract(double num1, double num2){
    result = num1 - num2;
        return result;
    }

    public double multiply(double num1, double num2){
        result = num1 * num2;
        return result;
    }

    public double divide(double num1, double num2){
        if (num2!=0){
            result = num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero");
        }
        return result;
    }

    public double getResult() {
        return result;
    }

}
