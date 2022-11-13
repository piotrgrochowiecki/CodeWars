package com.piotrgrochowiecki;

public class ReverseWords {

    public static String reverseWords(String strToBeReversed) {
        String[] strings = strToBeReversed.split(" ");
        if (strings.length == 0) {
            return strToBeReversed;
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new StringBuilder(strings[i]).reverse().toString();
        }
        return String.join(" ", strings);
    }
}
