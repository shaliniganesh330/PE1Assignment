/*Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should repeat
n number of times in the output String.*/
package com.stackroute.pe1;

public class RepeatTheString {

    public String repeatSubstring(String string, int number) {
        int length;
        String substring;
        length = string.length();
        substring = string.substring(length - number); //Assigns the substring
        /*code to add the substring n number of times
         */
        for (int i = 0; i < number; i++) {
            string = string + substring;
        }
        return string;
    }
}
