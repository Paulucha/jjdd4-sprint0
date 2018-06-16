package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wybierz działanie do wykoniania: " + MathCalc.Odejmowanie + " czy " + MathCalc.Dodawanie + " czy " + MathCalc.Dzielenie + " czy " + MathCalc.Mnozenie);

        int ileLiczb;
        String wybranieDzialanie;
        while (true) {

            Scanner dzialania = new Scanner(System.in);
            wybranieDzialanie = dzialania.nextLine();

            ileLiczb = 0;
            if (MathCalc.Mnozenie.toString().equals(wybranieDzialanie)) {
                System.out.println("Wybrałeś " + wybranieDzialanie + " Newtonie");
                System.out.println();

                //  pobieranieLiczb {

                Scanner wczytaj = new Scanner(System.in);
                System.out.print("Ile liczb chcesz użyć do działania? ");

                System.out.println();

                ileLiczb = 0;

                while (true) {
                    try {
                        ileLiczb = wczytaj.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Podaj poprawną liczbę!");
                        // ignoring wrong token
                        wczytaj.next();


                    }
                    if (ileLiczb > 0) {
                        break;
                    }
                }




                if (ileLiczb < 0) {
                    throw new IllegalArgumentException(String.format("Nie można wymnożyć -" + ileLiczb));
                }


                System.out.println("Wybrałeś " + ileLiczb + " liczb(y) do działania " + wybranieDzialanie + ".");
                System.out.println();
                double[] tab = new double[ileLiczb];
                for (int i = 0; i < ileLiczb; i++) {
                    int s = i + 1;
                    System.out.println("Podaj " + s + " liczbę do " + wybranieDzialanie + ":");
                    tab[i] = wczytaj.nextDouble();
                }
                System.out.println();


                double wynik = 1;
                for (int i = 0; i < ileLiczb; i++) {

                    wynik *= tab[i];

                }
                System.out.println("Wynik Twojego działania to: ");
                for (int i = 0; i < ileLiczb; i++) {
                    System.out.print(tab[i] + " + ");


                }


                System.out.println(" = " + wynik);

                break;


            } else if (MathCalc.Dzielenie.toString().equals(wybranieDzialanie)) {
                System.out.println("Wybrałeś " + wybranieDzialanie + " Pitagorasie");
                System.out.println();
                Scanner wczytaj = new Scanner(System.in);
                System.out.print("Ile liczb chcesz użyć do działania? ");
                System.out.println();

                ileLiczb = wczytaj.nextInt();
                System.out.println("Wybrałeś " + ileLiczb + " liczb(y) do działania " + wybranieDzialanie + ".");
                System.out.println();
                double[] tab = new double[ileLiczb];
                for (int i = 0; i < ileLiczb; i++) {
                    int s = i + 1;
                    System.out.println("Podaj " + s + " liczbę do " + wybranieDzialanie + ":");
                    tab[i] = wczytaj.nextDouble();
                    if (tab[i] == 0) {
                        System.out.println("Nie dziel przez zero cholero!");

                    }
                }
                System.out.println();


                double wynik = 1;
                for (int i = 0; i < ileLiczb; i++) {

                    wynik /= tab[i];

                }
                System.out.println("Wynik Twojego działania to: ");
                for (int i = 0; i < ileLiczb; i++) {
                    System.out.print(tab[i] + " / ");
                }
                System.out.println(" = " + wynik);
                break;


            } else if (MathCalc.Dodawanie.toString().equals(wybranieDzialanie)) {
                System.out.println("Wybrałeś " + wybranieDzialanie + " Arystotelesie");
                System.out.println();
                Scanner wczytaj = new Scanner(System.in);
                System.out.print("Ile liczb chcesz użyć do działania? ");
                System.out.println();
                ileLiczb = wczytaj.nextInt();
                System.out.println("Wybrałeś " + ileLiczb + " liczb(y) do działania " + wybranieDzialanie + ".");
                System.out.println();
                double[] tab = new double[ileLiczb];
                for (int i = 0; i < ileLiczb; i++) {
                    int s = i + 1;
                    System.out.println("Podaj " + s + " liczbę do " + wybranieDzialanie + ":");
                    tab[i] = wczytaj.nextDouble();
                }
                System.out.println();


                double wynik = 1;
                for (int i = 0; i < ileLiczb; i++) {

                    wynik += tab[i];

                }
                System.out.println("Wynik Twojego działania to: ");
                for (int i = 0; i < ileLiczb; i++) {
                    System.out.print(tab[i] + " + ");
                }
                System.out.println(" = " + wynik);
                break;
            } else if (MathCalc.Odejmowanie.toString().equals(wybranieDzialanie)) {
                System.out.println("Wybrałeś " + wybranieDzialanie + " Archimedesie");
                System.out.println();
                Scanner wczytaj = new Scanner(System.in);
                System.out.print("Ile liczb chcesz użyć do działania? ");
                System.out.println();
                ileLiczb = wczytaj.nextInt();
                System.out.println("Wybrałeś " + ileLiczb + " liczb(y) do działania " + wybranieDzialanie + ".");
                System.out.println();
                double[] tab = new double[ileLiczb];
                for (int i = 0; i < ileLiczb; i++) {
                    int s = i + 1;
                    System.out.println("Podaj " + s + " liczbę do " + wybranieDzialanie + ":");
                    tab[i] = wczytaj.nextDouble();
                }
                System.out.println();


                double wynik = 1;
                for (int i = 0; i < ileLiczb; i++) {

                    wynik -= tab[i];

                }
                System.out.println("Wynik Twojego działania to: ");
                for (int i = 0; i < ileLiczb; i++) {
                    System.out.print(tab[i] + " - ");
                }
                System.out.println(" = " + wynik);
                break;
            } else {
                System.out.println(" Wybrałeś złe działanie, spróbuj jeszcze raz gołąbie!");
                System.out.println();

            }
        }


    }
}
