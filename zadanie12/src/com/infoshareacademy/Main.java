package com.infoshareacademy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        File inputFile = new File("input.txt");
        Scanner inputRead = new Scanner(new File("input.txt"));

        String text = inputRead.nextLine();
        System.out.println();
        System.out.println("Wyświetlenie pliku " + inputFile + " :");
        System.out.println(text);
        text = text.toLowerCase();
        text = text.replaceAll(" ", "");
        System.out.println();
        System.out.println("Zamiana na tablicę i wyświetlenie poszczególnych elementów tablicy: ");
        String[] splitedArray = null;
        splitedArray = text.split(",");
        for (int i = 0; i < splitedArray.length; i++) {


            System.out.println(splitedArray[i]);
        }
        System.out.println();
        System.out.println("Wyświetlenie w kolejności alfabetycznej: ");
        Arrays.sort(splitedArray);
        for (int i=0; i < splitedArray.length; i++) {
            System.out.println(splitedArray[i]);
        }
    }
}
