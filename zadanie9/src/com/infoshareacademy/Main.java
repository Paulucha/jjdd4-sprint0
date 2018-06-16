package com.infoshareacademy;

import java.lang.reflect.Array;

import static com.infoshareacademy.BubbleSorting.BubbleSortExample.bubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{5, 7, 9, 4, 2, 8, 5};


        System.out.println("Talica przed sortowaniem: ");

        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        bubbleSort(array);//sorting array elements using bubble sort

        System.out.println("Tablica po sortowaniu: ");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }

    }
    }
