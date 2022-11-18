package com.piotrgrochowiecki;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testTwoSum1() {
        int[] nums1 = {2, 3, 4};
        int[] expected1 = TwoSum.twoSum(nums1, 6);
        int[] target1 = {0, 2};
        assertArrayEquals(expected1, target1);
    }

    @Test
    public void testTwoSum2() {
        int[] nums2 = {2,7,11,15};
        int[] expected2 = TwoSum.twoSum(nums2, 9);
        int[] target2 = {0,1};
        assertArrayEquals(expected2, target2);
    }

    @Test
    public void testTwoSum3() {
        int[] nums3 = {3,3};
        int[] expected3 = TwoSum.twoSum(nums3, 6);
        int[] target3 = {0,1};
        assertArrayEquals(expected3, target3);
    }

    @Test
    public void testTwoSum4() {
        int[] nums4 = {2,5,5,11};
        int[] expected4 = TwoSum.twoSum(nums4, 10);
        int[] target4 = {1,2};
        assertArrayEquals(expected4, target4);
    }
}