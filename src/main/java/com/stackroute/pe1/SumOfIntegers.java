/*Write a program that reads an unspecified number of integer arguments using Scanner Class and adds
them together. The program should display total of the given input number and should only consider
integer value.The program should display an error message if there are any non integer values*/
package com.stackroute.pe1;

public class SumOfIntegers {
    public int integerSum(String string) {
        int sum = 0;
        int i = 0;
        String[] str1 = string.split(" ");
        while (i <= str1.length) {
            sum = sum + Integer.parseInt(str1[i]);
            i++;
        }
        return sum;
    }
}








