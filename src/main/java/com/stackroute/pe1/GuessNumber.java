/*Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100)
User should guess until the the target number is guessed correctly.
Print separate messages for the following:
    a. Number guessed is more than original number
    b. Number guessed is less than original number
    c. Number guessed matches the original number*/
package com.stackroute.pe1;
import java.util.Random;
import java.util.*;

public class GuessNumber {
    public String guess(int num) {
        /*Random class to generate a random number*/
        Random random = new Random();
        int rand_int;
        rand_int = random.nextInt(50);
        /*checking for conditions*/
        if (num < rand_int && num > -1) {
            return "Number guessed is lesser";
        }
        if (num > rand_int) {
            return "Number guessed is greater";
        }
        if (num == rand_int) {
            return "Number guessed is correct";
        }
        return "null";
    }
}




















