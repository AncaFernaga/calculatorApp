package org.fasttrackit;

public class App {

    public static void main(String[] args) {
        Calculations calculations = new Calculations();

        calculations.addition(12, 65);
        calculations.subtraction(63, 10);
        calculations.division(30, 15.5);
        calculations.multiplication(8, 9);
        calculations.modulus(14, 14);
        calculations.increment(1, 2);

        // using decimal numbers

        CalculationsDecimals calculationsDecimals = new CalculationsDecimals();

        calculationsDecimals.addition(14.3, 8.1);
        calculationsDecimals.multiplication(5.5, 4.7);
        calculationsDecimals.subtraction(265.8, 987.4);
        calculationsDecimals.division(96.9, 22.7);


    }
}
