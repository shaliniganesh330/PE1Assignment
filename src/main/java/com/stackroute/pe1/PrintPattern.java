/*Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.
 Input: 5
 Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5*/
package com.stackroute.pe1;

public class PrintPattern {
    String patternCheck(int num) {
        int i, j;
        String string = "";
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                string += i;
            }
        }
        return string;
    }
}