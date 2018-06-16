package com.infoshareacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");

        long value;

        while (true) {
            try {
                value = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj liczbę ,nie literę!");
            }
        }


        if (value >= 0) {

            if (value == 0) {
                System.out.println(" Twoja " + value + " liczba ciągu Fibonaciciego to 0");

            } else if (value == 1) {
                System.out.println(" Twoja " + value + " liczba ciągu Fibonaciciego to 1");
            } else if (value > 1) {
                long f0 = 0;
                long f1 = 1;
                long f = 0;
                for (int i = 2; i <= value; i++) {
                    f = f0 + f1;
                    f0 = f1;
                    f1 = f;

                }
                System.out.println("Twoja " + value + " liczba ciągu Fibonaciciego to " + f + "!");
            } else {
                System.out.println("Podałeś liczbę ujemną!");
             scanner.next();
            }


        } else System.out.println("Podałeś liczbę ujemną, spróbuj jeszcze raz.");
    }}


}
