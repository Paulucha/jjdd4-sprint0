package com.infoshareacademy;

public class Triangle implements Figure {

    double height;
    double base;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    public double countArea(double height, double base) {
        this.base = base;
        this.height = height;
        double score = 0.5 * (base * height);
//        System.out.println(score);
        return score;
    }


    public double countCircum(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        double score = 2 * sideA + sideB;
//        System.out.println(score);
        return score;
    }
}
