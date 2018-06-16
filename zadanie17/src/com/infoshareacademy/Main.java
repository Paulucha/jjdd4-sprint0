package com.infoshareacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość trójkąta: ");
        double height = scanner.nextInt();
        System.out.println("Podaj podstawę trójkąta: ");
        double base = scanner.nextInt();
        System.out.println("Podaj bok trójkąta: ");
        double sideA = scanner.nextInt();
        double sideB = base;

        double TrCir = new Triangle().countCircum(sideA, sideB);
        double TrAr = new Triangle().countArea(height, base);


        System.out.println("Trójkąt");
        System.out.println("|---------|-----------|");
        System.out.println("|  POLE   |   OBWÓD   |");
        System.out.println("|---------|-----------|");
        System.out.printf("|  %.2f   |   %.2f  |\n", TrAr, TrCir);
        System.out.println("|---------|-----------|");

    }

}
