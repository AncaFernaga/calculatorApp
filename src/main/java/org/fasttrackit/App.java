package org.fasttrackit;

public class App 
{
    public static void main( String[] args) {
        Calculations calculations = new Calculations();

        calculations.addition(12, 65);
        calculations.subtraction(63, 10);
        calculations.division(30, 15.5);
        calculations.multiplication(8, 9);
        calculations.modulus(14, 14);
        calculations.increment(1, 2);

    }
}
