/*Write a program which accepts an integer number as input from the user and perform the following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/
package com.stackroute.pe1;

public class OddEvenCheck {
    String oddEven(int num) {
        if (num % 2 == 0) {
            if (num >= 20 && num <= 30)
                return "Jerry";
            else
                return "Invalid input";
        } else
            return "Tom";
    }
}













