package com.piotrgrochowiecki;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        List<Boolean> booleanList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    booleanList.add(true);
                } else {
                    booleanList.add(false);
                }
                i++;
            }
        }
        if (booleanList.contains(false)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
