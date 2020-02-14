package main.java.challenges;


/**
 * Challenge 3 : Find all instances of repeating nums
 * Author: Paolo Espiritu 
 * Source: https://www.reddit.com/r/dailyprogrammer/comments/cmd1hb/20190805_challenge_380_easy_smooshed_morse_code_1/
 */

class repeatingNums {
    /**
     * Brief: Given a input = 11325992321982432123259
     *  - 321 gets repeated 2 times
     *  - 32 gets repeated 4 times
     *  - 21 gets repeated 2 times
     *  - 3259 gets repeated 2 times
     *  - 25 gets repeated 2 times
     *  - 59 gets repeated 2 times
     * 
     * Output should be:
     *  - RepeatingNumber1:x RepeatingNumber2:y
     *  - If no repeating digits exist, then display 0.
     */
    public static void main(String[] args){

    }

    /**
     * Initial thoughts:
     *  1) can I use regex for this?
     *  2) build a map of all possible combinations?
     *  3) start from index 0, select first two chars, loop through the string forward comparing
     *      two strings to the next two chars and repeat until the end of the string?
     */
    public void idea3(){
        int dupCounter;
        String comparator;
    }

}