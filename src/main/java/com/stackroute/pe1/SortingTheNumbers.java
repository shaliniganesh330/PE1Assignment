/*Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.*/
package com.stackroute.pe1;

public class SortingTheNumbers {
    public int sortingTheNumbers(int array) {
        int[] arrayone = new int[20];
        int s, i;
        /*putting the integer into the array*/
        for (i = 0; array > 0; array = array / 10, i++) {
            s = array % 10;
            arrayone[i] = s;
        }
        /*sorting the digits in non increasing order*/
        for (int k = 0; k < i - 1; k++) {
            for (int j = 0; j < i - k - 1; j++) {
                if (arrayone[j] < arrayone[j + 1]) {
                    int temp = arrayone[j];
                    arrayone[j] = arrayone[j + 1];
                    arrayone[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < i; k++) {
        }
        int sum = 0;
        for (int k = 0; k < i; k++) {
            if (arrayone[k] % 2 == 0)            //summing the even numbers
                sum += arrayone[k];
        }
        return sum;
    }
}

