package com.paulucha;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną misiaczku: ");

        int value = 0;

        while (true) {

            try {
                value = scanner.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("zamiast liczby podałeś ciąg liter, spróbuj jeszcze raz!");
                scanner.next();
            }

            if (value > 0) {
                break;
            }
        }


        int temp = value;

        ArrayList<Integer> array = new ArrayList<Integer>();

        do {
            array.add(temp % 10);
            temp /= 10;
        } while (temp > 0);

        System.out.print("Twoja odwrócona liczba to: ");

//        int wynik = 0;

        for (int i : array) {

          System.out.print(i);
        }
//        System.out.println(wynik);
        System.out.println("");

        String array2 = array.toString().replaceAll("\\[|\\]", "").replaceAll(",", "\t").replaceAll("\\s+ ", "");

        String value2 = String.valueOf(value);
        if (array2.equals(value2)) {
            System.out.println("Twoja liczba to palindrom!");
        } else System.out.println("Przykro mi, Twoja liczba nie jest palindromem *smutnaminka* ");

    }


}




