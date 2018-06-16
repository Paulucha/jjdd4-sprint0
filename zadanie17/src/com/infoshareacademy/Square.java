package com.infoshareacademy;

public class Square implements Figure {
    double sideA;
    double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double countArea(double height, double base) {
        this.sideA = height;
        this.sideB = base;
        double score = sideA * sideB;

        return score;
    }

    @Override
    public double countCircum(double sideA, double sideB) {
        this.sideB = sideB;
        this.sideA = sideA;
        double score = 2 * (sideA + sideB);

        return score;
    }
}