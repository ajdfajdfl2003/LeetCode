package com.angus.leetcode.LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;

public class Solution {
    public static Solution newInstance() {
        return new Solution();
    }

    public int lengthOfLongestSubstring(String s) {
        return (int) s.chars().distinct().count();
    }
}
