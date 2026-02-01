package com.example;

public class Calculator {

    public int calculate(int a, int b, String op) {
        return switch (op) {
            case "add", "add-again" -> add(a, b);
            case "sub", "sub-again" -> subtract(a, b);
            case "mul" -> multiply(a, b);
            case "div" -> divide(a, b);
            case "mod" -> a % b;
            case "pow" -> power(a, b);
            default -> 0;
        };
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return b == 0 ? 0 : a / b;
    }

    private int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
