package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Divisor {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public List<Integer> findDiv(int value) {
        this.value = value;
        List<Integer> divA = new ArrayList<>();
        for (int i = 1; i <= value; i++) {

            if (value % i == 0) {
                divA.add(i);
//                System.out.println("Dzielnik liczby " + value + " to " + i);
            }
        }
//        System.out.println("Wszystkie dzielniki liczby " + value + " to " + divA);
        return divA;

//        System.out.println("Wszystkie dzielniki liczby " + value + " to " + divA);
    }
}

