package com.piotrgrochowiecki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome(121));
        assertTrue(Palindrome.isPalindrome(3443));
        assertTrue(Palindrome.isPalindrome(999));
        assertTrue(Palindrome.isPalindrome(100001));
        assertTrue(Palindrome.isPalindrome(1001001));
    }

    @Test
    public void testIsNotPalindrome() {
        assertFalse(Palindrome.isPalindrome(-213));
        assertFalse(Palindrome.isPalindrome(-414));
        assertFalse(Palindrome.isPalindrome(-1000));
        assertFalse(Palindrome.isPalindrome(-24324));
        assertFalse(Palindrome.isPalindrome(-6547));
        assertFalse(Palindrome.isPalindrome(4564));
        assertFalse(Palindrome.isPalindrome(7684555));
    }
}