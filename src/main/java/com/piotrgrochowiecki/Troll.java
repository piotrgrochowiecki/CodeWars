package com.piotrgrochowiecki;

public class Troll {
    public static String disemvowel(String str) {
        String strResult = str.replaceAll("[aeiouAEIOU]", "");
        return strResult;
    }
}
