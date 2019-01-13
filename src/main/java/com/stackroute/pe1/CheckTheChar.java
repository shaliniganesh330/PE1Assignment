/*Write a program that takes a character from the user as input and determines whether the
character entered is a capital letter, a small case letter, a digit or a special symbol and
 display appropriately.*/
package com.stackroute.pe1;

import static java.lang.Character.*;

public class CheckTheChar {
    public String charCheck(char ch) {

//checking for uppercase
        if (isUpperCase(ch))
            return "Capital letter";
//checking for lowercase
        else if (isLowerCase(ch))
            return "Small letter";
//checking for digit
        else if (isDigit(ch))
            return "Digit";
        else
//Else print Special character
            return "Special character";
    }
}

