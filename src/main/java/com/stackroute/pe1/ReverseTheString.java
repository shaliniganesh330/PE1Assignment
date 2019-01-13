/*Write a program to reverse any string without using String Buffer.*/
package com.stackroute.pe1;

public class ReverseTheString {
    public String reverseTheString(String string){
        String string1= "";
        int length =string.length();
        /*loop for printing the string*/
        for(int i= length-1 ; i >= 0; i--)
            string1= string1 + string.charAt(i);
            return string1;
            }
}

