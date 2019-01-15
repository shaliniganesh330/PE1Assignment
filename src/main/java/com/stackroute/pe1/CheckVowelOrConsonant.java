/*Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
Condition:
    a. Print an error message if the input is not a letter
    b. If the input having more than one letter, print the required output
          (Vowel or Consonant) for each letter*/
package com.stackroute.pe1;

public class CheckVowelOrConsonant {
    String vowelOrConsonant(String ch) {

        String string;
        string = ch.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            /*condition for checking whether a letter is vowel*/
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                return "vowel";
            }
            /*condition for checking whether a letter is consonant*/
            else {
                return "consonant";
            }
        }
        return null;
    }
}
