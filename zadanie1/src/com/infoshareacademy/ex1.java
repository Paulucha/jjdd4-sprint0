package com.infoshareacademy;

public class ex1 {
    public int product(int a, int b) {
        int i = 1;
        int d = 0;
        int g = Math.abs(b);
        int h = Math.abs(a);
        while (i <= g) {
            d = d + h;
            i++;

            /**
             * a = 2, b = 4
             * i = 1
             * d = 0
             *
             * i <= b
             * i <= 4
             * d = d + a;
             *
             */

        }

        if ((a > 0) && (b < 0)) {
            return -d;
        } else if ((a < 0) && (b > 0)) {
            return -d;
        } else if (a > 0 && b > 0) {
            return d;
        }
     else
            return d;
}
}





