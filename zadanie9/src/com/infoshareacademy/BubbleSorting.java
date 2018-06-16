package com.infoshareacademy;

public class BubbleSorting {
    public static class BubbleSortExample {
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {

                    if (arr[j - 1] > arr[j]) {

                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;

                    }


                }
                System.out.println();
                System.out.println("teraz następuje iteracja  nr " + i);
//                for(int k=0; k < arr.length; k++){
//                    System.out.print(temp + ", ");
//                }

            }

        }
    }
}
