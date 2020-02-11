package main.java.challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Paolo Espiritu Source:
 * https://www.reddit.com/r/dailyprogrammer/comments/cmd1hb/20190805_challenge_380_easy_smooshed_morse_code_1/
 */
 class smorse{
    /**
     * Brief:
     *  For the purpose of this challenge, Morse code represents every letter 
     *  as a sequence of 1-4 characters, each of which is either . (dot) or - (dash). 
     *  The code for the letter a is .-, for b is -..., etc.
     * 
     *  Returns a string of smooshed morse code
     *      - a letter is represented as a sequence of 1-4 characters
     *      - I know nothing about morse lol research:
     *      https://en.wikipedia.org/wiki/Morse_code
     * 
     * Initial thoughts:
     *  - two sided array to cross reference a string input?
     *  - Hashmap?
     *  - tuple?
     */ 
    public static String smooch(String message){
        return "";
     }

    /**
     * HashMap Solution
     * solution:
     *  - declare the map
     *  - iterate char of input
     *  - access what the morse for the char
     *  - concat the morse to a temp string
     */

    public static String hashSmooch(String input){
        String morse = "";
        Map<Character, String> map = new HashMap<>();
        char[] tempArr = input.toCharArray();
        decodeMorse(map);

        for(char x: tempArr){
            morse = morse.concat(map.get(x));
        }

        return morse;
    }

    /**
     * Ceebs to input the whole morse code into a map
     * will automate it instead
     * 
     * Solution:
     *  - so delimeter is a space
     *  - loop through alphabet (how?): https://www.programiz.com/java-programming/examples/display-alphabets
     *  - loop through each character after delimeter store code
     *  - use temp values to save data to map.put(x, y)
     *  - reset values of temp values then continue loop
     */

    public static void decodeMorse(Map map){
        String morseCode = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
        char[] tempArr = morseCode.toCharArray();
        char c;
        char tempChar;
        String tempString = "";
        int res;
        int zCheck;
        
        /**
         * The logic here does not work...
         * the loop for the morseCode restarts when it shouldn't...
         */

        // alphabet loop
        for(c = 'a'; c <= 'z'; ++c){
            // tempChar is used 
            tempChar = c;
            for(char x: tempArr){
                res = Character.compare(x, ' ');
                zCheck = Character.compare(x, 'z');
                if(res ==  0 || zCheck == 0){
                    map.put(c, tempString);
                    tempString = "";
                    c++;
                }
                else{
                    tempString = tempString + x;
                }
            }
            map.put(c, tempString);
        }
    }
 }