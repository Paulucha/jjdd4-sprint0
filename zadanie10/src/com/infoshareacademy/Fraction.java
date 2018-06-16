package com.infoshareacademy;

public class Fraction {

    public int counter;
    public int denominator;
    public double value;

    public Fraction(int c, int d) {
counter = c;
denominator = d;

        value = (double) c / d;
    }
    public void writeFraction () {
        System.out.println(value + " [" + counter + "/" + denominator + "]");
    }
}





