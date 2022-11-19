package com.piotrgrochowiecki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    @Test
    public void testRomanToInt() {
        assertEquals(1994, RomanNumbers.romanToInt("MCMXCIV"));
        assertEquals(58, RomanNumbers.romanToInt("LVIII"));
        assertEquals(3, RomanNumbers.romanToInt("III"));
    }
}