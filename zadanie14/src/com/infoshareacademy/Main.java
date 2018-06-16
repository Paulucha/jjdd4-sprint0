package com.infoshareacademy;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner readNumber = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę naturalną A= ");
        int valueA = readNumber.nextInt();
        System.out.println("Podaj drugą liczbę naturalną B= ");
        int valueB = readNumber.nextInt();


        List<Integer> valueAList = new Divisor().findDiv(valueA);
        List<Integer> valueBList = new Divisor().findDiv(valueB);

List<Integer> printSame = new CompareList().returnSameDiv(valueAList,valueBList);
        System.out.println("Wspólne dzielniki liczby "+ valueA + " i " + valueB + " to " + printSame);
    }

}

