/* Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages */
package com.stackroute.pe1;

public class PalindromeCheck {
    String palindromeCheck(long num) {
        long digit;
        long rev = 0;
        long sum = 0;
        long temp;
        temp = num;
        while (num > 0) {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        /*checking for whether a number is PalindromeCheck or not*/
        if (temp == rev) {
            while (rev > 0) {
                num = rev % 10;
                if (rev % 2 == 0) {
                    /*checking for even number and adding up*/
                    sum = sum + num;
                }
                rev = rev / 10;
            }
            if (sum > 25) {
                return "number is PalindromeCheck and sum of even is greater than 25";
            } else {
                return "number is PalindromeCheck and sum of even is lesser than 25";
            }
        } else {
            return "not a Palidrome";
        }
    }
}