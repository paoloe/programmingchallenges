package main.java.challenges;


/**
 * Challenge 3 : Find all instances of repeating nums
 * Author: Paolo Espiritu 
 * Source: https://www.reddit.com/r/dailyprogrammer/comments/7eh6k8/20171121_challenge_341_easy_repeating_numbers/
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
        idea5("11325992321982432123259");
    }

    /**
     * Idea 5: Help from Almas
     *  1) create an upper (length - 1) / lower bound values
     *  2) create a substring from the lower bound
     *  3) shift the bounds by 1 and compare it to the original bound
     *  4) if match save into a map substring as key, value as counter
     */
    public static void idea5(String input){
        int lbound = 0;
        int ubound = input.length() - 1;
        String subString = "";
        String comparator = "";

        while(ubound > lbound){
            subString = input.substring(lbound, ubound);
            comparator = input.substring(ubound);
        
            ubound--;
        }


        System.out.println(comparator);
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

    /**
     * String input
     * counter that returns at 2
     * temp string that holds 2 chars at a time
     * loop through the string and compare temp
     * deduct one from the returned duplicates as it will iterate over itself once
     */
    public static void idea4(String input){
        char[] inputArr = input.toCharArray();
        int counter = 0;
        String temp = "";
        String comparator = "";

        // this loop saves strings 2 chars at a time
        for(char x : inputArr){
            if(counter == 2){
                counter = 0;
                return;
            }
            else{
                temp += x;
                counter++;
            }
        }

        // this loop was intended compare temp to the whole string
        for(char x : inputArr){
            if(counter == 2){
                counter = 0;
                compare(temp, comparator);
            }
            else{
                comparator += x;
                counter++;
            }
        }

        /**
         * The above isn't going to work as you to store the temp string and along with it
         * you also need to work include the counter for the occurences of that particular
         * string!
         */
    }

    public static int compare(String obj1, String obj2) {
        if (obj1 == obj2) {
            return 0;
        }
        if (obj1 == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return obj1.compareTo(obj2);
    }
}