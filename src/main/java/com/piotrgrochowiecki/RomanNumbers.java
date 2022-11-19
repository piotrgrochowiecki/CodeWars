package com.piotrgrochowiecki;

import java.util.*;

public class RomanNumbers {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>()
        {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int sum = 0;
        int n = s.length();

        for(int i = 0; i < n; i++)
        {
            // If present value is less than next value,
            // subtract present from next value and add the
            // resultant to the sum variable.
            if ((i != n - 1) && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;
            }
            else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
