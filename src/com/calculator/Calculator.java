package com.calculator;

final public class Calculator {

    public static void main(String[] args) {
        System.out.println(addition(12, 54));
        System.out.println(Calculator.subtract(5, 10));
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double addition(double a, double b) {
        return a + b;
    }
}
