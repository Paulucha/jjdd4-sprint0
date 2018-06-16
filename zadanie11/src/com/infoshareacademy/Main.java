package com.infoshareacademy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("podaj liczbę:");
        Scanner getDecNum = new Scanner(System.in);
        int num = getDecNum.nextInt();
        // SPRAWDZENIE
        System.out.println();
        System.out.println("Sprawdzenie");
        System.out.println("Postać binarna: " + Integer.toBinaryString(num));
        System.out.println("Postać szesnastkowa: " + Integer.toHexString(num));
        System.out.println();

//MOJA METODA

        List binList = new ArrayList();


        for (int i = 0; 0 < num; i++) {
            if (num % 2 == 0) binList.add(0);
            else binList.add(1);
            num = num / 2;

        }
        System.out.println("Twoja liczba w postaci binarnej to: ");
        Collections.reverse(binList);
//        System.out.println(binList);

        String stringBinary = Arrays.toString(binList.toArray()).replaceAll(", ", "").replaceAll("\\[|\\]", "");


        System.out.println(stringBinary);


    }
}
