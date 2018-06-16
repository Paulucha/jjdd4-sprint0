package com.infoshareacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg liter: ");
        String letters = scanner.nextLine();
        letters = letters.toLowerCase();
        letters = letters.trim();
        letters = letters.replace(" ", "");

        String alphabet = ("abcdefghijklmnopqrstuwxyz");

//        char[] charArray = letters.toCharArray();
//        char[] alphaArray = alphabet.toCharArray();

        for (int i = 0; i < letters.length(); i++) {

//                System.out.println(alphabet.replace(temp, ""));



//        }

//

    }}


