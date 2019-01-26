package org.fasttrackit;

public class Calculations {
    static void newMethod() {
        int a = 2;
        int b = 10;
    }

    public int subtraction(int a, int b) {
        int total = b - a;
        System.out.println("The result is: " + total);
        return total;
    }

    public int addition(int a, int b) {
        int total = a + b + 3;
        System.out.println("The result is: " + total);
        return total;
    }

    public double multiplication(int a, int b) {
        double total = a * b * 1.2;
        System.out.println("The result is: " + total);
        return total;
    }

    public double division(int a, int b) {
        double total = b / a / 0.1;
        System.out.println("The result is: " + total);
        return total;
    }

    public int modulus(int a, int b) {
        int total = b % a;
        System.out.println("The result is: " + total);
        return total;
    }

    public int increment(int a, int b) {
        int total = ++a;
        System.out.println("The result is: " + total);
        return total;
    }
 }



