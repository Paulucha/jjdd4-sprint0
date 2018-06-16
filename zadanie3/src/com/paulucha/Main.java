package com.paulucha;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb:");
        int x = scanner.nextInt();
        System.out.println("Podaj ilość przedziałów: ");
        int y = scanner.nextInt();
        System.out.println("Podaj zakres liczb:");
        int z = scanner.nextInt();


        int intervalLenght = z / y;

        int[] randomNumber = new int[x];

        for (int i = 0; i < x; i++) {
            randomNumber[i] = (int) (Math.random() * z) + 1;
        }
        System.out.println("Twoje wylosowane liczby to :" + Arrays.toString(randomNumber));

        for (int i = 1; i <= y; i++) {
            int howMany = 0;
            for (int j = 0; j < x; j++) {
                if (randomNumber[j] >= (i - 1) * intervalLenght + 1 && randomNumber[j] <= i * intervalLenght) {
                    howMany += 1;
                }
            }
            System.out.println("Z przedziału nr " + i + " o zakresie: " + ((i - 1) * intervalLenght + 1) + " - " + i * intervalLenght + " wylosowano " + howMany + " liczb (y).");

        }
    }
}
